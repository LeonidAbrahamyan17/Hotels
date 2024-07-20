package command;

public interface Menu {
    int LOGOUT = 0;
    int PRINT_ALL_HOTELS = 1;
    int PRINT_HOTELS_BY_STARS_COUNT = 2;

    int PRINT_ROOM_TYPES = 3;
    int PRINT_AVAILABLE_ROOMS_BY_TYPE = 4;
    int RESERVE_ROOM = 5;

    int ADD_NEW_HOTEL = 6;
    int DELETE_HOTEL_BY_NAME = 7;

    int PRINT_ALL_USERS = 8;

    int EXIT = 0;
    int LOGIN = 1;
    int REGISTER = 2;

    static void printChooseRoomCommands() {
        System.out.println("Input " + LOGOUT + " to log out");
        System.out.println("Input " + PRINT_ALL_HOTELS + " to print all hotels");
        System.out.println("Input " + PRINT_HOTELS_BY_STARS_COUNT + " to print hotels list by stars count");
        System.out.println("Input " + PRINT_ROOM_TYPES + " to print room types");
        System.out.println("Input " + PRINT_AVAILABLE_ROOMS_BY_TYPE + " to print available rooms");
        System.out.println("Input " + RESERVE_ROOM + " to reserve room");
        System.out.print("\nInput command :");
    }

    static void printAdminCommands() {
        System.out.println("Input " + LOGOUT + " to log out");
        System.out.println("Input " + PRINT_ALL_HOTELS + " to print all hotels");
        System.out.println("Input " + PRINT_HOTELS_BY_STARS_COUNT + " to print hotels list by stars count");
//        System.out.println("Input " + CHOOSE_HOTEL_BY_NAME + " to choose hotel");
        System.out.println("Input " + PRINT_ROOM_TYPES + " to print room types");
        System.out.println("Input " + PRINT_AVAILABLE_ROOMS_BY_TYPE + " to print available rooms");
        System.out.println("Input " + RESERVE_ROOM + " to reserve room");
        System.out.println("Input " + ADD_NEW_HOTEL + " to add new hotel");
        System.out.println("Input " + DELETE_HOTEL_BY_NAME + " to delete hotel by name");
        System.out.println("Input " + PRINT_ALL_USERS + " to print all users list");
        System.out.print("\nInput command :");
    }

    static void printLoginCommands() {
        System.out.println("Input " + EXIT + " to exit");
        System.out.println("Input " + LOGIN + " to login");
        System.out.println("Input " + REGISTER + " to register");
        System.out.print("\nInput command :");
    }
}