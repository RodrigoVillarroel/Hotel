import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reserve {

    //XXXXXXXXXXXXXXXXXXXXXX ATRIBUTES XXXXXXXXXXXXXXXXXXXXXXXXXXXX

    private String code;
    private String type;
    private String receptionist;
    private Client client;
    private ArrayList<Room> rooms;
    private String status;
    private float totalPrice;
    private int numberOfNight;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;

    //XXXXXXXXXXXXXXXXXXXXXX CONSTRUCTOR XXXXXXXXXXXXXXXXXXXXXXXXXX

    public Reserve(String type, String receptionist, Client client,
                   String status, int numberOfNight, LocalDateTime checkIn, LocalDateTime checkOut) {
        setCode();
        setType(type);
        setReceptionist(receptionist);
        setClient(client);
        setRooms();
        setStatus(status);
        setCheckIn(checkIn);
        setCheckOut(checkOut);
        setNumberOfNight(numberOfNight);
    }

    public Reserve() {
        setCode();
    }

    //XXXXXXXXXXXXXXXXXXXXXX GETS & SETS XXXXXXXXXXXXXXXXXXXXXXXXXX

    public String getCode() {
        return code;
    }

    private void setCode() {
        String uuid = UUID.randomUUID().toString().toUpperCase();
        Stream<Character> digit = uuid.chars().mapToObj(i -> (char) i).filter(Character::isDigit).limit(3);
        Stream<Character> alpha = uuid.chars().mapToObj(i -> (char) i).filter(Character::isAlphabetic).limit(3);
        List<Character> collect = Stream.concat(digit, alpha).collect(Collectors.toList());
        Collections.shuffle(collect);
        this.code =collect.stream().map(Object::toString).collect(Collectors.joining());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(String receptionist) {
        this.receptionist = receptionist;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms() {
        this.rooms = new ArrayList<Room>();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getNumberOfNight() {
        return numberOfNight;
    }

    public void setNumberOfNight(int numberOfNight) {
        this.numberOfNight = numberOfNight;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }

    //XXXXXXXXXXXXXXXXXXXXXX METHODS XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    //XXXXXXXXXXXXXXXXXXXXXX OVERRIDES XXXXXXXXXXXXXXXXXXXXXXXXXXXX

    @Override
    public String toString() {
        return "\nReserve{" +
                "\nCode: " + getCode() +
                "\nType: " + getType() +
                "\nReceptionist: " + getReceptionist() +
                "\nClient: " + getClient() +
                "\nRooms: " + getRooms() +
                "\nStatus: " + getStatus() +
                "\nTotalPrice: " + getTotalPrice() +
                "\nNumberOfNight: " + getNumberOfNight() +
                "\nCheckIn: " + getCheckIn() +
                "\nCheckOut: " + getCheckOut() +
                "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserve reserve = (Reserve) o;
        return Float.compare(reserve.totalPrice, totalPrice) == 0 && Objects.equals(code, reserve.code) && Objects.equals(type, reserve.type) && Objects.equals(receptionist, reserve.receptionist) && Objects.equals(client, reserve.client) && Objects.equals(rooms, reserve.rooms) && Objects.equals(status, reserve.status) && Objects.equals(checkIn, reserve.checkIn) && Objects.equals(checkOut, reserve.checkOut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, type, receptionist, client, rooms, status, totalPrice, checkIn, checkOut);
    }
}

