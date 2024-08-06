import java.util.ArrayList;
import java.util.Scanner;

public class Room extends Course{
    static Scanner sc = new Scanner(System.in);
    private String number;
    private int capacity;
    private boolean isEmpty;
    private ArrayList<Course> courseInRoom;

    public Room(String number, int capacity, boolean isEmpty) {
        this.number = number;
        this.capacity = capacity;
        this.isEmpty = isEmpty;
    }
    public Room() {
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public boolean isEmpty() {
        return isEmpty;
    }
    public void setEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }
    public void addRoom(){
        System.out.println("Enter number : ");
        setNumber(sc.nextLine());
        System.out.println("Enter capacity : ");
        setCapacity(sc.nextInt());
        setEmpty(true);
        sc.nextLine();
    }
    
    
}
