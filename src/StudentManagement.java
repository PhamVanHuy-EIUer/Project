import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    private ArrayList<Course> courses;
    private ArrayList<Room> rooms;

    public StudentManagement() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        courses = new ArrayList<>();
        rooms = new ArrayList<>();
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public void addteachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addcourses(Course course) {
        courses.add(course);
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }
    public void removeCourse(String idCourse) {
        Course c = null;
        for(Course course :courses){
            if(course.getCode().equals(idCourse)){
                c = course;
                break;
            }
        }
        courses.remove(c);
    }

    public boolean borrowRoom(String infor) {
        Room room = null;
        for (Room r : rooms) {
            if (r.getNumber().equals(infor)) {
                room = r;
            }
        }
        if (room == null || !rooms.isEmpty()) {
            return false;
        } else {
            room.setEmpty(true);
            return true;
        }
    }

    public int Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        return n;
    }

    public void addStudentInCourse(String id, String codeOfCourse) {
        ArrayList<Student> numInCourse = new ArrayList<>();
        for (int i = 0; i < Input(); i++) {
            for (Student student : students) {
                if (student.getId().equals(id)) {
                    numInCourse.add(student);
                    break;
                }
            }
        }
        Course c = null;
        for (Course course : courses) {
            if (course.getCode().equals(codeOfCourse)) {
                c = course;
            }
        }
        c.setNumStudentInScore(numInCourse);
    }
    
    
}
