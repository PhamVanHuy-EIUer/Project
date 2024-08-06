import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    private ArrayList<Course> courses;
    private ArrayList<Room> rooms;
    static Scanner sc = new Scanner(System.in);

    public StudentManagement() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        courses = new ArrayList<>();
        rooms = new ArrayList<>();
    }

    public StudentManagement(ArrayList<Student> students, ArrayList<Teacher> teachers, ArrayList<Course> courses,
            ArrayList<Room> rooms) {
        this.students = students;
        this.teachers = teachers;
        this.courses = courses;
        this.rooms = rooms;
    }

    public void addStudents(int n) {
        for (int i = 0; i < n; i++) {
            Student s = new Student();
            s.Input();
            students.add(s);
        }
    }

    public void addTeachers(int n) {
        for (int i = 0; i < n; i++) {
            Teacher t = new Teacher();
            t.Input();
            teachers.add(t);
        }
    }

    public void addRooms(int n) {
        for (int i = 0; i < n; i++) {
            Room r = new Room();
            r.addRoom();
            rooms.add(r);
        }
    }

    public void addCourses(int n) {
        for (int i = 0; i < n; i++) {
            Course c = new Course();
            c.addCourse();
            courses.add(c);
        }
    }

    public ArrayList<Course> searchCourse() {
        ArrayList<Course> result = new ArrayList<>();
        System.out.println("Enter code: ");
        String code = sc.nextLine();
        for (Course course : courses) {
            if (course.getCode().equals(code)) {
                result.add(course);
                break;
            }
        }
        return result;

    }

    public ArrayList<Student> searchStudent() {
        ArrayList<Student> result = new ArrayList<>();
        System.out.println("Enter ID: ");
        String id = sc.nextLine();
        for (Student student : students) {
            if(student.getId().equals(id)){
                result.add(student);
                break;
            }
        }
        return result;
    }
    public ArrayList<Room> searchRoom(){
        ArrayList<Room> result = new ArrayList<>();
        System.out.println("Enter number: ");
        String num = sc.nextLine();
        for(Room room : rooms){
            if(room.getCode().equals(num)){
                result.add(room);
                break;
            }
        }
        return result;
    }
    public ArrayList<Teacher> searchTeacher(){
        ArrayList<Teacher> result = new ArrayList<>();
        System.out.println("Enter ID: ");
        String id = sc.nextLine();
        for(Teacher teacher : teachers){
            if(teacher.getId().equals(id)){
                result.add(teacher);
                break;
            }
        }
        return result;
    }
    
}