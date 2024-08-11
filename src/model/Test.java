package model;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();
        Course c = new Course();
        Room r = new Room();
        sm.ReadStudents();
        sm.ReadTeachers();
        sm.ReadCourses();
        sm.ReadRooms();
        c.FileReadStudentInCourse();
        c.FileReadTeacherInCourse();
        r.ReadFileCourseInRoom();
        
        // sm.addCourses();
        // sm.addStudents();
        //  sm.addTeachers();
        // sm.addRooms();
        int n;
        do{
            System.out.println("Add new students: ");
            System.out.println("Add new teachers: ");
            System.out.println("Add new courses: ");
            System.out.println("Add new rooms: ");
            System.out.println("Search information of Student: ");
            System.out.println("Search information of Teacher: ");
            System.out.println("Search information of Course: ");
            System.out.println("Searcher information of Room: ");
            System.out.println("Sort list Teachers: ");

            System.out.println("Enter option: ");
            System.out.println("Need to enter list of courses before.");
             n = sc.nextInt();
            switch (n) {
                case 1 -> {
                    sm.addStudents();
                    sm.addStudentsInCourse();
                    sm.WriteStudents();
                    c.FileWriteStudentInCourse();
                    break;
                }
                case 2->{
                    sm.addTeachers();
                    sm.addTeachersInCourse();
                    sm.WriteTeachers();
                    c.FileWriteTeacherInCourse();
                    break;
                }
                case 3 ->{
                    sm.addCourses();
                    sm.WriteCourses();
                    break;
                }
                case 4->{
                    sm.addRooms();
                    sm.WriteRooms();
                    break;
                }
                case 5 -> {
                    sm.removeStudents();
                    sm.WriteStudents();
                    break;
                }
                case 6 -> {
                    sm.searchTeacher();
                    break;
                }
                case 7 -> {
                    sm.searchCourse();
                    break;
                }
                case 8 -> {
                    sm.searchRoom();
                    break;
                }
                case 9 -> {
                    sm.sortStudents();
                    sm.WriteStudents();
                    break;
                }
                case 10 ->{
                    sm.sortTeacher();
                    sm.WriteTeachers();
                    break;
                }
                case 11->{
                    sm.courseInRoom();
                    r.WriteFileCourseInRoom();
                }
            }
        }while(n>= 1 && n <= 11);
        System.out.println("FINISHED");
    }
}
