import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();
        // sm.addCourses();
        sm.addStudents();
        // sm.addTeachers();
        // sm.addRooms();
        do{
            System.out.println("Enter option: ");
            int n = sc.nextInt();
            switch (n) {
                case 1 -> {
                    sm.removeStudents();
                    break;
                }
                case 2->{
                    sm.removeTeachers();
                    break;
                }
                case 3 ->{
                    sm.listStudents();
                    break;
                }
                case 4->{
                    sm.searchStudent();
                    break;
                }
            }
        }while(n>= 1 && n <= 4);
        System.out.println("FINISHED");
    }
}
