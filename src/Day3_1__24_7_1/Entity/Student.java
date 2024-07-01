package Day3_1__24_7_1.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    ArrayList<CourseOnline> courseOnline;
    int studentId;
    String studentName;
    Date studentDoB;
    List<Integer> idCourse;

    public Student(int studentId, String studentName, Date studentDoB) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentDoB = studentDoB;
        this.idCourse = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getStudentDoB() {
        return studentDoB;
    }

    public void setStudentDoB(Date studentDoB) {
        this.studentDoB = studentDoB;
    }
    public ArrayList<CourseOnline> getCourseOnline() {
        return courseOnline;
    }
    public void setCourseOnline(ArrayList<CourseOnline> courseOnline) {
        this.courseOnline = courseOnline;
    }

    public String toString(){
        return "Student Id:"  + studentId
                + "\nStudent Name:"  + studentName
                + "\nStudent DoB:"  + studentDoB
                + "\nStudent Name:"  + studentName
                + "\nCourseOnlines:"  + courseOnline
                + "\n\n";
    }

}
