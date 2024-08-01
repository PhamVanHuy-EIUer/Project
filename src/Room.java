public class Room extends StudentManagement{
    private String number;
    private int capacity;
    private boolean isEmpty;
    public Room(String number, int capacity, boolean isEmpty) {
        this.number = number;
        this.capacity = capacity;
        this.isEmpty = isEmpty;
    }
    public Room() {
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public boolean isEmpty() {
        return isEmpty;
    }
    public void setEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }
    
}
