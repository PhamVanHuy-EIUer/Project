import java.util.ArrayList;

import java.util.Scanner;

public class Course extends StudentManagement{
    Scanner sc = new Scanner(System.in);
    private String code;
    private String name;
    private double fee;
    private String timeStart;
    private String timeEnd;
    private double scoreToPass;
    private String day;
    private ArrayList<Student> studentsInCourse;

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

    public ArrayList<Student> setStudentsInCourse(ArrayList<Student> students){
        studentsInCourse = new ArrayList<>();
        System.out.println("Enter number of students : ");
        int n =sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter student ID to add to course: ");
            String id = sc.nextLine();
            for (Student student : students) {
                if (student.getId().equals(id)) {
                    studentsInCourse.add(student);
                    break;
                }
            }
        }
        return studentsInCourse;
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
        sc.nextLine();
    }

}
