package Day3_1__24_7_1.Model;

public abstract class Course {
    int courseId;
    String courseName;
    String mentorName;
    int credit;

    public Course(int courseId, String courseName, String mentorName, int credit) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.mentorName = mentorName;
        this.credit = credit;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
