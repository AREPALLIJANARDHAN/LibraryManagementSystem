package com.example.librarayM.model;

import com.example.librarayM.Enum.cardstatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    public Integer getCardid() {
        return cardid;
    }

    public void setCardid(Integer cardid) {
        this.cardid = cardid;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public cardstatus getCardstatus1() {
        return cardstatus1;
    }

    public void setCardstatus1(cardstatus cardstatus1) {
        this.cardstatus1 = cardstatus1;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
