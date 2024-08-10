package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Room implements Serializable {
    private static final long serialVersionUID = 1L;
    static Scanner sc = new Scanner(System.in);
    private String number;
    private int capacity;
    private boolean isEmpty;
    private ArrayList<Course> courseInRoom;

    public Room() {
        courseInRoom = new ArrayList<>();
    }

    public Room(String number, int capacity, boolean isEmpty, ArrayList<Course> courseInRoom) {
        this.number = number;
        this.capacity = capacity;
        this.isEmpty = isEmpty;
        this.courseInRoom = courseInRoom;
    }

    public ArrayList<Course> getCourseInRoom() {
        return courseInRoom;
    }

    public void setCourseInRoom(ArrayList<Course> courseInRoom) {
        this.courseInRoom.addAll(courseInRoom);
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

    public void addRoom() {
        System.out.println("Enter number : ");
        setNumber(sc.nextLine());
        System.out.println("Enter capacity : ");
        setCapacity(sc.nextInt());
        System.out.println("Enter status of room (only use true or false)");
        setEmpty(sc.nextBoolean());
        sc.nextLine();
    }

    @Override
    public String toString() {
        return "Number: " + number + "\nCapacity: " + capacity + "\nisEmpty: " + isEmpty;
    }

    public void WriteFileCourseInRoom() {
        try {
            FileOutputStream file = new FileOutputStream("courseInRoom.dat");
            try (ObjectOutputStream oos = new ObjectOutputStream(file)) {
                for (Course course : courseInRoom) {
                    oos.writeObject(course);
                }
            }
        } catch (IOException e) {
            System.out.println("Error Write File");
        }
    }
    public void ReadFileCourseInRoom(){
        try{
            FileInputStream file = new FileInputStream("courseInRoom.dat");
            try(ObjectInputStream ois = new ObjectInputStream(file)){
                Course c = null;
                while ((c = (Course)ois.readObject()) != null){
                    courseInRoom.add(c);
                }
            }
        } catch (ClassNotFoundException e){
            System.out.println("Class Not Found");
        } catch (IOException e){
            System.out.println("Error Read File");
        }
    }

}
