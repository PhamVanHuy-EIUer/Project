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

    public void listStudents() {
        System.out.println("------------ALL INFORMATION OF STUDENT--------------");
        int n = 1;
        for (Student student : students) {
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

    public void addStudentsInCourse() {
        for (Course course : courses) {
            ArrayList<Student> addStudents = new ArrayList<>();
            for (Student student : students) {
                if (student.getIdMajor().equals(course.getCode())) {
                    addStudents.add(student);
                }
            }
            course.setStudentInCourse(addStudents);
        }
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
                } else {
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
    public void checkPass(){
        for(Course course : courses){
            for (int i = 0 ; i < course.getStudentInCourse().size();i++){
                if(course.getStudentInCourse().get(i).isPass(course.getScoreToPass())){
                    System.out.println("Name : " +course.getStudentInCourse().get(i).getName() + " pass course " + course.getName());
                }
                else{
                    System.out.println("Name : " +course.getStudentInCourse().get(i).getName() + " fail course " + course.getName());
                }
            }
        }
    }
    public void checkKPA(){
        for (Course course :courses){
            for(int i = 0; i < course.getTeacherInCourse().size();i++){
                if(course.getTeacherInCourse().get(i).isPass(course.getKpaJustice())){
                    System.out.println(course.getTeacherInCourse().get(i).getName()+" reach KPA.");
                }
                else{
                    System.out.println(course.getTeacherInCourse().get(i).getName()+" doesn't reach KPA.");
                }
            }
        }
    }

    public void addTeachersInCourse() {
        for (Course course : courses) {
            ArrayList<Teacher> addTeachers = new ArrayList<>();
            for (Teacher teacher : teachers) {
                if (teacher.getIdMajor().equals(course.getCode())) {
                    addTeachers.add(teacher);
                }
            }
            course.setTeacherInCourse(addTeachers);
        }
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

    public void sortStudents() {
        students.sort((s1, s2) -> {
            if (s1.getClass().toString().compareTo(s2.getClass().toString()) == 0) {
                return s1.getId().compareTo(s2.getId());
            }
            return s1.getClass().toString().compareTo(s2.getClass().toString());
        });
    }
    public void sortTeacher(){
        teachers.sort((t1,t2) -> {
            if(t1.getClass().toString().compareTo(t2.getClass().toString()) == 0){
                return t1.getId().compareTo(t2.getId());
            }
            return t1.getClass().toString().compareTo(t2.getClass().toString());
        });
    }

    public void courseInRoom() {

        
        for(int i = 0; i < rooms.size();i ++){
            if( rooms.get(i).isEmpty()){
                System.out.println("Enter course for room : " + rooms.get(i).getNumber());
                ArrayList <Course> courseInRoom = new ArrayList<>();
                int shiftSchedule = rooms.get(i).getCourseInRoom().size();
                System.out.println("Enter number of courses: ");
                int c = sc.nextInt();
                sc.nextLine();
                for(int j = 0; j < c;j++){
                    System.out.println("Enter Code of course: ");
                    String code = sc.nextLine();
                    for(int k = 0; k < courses.size();k++){
                        if(courses.get(k).getCode().equals(code) && rooms.get(i).isEmpty()) {
                            boolean flat = true; 
                            for(int z = 0; z < rooms.get(i).getCourseInRoom().size();z++){
                                if(courses.get(k).getCode().equals(rooms.get(i).getCourseInRoom().get(z).getCode())){
                                    flat = false;
                                    break;
                                }
                            }
                            if(!flat){
                                System.out.println("Room is used.");
                                break;
                            }
                            else{
                                courseInRoom.add(courses.get(k));
                                shiftSchedule++;
                            }
                        }
                    }
                    if(shiftSchedule == 2){
                        rooms.get(i).setEmpty(false);
                        break;
                    }
                }
                rooms.get(i).setCourseInRoom(courseInRoom);

            }
            else {
                System.out.println("Room is unavailable. ");
            }
        }
    }
    public void writeFile(){

    }
}