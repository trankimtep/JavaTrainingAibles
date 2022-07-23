import java.nio.charset.CoderResult;
import java.util.Scanner;

import entity.Student;
import service.imp.StudentServiceImplementation;

public class Application {
    public static void main(String[] args) {

        StudentServiceImplementation studentServiceImplementation = new StudentServiceImplementation();

        while(true){
            System.out.println("Menu:");
            System.out.println("    1: Add new student");
            System.out.println("    2: Delete student");
            System.out.println("    3: Update student");
            System.out.println("    4: Print list student");
            System.out.println("    5: Exit");
            System.out.print("Your option is:");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            System.out.println("");

            switch(option){
                case 1:
                    System.out.println("Enter student info:");
                    System.out.print("id = ");
                    String id = scanner.next();
                    String tem1 = scanner.nextLine();
                    System.out.print("name = ");
                    String name = scanner.nextLine();
                    //String tem2 = scanner.nextLine();
                    System.out.print("score = ");
                    String score = scanner.next();
                    Student newStudent = new Student(id, name , score);
                    studentServiceImplementation.addStudent(newStudent);
                    break;

                case 2:
                    System.out.println("Enter the id need delete:");
                    int idNeedDelete = scanner.nextInt();
                    studentServiceImplementation.deleteStudent(idNeedDelete);
                    break;

                case 3:
                    System.out.println("Enter student info:");
                    System.out.print("id = ");
                    id = scanner.next();
                    tem1 = scanner.nextLine();
                    System.out.print("name = ");
                    name = scanner.nextLine();
                    //String tem2 = scanner.nextLine();
                    System.out.print("score = ");
                    score = scanner.next();
                    newStudent = new Student(id, name , score);
                    studentServiceImplementation.updateStudent(Integer.parseInt(id), newStudent);
                    break;

                case 4:
                    studentServiceImplementation.printListStudent();
                    break;
                
                case 5:
                    System.exit(0);
            }
        }
        
    }
}
