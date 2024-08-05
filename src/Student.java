import java.util.Scanner;

public class Student extends Person {
    static Scanner sc = new Scanner(System.in);
    private double score;
    private double tuitionFee;
    public Student() {
    }
    public Student(String name, String id, String gender, String dateOfBirth, String address, String major,
            double score, double tuitionFee) {
        super(name, id, gender, dateOfBirth, address, major);
        this.score = score;
        this.tuitionFee = tuitionFee;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public double getTuitionFee() {
        return tuitionFee;
    }
    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }
    @Override
    public void Input() {
        super.Input();
        System.out.println("Enter Score : ");
        setScore(sc.nextDouble());
    }
    @Override
    public void Output() {
        super.Output();
        System.out.println("Score : " + getScore());
    }

    
}
