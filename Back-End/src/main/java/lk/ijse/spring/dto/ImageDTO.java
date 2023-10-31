package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author : Chavindu
 * created : 10/31/2023-12:56 PM
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ImageDTO {
    private MultipartFile upload;
}
