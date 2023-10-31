package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ImageDTO;
import lk.ijse.spring.service.FileUploadService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Chavindu
 * created : 10/31/2023-1:01 PM
 **/
@RestController
@RequestMapping("/upload")
@CrossOrigin
public class FileUploadController {
    @Autowired
    FileUploadService service;

    @PostMapping
    public ResponseUtil saveDriver(@ModelAttribute ImageDTO dto){
        service.save(dto);
        return new ResponseUtil("Ok","Successfully Added",null);
    }

    @GetMapping
    public ResponseUtil getAll(){
        return new ResponseUtil("Ok","Successfully Loaded",service.getAll());
    }

}
