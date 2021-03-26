import java.util.ArrayList;
import java.util.Objects;

public class Hotel {

    //XXXXXXXXXXXXXXXXXXXXXX ATRIBUTES XXXXXXXXXXXXXXXXXXXXXXXXXXXX

    private String name;
    private long phoneNumber;
    private String details;
    private ArrayList<Room> rooms;
    private ArrayList<Reserve> reserves;

    //XXXXXXXXXXXXXXXXXXXXXX CONSTRUCTOR XXXXXXXXXXXXXXXXXXXXXXXXXX

    public Hotel(String name, long phoneNumber, String details) {
        setName(name);
        setPhoneNumber(phoneNumber);
        setDetails(details);
        setRooms();
        setReserves();
    }

    //XXXXXXXXXXXXXXXXXXXXXX GETS & SETS XXXXXXXXXXXXXXXXXXXXXXXXXX

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms() {
        this.rooms = new ArrayList<Room>();
    }

    public ArrayList<Reserve> getReserves() {
        return reserves;
    }

    public void setReserves() {
        this.reserves = new ArrayList<Reserve>();
    }
    //XXXXXXXXXXXXXXXXXXXXXX METHODS XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


    //XXXXXXXXXXXXXXXXXXXXXX OVERRIDES XXXXXXXXXXXXXXXXXXXXXXXXXXXX

    @Override
    public String toString() {
        return "\nHotel{" +
                "\nName: " + getName() +
                "\nPhoneNumber: " + getPhoneNumber() +
                "\nDetails: " + getDetails() +
                "\nRooms: " + getRooms() +
                "\nReserves: " + getReserves() +
                "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return phoneNumber == hotel.phoneNumber && Objects.equals(name, hotel.name) && Objects.equals(details, hotel.details) && Objects.equals(rooms, hotel.rooms) && Objects.equals(reserves, hotel.reserves);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber, details, rooms, reserves);
    }
}
