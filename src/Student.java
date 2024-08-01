public class Student extends StudentManagement{
   private String name;
   private String id;
   private String gender;
   private String address;
   private String dateOfBirth;
   private String email;
   private String major;
public Student() {
}
public Student(String name, String id, String gender, String address, String dateOfBirth, String email, String major) {
    this.name = name;
    this.id = id;
    this.gender = gender;
    this.address = address;
    this.dateOfBirth = dateOfBirth;
    this.email = email;
    this.major = major;
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
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
public String getDateOfBirth() {
    return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getMajor() {
    return major;
}
public void setMajor(String major) {
    this.major = major;
}
@Override
public String toString() {
    return "Student [name=" + name + ", id=" + id + ", gender=" + gender + ", address=" + address + ", dateOfBirth="
            + dateOfBirth + ", email=" + email + ", major=" + major + "]";
}
   
}
