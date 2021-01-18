package OOP2;

public class Customer2 {
    private int ID;
    private String name;
    private char gender;

    public Customer2(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Customer2{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
