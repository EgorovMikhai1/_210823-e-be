package main.java.org.example._2024_03_27;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "author")
public class Author {

    @Id
    @Column
    private int id;

    @Column
    private String name;
}
