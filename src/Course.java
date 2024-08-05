import java.util.ArrayList;
import java.util.Scanner;

public class Course extends StudentManagement {
    Scanner sc = new Scanner(System.in);
    private String code;
    private String name;
    private double fee;
    private String timeStart;
    private String timeEnd;
    private double scoreToPass;
    private String day;

    public Course() {
    }

    public Course(ArrayList<Student> students, ArrayList<Teacher> teachers, ArrayList<Course> courses,
            ArrayList<Room> rooms) {
        super(students, teachers, courses, rooms);
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

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public double getScoreToPass() {
        return scoreToPass;
    }

    public void setScoreToPass(double scoreToPass) {
        this.scoreToPass = scoreToPass;
    }

    public boolean isPass(double score) {
        return score >= scoreToPass;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void addCourse() {
        System.out.println("Enter code");
        setCode(sc.nextLine());
        System.out.println("Enter Name");
        setName(sc.nextLine());
        System.out.println("Enter day : ");
        setDay(sc.nextLine());
        System.out.println("Enter time start : ");
        setTimeStart(sc.nextLine());
        System.out.println("Enter time end : ");
        setTimeEnd(sc.nextLine());
        System.out.println("Enter score to Pass");
        setScoreToPass(sc.nextDouble());
    }

}
