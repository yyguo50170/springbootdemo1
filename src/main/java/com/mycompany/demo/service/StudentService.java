package com.mycompany.demo.service;

import com.mycompany.demo.model.Student;
import com.mycompany.demo.tools.UniversalResponseBody;


public interface StudentService {
    UniversalResponseBody getStudentById(String id);

    UniversalResponseBody getAllStudents();

    UniversalResponseBody insertStudent(Student student);

    UniversalResponseBody deleteStudentById(String id);

    UniversalResponseBody updateStudentById(Student id);
}
