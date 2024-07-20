package storage;

import model.User;

public class UserStorage {
    private static User[] users = new User[100];

    private static int size = 0;

    public void add(User user){
        if(users.length == size){
            extend();
        }
        users[size++] = user;
    }

    private static void extend(){
        User[] temp = new User[users.length + 10];
        for(int i = 0; i < size; i++){
            temp[i] = users[i];
        }
        users = temp;
    }

    public User getUserByPhoneNumber(String phoneNumber){
        for(int i = 0; i < size; i++){
            if(users[i].getPhoneNumber().equals(phoneNumber)){
                return users[i];
            }
        }
        return null;
    }

    public void printAllUsersList(){
        for(int i = 0; i < size; i++){
            System.out.println(users[i].toString());
        }
    }

    public void setHaveReservedRoom(String userName){
        for(int i = 0; i < size; i++){
            if (users[i].getName().equals(userName)){
                users[i].setHaveReservedRoom(true);
            }
        }
    }

    public User getUserByName(String name){
        for(int i = 0; i < size; i++){
            if (users[i].getName().equals(name)){
                return users[i];
            }
        }
        return null;
    }


}