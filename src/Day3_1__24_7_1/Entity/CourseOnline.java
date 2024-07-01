package Day3_1__24_7_1.Entity;

import Day3_1__24_7_1.Model.Course;

import java.sql.Time;
import java.util.ArrayList;

public class CourseOnline extends Course {
    static ArrayList<Student> students;
    String platform;
    Time duration;

    public CourseOnline(int courseId, String courseName, String mentorName, int credit, String platform, Time duration) {
        super(courseId, courseName, mentorName, credit);
        this.platform = platform;
        this.duration = duration;
        students = new ArrayList<>();
    }



    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    public String toString() {
        return "Course ID: "+ getCourseId()
                + "\nCourse Name: "+ getCourseName()
                + "\nMentor Name: "+ getMentorName()
                + "\nCredit: "+ getCredit()
                + "\nPlatform: "+ getPlatform()
                + "\nDuration: "+ getDuration()
                + "\nStudents: "+ getStudents()
                + "\n\n";
    }
}
