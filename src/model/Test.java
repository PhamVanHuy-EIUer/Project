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
            System.out.println("1.Add new students: ");
            System.out.println("2.Add new teachers: ");
            System.out.println("3.Add new courses: ");
            System.out.println("4.Add new rooms: ");
            System.out.println("5.Search information of Student: ");
            System.out.println("6.Search information of Teacher: ");
            System.out.println("7.Search information of Course: ");
            System.out.println("8.Searcher information of Room: ");
            System.out.println("9.Sort list Students: ");
            System.out.println("10.Sort list Teachers: ");
            System.out.println("11.List of Students: ");
            System.out.println("12.List of teachers: ");
            System.out.println("13.List of Courses: ");
            System.out.println("14.Add course in room:");
            System.out.println("15.Show all students in course ");
            System.out.println("16.Show teacher in course:");

            System.out.println("Enter option: ");
            System.out.println("Need to enter list of courses before.");
             n = sc.nextInt();
             sc.nextLine();
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
                case 11 -> {
                    sm.showAllStudent();
                }
                case 12 -> {
                    sm.showAllTeacher();
                }
                case 13 -> {
                    sm.showAllCourse();
                }
                
                case 14->{
                    sm.courseInRoom();
                    r.WriteFileCourseInRoom();
                }
                case 15 -> {
                    sm.showStudentsInCourse();
                }
                case 16 -> {
                    sm.showTeacherInCourse();
                }
            }
        }while(n>= 1 && n <= 16);
        System.out.println("FINISHED");
    }
}
