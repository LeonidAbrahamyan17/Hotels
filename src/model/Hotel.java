package model;

public class Hotel {
    private String name;
    private String address;
    private String phoneNumber;
    private int roomsCount;
    private int stars;

    public Hotel(String name, String address, String phoneNumber, int roomsCount, int stars) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.roomsCount = roomsCount;
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getRoomsCount() {
        return roomsCount;
    }

    public void setRoomsCount(int roomsCount) {
        this.roomsCount = roomsCount;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Hotel : " + name  + ", Stars : " + stars + "\nAddress : " + address + ", Phone : " + phoneNumber;
    }
}