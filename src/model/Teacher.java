package model;
import java.util.Scanner;

public class Teacher extends Person{
    private static final long serialVersionUID = 1L;
    private double kpa;
    static Scanner sc = new Scanner(System.in);
    public Teacher() {
        
    }

    public Teacher(String name, String id, String gender, String dateOfBirth, String address, String major,
            double kpa) {
        super(name, id, gender, dateOfBirth, address, major);
        this.kpa = kpa;
    }

    public double getKpa() {
        return kpa;
    }

    public void setKpa(double kpa) {
        this.kpa = kpa;
    }
    public boolean isPass(double scoreToPass){
        if(kpa >= scoreToPass){
            return true;
        }
        return false;
    }

    @Override
    public void Input() {
        super.Input();
        System.out.println("Enter KPA : ");
        setKpa(sc.nextDouble());
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("KPA : " + getKpa());
    }
    

    
}
