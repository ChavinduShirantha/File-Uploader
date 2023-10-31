package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.ImageDTO;
import lk.ijse.spring.entity.Image;
import lk.ijse.spring.repo.FileUploadRepo;
import lk.ijse.spring.service.FileUploadService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

/**
 * @author : Chavindu
 * created : 10/31/2023-12:57 PM
 **/
@Service
@Transactional
public class FileUploadServiceImpl implements FileUploadService {
    @Autowired
    FileUploadRepo repo;
    @Autowired
    ModelMapper mapper;
    @Override
    public void save(@ModelAttribute ImageDTO dto) {
        Image img = new Image("");

        try {
            String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();
            File uploadsDir = new File(projectPath + "/uploads");
            System.out.println(projectPath);
            uploadsDir.mkdir();

            dto.getUpload().transferTo(new File(uploadsDir.getAbsolutePath() + "/" + dto.getUpload().getOriginalFilename()));

            img.setUpload("uploads/" + dto.getUpload().getOriginalFilename());

        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
        System.out.println(img);
        repo.save(img);
    }

    @Override
    public ArrayList<ImageDTO> getAll() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<Image>>() {
        }.getType());
    }
}
