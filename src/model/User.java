package model;

public class User {
    private String name;
    private String phoneNumber;
    private String password;
    private boolean haveReservedRoom;
    private Role role;

    public User(){

    }

    public User(String name, String phoneNumber, String password, boolean haveReservedRoom , Role role) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.haveReservedRoom = haveReservedRoom;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isHaveReservedRoom() {
        return haveReservedRoom;
    }

    public void setHaveReservedRoom(boolean haveReservedRoom) {
        this.haveReservedRoom = haveReservedRoom;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User : " + name + ", Phone number : " + phoneNumber + ", Have reserved Room : " + haveReservedRoom ;
    }
}