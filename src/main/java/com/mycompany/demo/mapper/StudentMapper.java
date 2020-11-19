package com.mycompany.demo.mapper;


import com.mycompany.demo.model.Student;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface StudentMapper {
    Student getStudentById(String id);

    List<Student> getAllStudents();

    int insertStudent(Student student);

    int deleteStudentById(String id);

    int updateStudentById(Student id);
}
