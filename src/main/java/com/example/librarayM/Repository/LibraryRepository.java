package com.example.librarayM.Repository;

import com.example.librarayM.model.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<LibraryCard,Integer> {

}
