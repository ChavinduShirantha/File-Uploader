package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author : Chavindu
 * created : 10/31/2023-12:55 PM
 **/
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Image {
    @Id
    private String upload;
}
