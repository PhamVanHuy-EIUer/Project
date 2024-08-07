import java.util.Scanner;

public abstract class Person {
    static Scanner sc = new Scanner(System.in);
    private String name;
    private String id;
    private String gender;
    private String dateOfBirth;
    private String address;
    private String idMajor;
    public Person() {
    }
    public Person(String name, String id, String gender, String dateOfBirth, String address, String idMajor) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.idMajor = idMajor;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getIdMajor() {
        return idMajor;
    }
    public void setIdMajor(String idMajor) {
        this.idMajor = idMajor;
    }
    public void Input(){
        
        System.out.println("Enter Name : " );
        setName(sc.nextLine());
        System.out.println(("Enter ID: "));
        setId(sc.nextLine());
        System.out.println("Enter gender : ");
        setGender(sc.nextLine());
        System.out.println("Enter date of birth : ");
        setDateOfBirth(sc.nextLine());
        System.out.println("Enter address : ");
        setAddress(sc.nextLine());
        System.out.println("Enter major : ");
        setIdMajor(sc.nextLine());
    }
    public void Output(){
        System.out.println("Name : " + getName());
        System.out.println("ID : " + getId());
        System.out.println("Gender : " + getGender());
        System.out.println("Date of birth : " + getDateOfBirth());
        System.out.println("Adress : " + getAddress());
        System.out.println("Major : " + getIdMajor());
    }
}

    
