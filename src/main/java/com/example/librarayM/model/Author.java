package com.example.librarayM.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "author")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer authorId;
    private String authorName;

    @OneToMany(mappedBy = "author",cascade =CascadeType.ALL)
    private List<Book> bookList=new ArrayList<>();

}
