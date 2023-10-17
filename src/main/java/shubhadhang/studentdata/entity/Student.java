package shubhadhang.studentdata.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString

@Entity(name = "Student-jpa")
public class Student {
    @Getter
    @Id
    private int id;

    @Setter
    @Column(nullable = false,length = 100)
    private String firstName;

    @Setter
    @Column(nullable = false,length = 100)
    private String lastName;

    @Setter
    @Column(nullable = false,length = 100,unique = true)
    private  String email;

    private boolean status;
    private LocalDateTime dateTime;
}
