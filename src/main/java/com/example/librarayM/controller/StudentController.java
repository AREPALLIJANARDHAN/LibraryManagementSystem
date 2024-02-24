package com.example.librarayM.controller;

import com.example.librarayM.model.Student;
import com.example.librarayM.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        Student student1 = studentService.addStudent(student);
        return student1;
    }

    @GetMapping("/findStudent/{id}")
    public ResponseEntity findStudent(@PathVariable("id") Integer StudentId) throws Exception {
        try {
            Student student2 = studentService.findStudent(StudentId);
            return new ResponseEntity(student2, HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/allStudents")
    public ResponseEntity findAllStudents() {
        return new ResponseEntity(studentService.findAllStudents(),HttpStatus.OK);
    }
    @GetMapping("/allECEStudents")
    public List<Student> findDeptStudents (){
        List<Student> deptStudents=studentService.findDeptStudents();
        return deptStudents;
    }
    @GetMapping("/assignCard")
    public String assignCard(@RequestParam ("librarycardId")Integer librarycardId,
                             @RequestParam ("studentId")Integer StudentId) throws Exception
    {
        try {
            String res = studentService.assignCard(librarycardId, StudentId);
            return res;
        }
        catch(Exception e){
            return e.getMessage();

        }
    }
}
