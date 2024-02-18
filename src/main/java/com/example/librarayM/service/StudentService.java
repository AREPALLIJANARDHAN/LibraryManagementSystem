package com.example.librarayM.service;

import com.example.librarayM.Repository.StudentRepository;
import com.example.librarayM.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public Student addStudent(Student student){
        studentRepository.save(student);
        return student;
    }

    public Student findStudent(Integer StudentId) throws Exception{
        Optional<Student> optionalStudent=studentRepository.findById(StudentId);
        if(optionalStudent.isEmpty()){
            throw new Exception("doesn't exist");
        }
        return optionalStudent.get();
    }
    public List<Student> findAllStudents() {
        List<Student> optionalStudent1=studentRepository.findAll();

        return optionalStudent1;

    }
    public List<Student> findDeptStudents(){
        List<Student> deptStudents=studentRepository.findAll();
        List<Student> ece=new ArrayList<>();
        for(Student department:deptStudents){
            if(department.getDepartment().equals("ECE")){
                ece.add(department);

            }
        }
        return ece;
    }
}
