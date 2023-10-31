package lk.ijse.spring.service;

import lk.ijse.spring.dto.ImageDTO;

import java.util.ArrayList;

/**
 * @author : Chavindu
 * created : 10/31/2023-12:57 PM
 **/

public interface FileUploadService {
    void save(ImageDTO dto);
    ArrayList<ImageDTO> getAll();
}
