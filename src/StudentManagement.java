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

    
    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
    public void listStudents(){
        System.out.println("------------ALL INFORMATION OF STUDENT--------------");
        int n =1;
        for(Student student :students){
            System.out.println(n);
            student.Output();
            n++;
        }

    }

    public void addStudents() {
        System.out.println("Enter number to add students: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            Student s = new Student();
            s.Input();
            students.add(s);
        }
    }
    public void addStudentsInCourse(){
        ArrayList<Student> addStudents = new ArrayList<>();
        Course c = new Course();
        for(Student student:students){
            for(Course course : courses){
                if(student.getIdMajor().equals(course.getCode())){
                    addStudents.add(student);
                    break;
                }
            }
        }
        c.setStudentInCourse(addStudents);
    }

    public void removeStudents() {
        System.out.println("Enter number to remove students: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter ID: ");
            String id = sc.nextLine();
            for (int j = 0; j < students.size(); j++) {
                if (students.get(j).getId().equals(id)) {
                    students.remove(j);
                    break;
                }
                else{
                    System.out.println("ID is available.");
                }
            }
            for (int k = 0; k < courses.size(); k++) {
                for (int z = 0; z < courses.get(i).getStudentInCourse().size(); z++) {
                    if (courses.get(k).getStudentInCourse().get(z).getId().equals(id)) {
                        courses.get(k).getStudentInCourse().get(z).getId().equals(id);
                        break;
                    }
                }
            }
        }
    }

    public void addTeachers() {
        System.out.println("Enter number to add teachers: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            Teacher t = new Teacher();
            t.Input();
            teachers.add(t);
        }
    }
    public void addTeachersInCourse(){
        ArrayList<Teacher> addTeachers = new ArrayList<>();
        Course c = new Course();
        for(Teacher teacher : teachers){
            for(Course course : courses){
                if(teacher.getIdMajor().equals(course.getCode())){
                    addTeachers.add(teacher);
                    break;
                }
                else{
                    System.out.println("ID is available");
                }
            }
        }
        c.setTeacherInCourse(addTeachers);
    }

    public void removeTeachers() {
        System.out.println("Enter number to remove teachers: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter ID: ");
            String id = sc.nextLine();
            for (int j = 0; j < teachers.size(); j++) {
                if (teachers.get(j).getId().equals(id)) {
                    teachers.remove(j);
                    break;
                }
            }
            for (int k = 0; k < courses.size(); k++) {
                for (int z = 0; z < courses.get(i).getTeacherInCourse().size(); z++) {
                    if (courses.get(k).getTeacherInCourse().get(z).getId().equals(id)) {
                        courses.get(k).getTeacherInCourse().get(z).getId().equals(id);
                        break;
                    }
                }
            }
        }
    }

    public void addRooms() {
        System.out.println("Enter number of rooms: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            Room r = new Room();
            r.addRoom();
            rooms.add(r);
        }
    }

    public void addCourses() {
        System.out.println("Enter number of courses: ");
        int n = sc.nextInt();
        sc.nextLine();
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
            if (student.getId().equals(id)) {
                result.add(student);
                break;
            }
        }
        return result;
    }

    public ArrayList<Room> searchRoom() {
        ArrayList<Room> result = new ArrayList<>();
        System.out.println("Enter number: ");
        String num = sc.nextLine();
        for (Room room : rooms) {
            if (room.getCode().equals(num)) {
                result.add(room);
                break;
            }
        }
        return result;
    }

    public ArrayList<Teacher> searchTeacher() {
        ArrayList<Teacher> result = new ArrayList<>();
        System.out.println("Enter ID: ");
        String id = sc.nextLine();
        for (Teacher teacher : teachers) {
            if (teacher.getId().equals(id)) {
                result.add(teacher);
                break;
            }
        }
        return result;
    }

    public void courseInRoom() {
        ArrayList<Course> courseInRoom = new ArrayList<>();
        System.out.println("Enter number of course to add in room: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter course: ");
            String code = sc.nextLine();
            System.out.println("Enter ID room");
            String id = sc.nextLine();
            for (Course course : courses) {
                if (course.getCode().equals(code)) {
                    for (Room room : rooms) {
                        if (room.getNumber().equals(id)) {
                            boolean flat = true;
                            for (int j = 0; j < room.getCourseInRoom().size(); j++) {
                                if (course.getDay().equals(room.getCourseInRoom().get(j).getDay())
                                        && course.getTimeStart().equals(room.getCourseInRoom().get(j).getTimeStart())
                                        && course.getTimeEnd().equals(room.getCourseInRoom().get(j).getTimeEnd())
                                        && (course.getStudentInCourse().size() + 1) == room.getCapacity()
                                        && !room.isEmpty()) {

                                    flat = false;
                                    break;
                                } else {
                                    courseInRoom.add(course);
                                }
                            }
                            if (!flat) {
                                System.out.println("This room is invalid.");
                            }
                        }
                    }
                }
            }
        }
    }

}