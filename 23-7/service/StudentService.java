package service;

import entity.Student;

public interface StudentService {
    public void addStudent(Student student);
    
    public void deleteStudent(int id);

    public void updateStudent(int id, Student newStudent);

    public void printListStudent();

    public Student findById(int id);
}
