import java.util.ArrayList;
import java.util.Objects;

public class Room {
    //XXXXXXXXXXXXXXXXXXXXXX ATRIBUTES XXXXXXXXXXXXXXXXXXXXXXXXXXXX

    private int number;
    private ArrayList<String> camas;
    private boolean balcon;
    private String estado;
    private float price;

    //XXXXXXXXXXXXXXXXXXXXXX CONSTRUCTOR XXXXXXXXXXXXXXXXXXXXXXXXXX

    public Room(int number, boolean balcon, String estado, float price) {
        setNumber(number);
        setCamas();
        setBalcon(balcon);
        setEstado(estado);
        setPrice(price);
    }

    public Room() {
    }

    //XXXXXXXXXXXXXXXXXXXXXX GETS & SETS XXXXXXXXXXXXXXXXXXXXXXXXXX

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<String> getCamas() {
        return camas;
    }

    public void setCamas() {
        this.camas = new ArrayList<>();
    }

    public boolean isBalcon() {
        return balcon;
    }

    public void setBalcon(boolean balcon) {
        this.balcon = balcon;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    //XXXXXXXXXXXXXXXXXXXXXX METHODS XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    //XXXXXXXXXXXXXXXXXXXXXX OVERRIDES XXXXXXXXXXXXXXXXXXXXXXXXXXXX

    @Override
    public String toString() {
        return "\nRoom{" +
                "\nNumber: " + getNumber() +
                "\nCamas: " + getCamas() +
                "\nBalcon: " + isBalcon() +
                "\nEstado: " + getEstado() +
                "\nPrice: " + getPrice() +
                "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return number == room.number && balcon == room.balcon && Objects.equals(camas, room.camas) && Objects.equals(estado, room.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, camas, balcon, estado);
    }
}
