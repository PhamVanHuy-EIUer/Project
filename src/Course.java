import java.util.ArrayList;

import java.util.Scanner;

public class Course extends StudentManagement{
    static Scanner sc = new Scanner(System.in);
    private String code;
    private String name;
    private double fee;
    private double scoreToPass;
    private String day;
    private ArrayList<Student> studentInCourse;
    private ArrayList<Teacher> teacherInCourse;

    public Course() {
        studentInCourse = new ArrayList<>();
        teacherInCourse = new ArrayList<>();
    }



    public Course( ArrayList<Student> studentInCourse, ArrayList<Teacher> teacherInCourse) {
        this.studentInCourse = studentInCourse;
        this.teacherInCourse = teacherInCourse;
    }



    public ArrayList<Teacher> getTeacherInCourse() {
        return teacherInCourse;
    }



    public void setTeacherInCourse(ArrayList<Teacher> t) {
        this.teacherInCourse = t;
    }



    public ArrayList<Student> getStudentInCourse() {
        return studentInCourse;
        
    }



    public void setStudentInCourse(ArrayList<Student> s) {
        this.studentInCourse = s;
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

    

    public double getScoreToPass() {
        return scoreToPass;
    }

    public void setScoreToPass(double scoreToPass) {
        this.scoreToPass = scoreToPass;
    }


    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
    public void isPass(){
        for(Student student : studentInCourse){
            if(student.getScore() > scoreToPass){
                System.out.println(student.getName() + " : Pass course.");
            }
            else {
                System.out.println(student.getName() +" : Fail course.");
            }
        }
    }
    public void addCourse() {
        
        System.out.println("Enter code");
        setCode(sc.nextLine());
        System.out.println("Enter Name");
        setName(sc.nextLine());
        System.out.println("Enter day : ");
        setDay(sc.nextLine());
        System.out.println("Enter score to pass : ");
        setScoreToPass(sc.nextDouble());
        sc.nextLine();
    }



    @Override
    public String toString() {
        return "Course [code=" + code + ", name=" + name + ", fee=" + fee + ", timeStart=" + ", scoreToPass=" + scoreToPass + ", day=" + day + ", studentInCourse=" + studentInCourse
                + ", teacherInCourse=" + teacherInCourse + "]";
    }
    
}
