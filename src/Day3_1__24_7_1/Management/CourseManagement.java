package Day3_1__24_7_1.Management;

import Day3_1__24_7_1.Entity.CourseOnline;
import Day3_1__24_7_1.Entity.Student;
import Day3_1__24_7_1.Model.Course;

import java.util.ArrayList;
import java.util.Scanner;

public class CourseManagement {
    ArrayList<CourseOnline> courses = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Integer> idCourse = new ArrayList<>();

    public void addIDtoCourse(Course course) {
        for(CourseOnline c : courses) {
            idCourse.add(c.getCourseId());
        }
    }

    public void showDetailStudentAndCourse(){
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (Student s : students) {
            if (id == s.getStudentId()){
                System.out.println(s);
                for(CourseOnline c : courses){
                    System.out.println(c.toString());
                }
            }
        }
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public void showDetailCourse ( ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter course id: ");
        int id = sc.nextInt();
        for (CourseOnline c : courses) {
            if(id == c.getCourseId()){
                System.out.println(c);
            }
        }
    }

    public void addCourse(CourseOnline c){
        courses.add(c);
    }

}
