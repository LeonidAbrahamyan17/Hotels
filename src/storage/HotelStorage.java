package storage;

import exception.HotelNotFoundException;
import model.Hotel;

public class HotelStorage {
    private static Hotel[] hotels = new Hotel[10];
    private static int size = 0;

    public void add(Hotel hotel) {
        if (hotels.length == size) {
            extend();
        }
        hotels[size++] = hotel;
    }

    private static void extend(){
        Hotel[] temp = new Hotel[hotels.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = hotels[i];
        }
        hotels = temp;
    }

    public void printHotels(){
        for(int i = 0; i < size; i++){
            System.out.println(hotels[i].toString() + "\n");
        }
    }

    public boolean isEmpty(Hotel[] arrays){
        return size == 0;
    }

    public void deleteHotelByName(String name){
        if(isEmpty(new Hotel[size])){
            System.out.println("Hotel does not exist");
        }
        else{
            for(int i = 0; i < size; i++){
                if(hotels[i].getName().equals(name)){
                    hotels[i] = null;
                }
            }
            size--;
        }
    }

    public Hotel getHotelByName(String name) throws HotelNotFoundException {
        if(isEmpty(new Hotel[size])){
            throw new HotelNotFoundException();
        }
        for(int i = 0; i < size; i++){
            if(hotels[i].getName().equals(name)){
                return hotels[i];
            }

        }
        return null;
    }

    public Hotel getHotelByStarsCount(int stars) throws HotelNotFoundException {
        if(isEmpty(new Hotel[size])){
            throw new HotelNotFoundException();
        }
        for(int i = 0; i < size; i++){
            if(hotels[i].getStars() == stars){
                return hotels[i];
            }

        }
        return null;
    }

}