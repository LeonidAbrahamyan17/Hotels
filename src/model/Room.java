package model;

public class Room {
    private Hotel hotel;
    private int number;
    private RoomType roomType;
    private boolean isReserved;

    public Room(Hotel hotel ,int number, RoomType roomType, boolean isReserved) {
        this.hotel = hotel;
        this.number = number;
        this.roomType = roomType;
        this.isReserved = isReserved;
    }

    public Room() {

    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    @Override
    public String toString() {
        return "Hotel :" + hotel.getName() + "\nRoom type :" + roomType  + "\nRoom number :" + number + "\n";
    }

}
