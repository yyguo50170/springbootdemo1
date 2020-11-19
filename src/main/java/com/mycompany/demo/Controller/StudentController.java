package com.mycompany.demo.Controller;


import com.mycompany.demo.model.Student;
import com.mycompany.demo.service.impl.StudentServiceImpl;
import com.mycompany.demo.tools.UniversalResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentServiceImpl studentServiceImpl;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello!";
    }

    @RequestMapping("/getStudentById")
    public UniversalResponseBody getStudentById(String id){
        return studentServiceImpl.getStudentById(id);
    }

    @RequestMapping("/getAllStudents")
    public UniversalResponseBody getAllStudents(){
        return studentServiceImpl.getAllStudents();
    }

    @RequestMapping("/insertStudent")
    public UniversalResponseBody insertStudent(Student student){
        return studentServiceImpl.insertStudent(student);
    }

    @RequestMapping("/deleteStudentById")
    public UniversalResponseBody deleteStudentById(String id){
        return studentServiceImpl.deleteStudentById(id);
    }
    @RequestMapping("/updateStudentById")
    public UniversalResponseBody updateStudentById(Student student){
        return studentServiceImpl.updateStudentById(student);
    }

}
