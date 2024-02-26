package com.example.librarayM.model;

import com.example.librarayM.Enum.Department;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "book")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;
    private String bookName;
    @Enumerated(value = EnumType.STRING)
    private Department department1;

    @OneToOne
    @JoinColumn
    private Author author;

}
