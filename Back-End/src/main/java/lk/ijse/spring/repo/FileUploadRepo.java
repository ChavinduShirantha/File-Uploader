package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Chavindu
 * created : 10/31/2023-12:57 PM
 **/

public interface FileUploadRepo extends JpaRepository<Image,String> {
}
