import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();
        // sm.addCourses();
        sm.addStudents();
        // sm.addTeachers();
        // sm.addRooms();
        int n = sc.nextInt();
        do{
            switch (n) {
                case 1 -> {
                    sm.removeStudents();
                }
                case 2->{
                    sm.removeTeachers();
                }
                case 3 ->{
                    sm.listStudents();
                }
                case 4->{
                    sm.searchStudent();
                }
            }
        }while(n>= 1 && n <= 4);
        System.out.println("FINISHED");
    }
}
