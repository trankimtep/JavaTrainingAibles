package service.imp;

import java.util.ArrayList;
import java.util.Collections;

import entity.Student;
import service.StudentService;
public class StudentServiceImplementation  implements StudentService {

    private static ArrayList<Student> students = new ArrayList<Student>();

    static {
        students.add(new Student("1", "Nguyen Van A", "1.2"));
        students.add(new Student("2", "Nguyen Van B", "2.3"));
        students.add(new Student("3", "Nguyen Van C", "3.4"));
        students.add(new Student("4", "Nguyen Van D", "4.5"));
        students.add(new Student("5", "Nguyen Van E", "5.6"));
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void deleteStudent(int id) {
        // TODO Auto-generated method stub
        while (findById(id) != null)
            students.remove(findById(id));      
    }

    @Override
    public void updateStudent(int id, Student newStudent) {
        // TODO Auto-generated method stub
        students.remove(findById(id));
        students.add(newStudent);       
    }

    @Override
    public void printListStudent() {
        // TODO Auto-generated method stub
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public Student findById(int id) {
        // TODO Auto-generated method stub
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }  
        return null;
    }
}
