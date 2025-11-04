package ch.bzz;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "project")
@Data
public class project {

    @Id
    @Column(name = "projectName", nullable = false, unique = true, length = 100)
    private String projectName;

    @Column(name = "passwordHash", nullable = false, length = 255)
    private String passwordHash;
}