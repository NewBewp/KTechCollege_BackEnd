package Day3_1__24_7_1;

import Day3_1__24_7_1.Entity.CourseOnline;
import Day3_1__24_7_1.Entity.Student;
import Day3_1__24_7_1.Management.CourseManagement;


import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> idCourse = new ArrayList<>();
        CourseManagement courseManagement = new CourseManagement();

        courseManagement.addCourse(new CourseOnline(1, "Java Programming", "Dr. Smith", 4, "Zoom", Time.valueOf("01:30:00")));
        courseManagement.addCourse(new CourseOnline(2, "Data Structures", "Dr. Brown", 3, "Google Meet", Time.valueOf("01:00:00")));
        courseManagement.showDetailStudentAndCourse();


//        // Sample student data
       Student student1 = new Student(1, "John Doe", new Date(100, 0, 15)); // Date(year-1900, month-1, day)
       Student student2 = new Student(2, "Jane Smith", new Date(101, 2, 20));



//        studentManagement.addStudent(student1);
//        studentManagement.addStudent(student2);
//        // Show details of students
//        studentManagement.showDetailStudent();

    }
}
