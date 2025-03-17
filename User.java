package Interfaces;

public class User {
    private int ID;
    private String name;
    private String email;
    private int phoneNum;

    public User() {
        ID = 0;
        name = "";
        email = "";
        phoneNum = 0;
    }

    public User(int ID, String name, String email, int phoneNum) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNum=" + phoneNum +
                '}';
    }
}
