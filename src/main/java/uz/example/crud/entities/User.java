package uz.example.crud.entities;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import uz.example.crud.utils.TableName;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = TableName.USERS)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;

    private String lastName;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date birthDay;

    @Column(unique = true)
    private String phone;

    private String address;

    private LocalDateTime createDate;

    private LocalDateTime updateTime;
}
