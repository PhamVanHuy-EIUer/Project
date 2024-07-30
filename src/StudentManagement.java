import java.util.ArrayList;

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

    public void addStudents(Student student){
        students.add(student);
    }
    public void addteachers(Teacher teacher){
        teachers.add(teacher);
    }
    public void addcourses(Course course){
        courses.add(course);
    }
    public void addRoom(Room room){
        rooms.add(room);
    }
}
