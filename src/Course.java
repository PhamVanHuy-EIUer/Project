import java.util.ArrayList;

public class Course extends StudentManagement{
    private String code;
    private String name;
    private double fee;
    private String day;
    private String time;
    private double scoreToPass;
    private ArrayList<Student> numStudentInCourse = new ArrayList<>();
    public Course() {
    }
    
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public ArrayList<Student> getNumStudentInCourse() {
        return numStudentInCourse;
    }
    public void setNumStudentInScore(ArrayList<Student> numStudentInCourse) {
        this.numStudentInCourse = numStudentInCourse;
    }
    public double getScoreToPass() {
        return scoreToPass;
    }
    public void setScoreToPass(double scoreToPass) {
        this.scoreToPass = scoreToPass;
    }
    public boolean isPass(double score){
        if(score > scoreToPass)
            return true;
        return false;
    }
    
    @Override
    public String toString() {
        return "Course [code=" + code + ", name=" + name + ", fee=" + fee + ", day=" + day + ", time=" + time
                + ", scoreToPass=" + scoreToPass + ", numStudentInScore=" + numStudentInCourse + "]";
    }
    
}
