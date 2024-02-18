package com.example.librarayM.model;

import com.example.librarayM.Enum.cardstatus;
import jakarta.persistence.*;

@Entity
@Table(name="librarycard")
public class LibrarayCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cardid;
    private String collegename;
    @Enumerated(value = EnumType.STRING)
private cardstatus cardstatus1;

@OneToOne
@JoinColumn
    private Student student;
}
