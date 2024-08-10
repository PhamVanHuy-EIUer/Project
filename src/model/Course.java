package model;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Course implements Serializable{
    private static final long serialVersionUID = 1L;
    static Scanner sc = new Scanner(System.in);
    private String name;
    private String code;
    private double fee;
    private double scoreToPass;
    private String day;
    private double kpaJustice;
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



    public void setTeacherInCourse(Teacher t) {
        this.teacherInCourse.add(t);
    }



    public ArrayList<Student> getStudentInCourse() {
        return studentInCourse;
        
    }



    public void setStudentInCourse(Student s) {
        this.studentInCourse.add(s);
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


    public double getKpaJustice() {
        return kpaJustice;
    }



    public void setKpaJustice(double kpaJustice) {
        this.kpaJustice = kpaJustice;
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
        System.out.println("Enter score to pass : ");
        setScoreToPass(sc.nextDouble());
        System.out.println("Enter KPA for course: ");
        setKpaJustice(sc.nextDouble());
        sc.nextLine();
    }



    @Override
    public String toString() {
        return "Name: " + name + "\nCode: " + code + "\nFee=" + fee + "\nScoreToPass=" + scoreToPass + "\nDay="
                + day + "\nKpaJustice=" + kpaJustice ;
    }

    public void FileWriteStudentInCourse(){
        try{
            FileOutputStream file = new FileOutputStream("studenInCourse");
            try(ObjectOutputStream oos = new ObjectOutputStream(file)){
                for(Student st : studentInCourse){
                    oos.writeObject(st);
                }
            }
        } catch (IOException e) {
            System.out.println("Error Write File");
        }
    }
    public void FileReadStudentInCourse(){
        try{
            FileInputStream file = new FileInputStream("studentInCourse.dat");
            try(ObjectInputStream ois = new ObjectInputStream(file)){
                Student st =null;
                while((st = (Student)ois.readObject()) != null){
                    studentInCourse.add(st);
                }
            }
        } catch (ClassNotFoundException e){
            System.out.println("Class Not Found");
        }catch(IOException e){
            System.out.println("Error Read File");
        }
    } 
    public void FileWriteTeacherInCourse(){
        try{
            FileOutputStream file = new FileOutputStream("teacherInCourse.dat");
            try(ObjectOutputStream oos = new ObjectOutputStream(file)){
                for(Teacher teacher : teacherInCourse){
                    oos.writeObject(teacher);
                }
            }
        } catch(IOException e){
            System.out.println("Error Write File");
        }
    }
    public void FileReadTeacherInCourse(){
        try{
            FileInputStream file = new FileInputStream("teacherInCourse.dat");
            try(ObjectInputStream ois = new ObjectInputStream(file)){
                Teacher t = null;
                while((t = (Teacher)ois.readObject()) != null){
                    teacherInCourse.add(t);
                }
            }
        }catch(ClassNotFoundException e){
            System.out.println("Class Not Found ");
        }catch (IOException e){
            System.out.println("Error Read File");
        }
    }
}

