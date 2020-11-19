package com.mycompany.demo.service.impl;


import com.mycompany.demo.mapper.StudentMapper;
import com.mycompany.demo.model.Student;
import com.mycompany.demo.service.StudentService;
import com.mycompany.demo.tools.UniversalResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public UniversalResponseBody getStudentById(String id) {
        Student student = studentMapper.getStudentById(id);
        if(student==null){
            return new UniversalResponseBody(0,"该学生不存在");
        }
        System.out.println(student);
        return new UniversalResponseBody(1,"成功找到该学生",student);
    }

    @Override
    public UniversalResponseBody getAllStudents() {
        List<Student> studentList = studentMapper.getAllStudents();
        if(studentList.size()!=0){
            System.out.println(studentList);
            return new UniversalResponseBody(1,"成功找到所有学生",studentList);
        }
        return new UniversalResponseBody(0,"学生总数为0");
    }

    @Override
    public UniversalResponseBody insertStudent(Student student) {
        int res = studentMapper.insertStudent(student);
        if(res==1){
            return new UniversalResponseBody(1,"添加学生成功");
        }
        return new UniversalResponseBody(0,"添加学生失败");
    }

    @Override
    public UniversalResponseBody deleteStudentById(String id) {
        int res = studentMapper.deleteStudentById(id);
        if(res==1){
            return new UniversalResponseBody(1,"删除学生成功");
        }
        return new UniversalResponseBody(0,"删除学生失败");
    }

    @Override
    public UniversalResponseBody updateStudentById(Student id) {
        int res = studentMapper.updateStudentById(id);
        if(res==1){
            return new UniversalResponseBody(1,"修改学生信息成功");
        }
        return new UniversalResponseBody(0,"修改学生失败");
    }
}
