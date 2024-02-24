package com.example.librarayM.model;

import com.example.librarayM.Enum.cardstatus;
import jakarta.persistence.*;

@Entity
@Table(name="librarycard")
public class LibraryCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cardid;
    private String collegename;
    @Enumerated(value = EnumType.STRING)
private cardstatus cardstatus1;

@OneToOne
@JoinColumn
private Student student;
}
