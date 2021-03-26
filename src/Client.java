import java.util.Objects;

public class Client extends Person{
    //XXXXXXXXXXXXXXXXXXXXXX ATRIBUTES XXXXXXXXXXXXXXXXXXXXXXXXXXXX

    private long phoneNumber;
    private String email;

    //XXXXXXXXXXXXXXXXXXXXXX CONSTRUCTOR XXXXXXXXXXXXXXXXXXXXXXXXXX

    public Client(String fullname, int dni, long phoneNumber, String email) {
        super(fullname, dni);
        setPhoneNumber(phoneNumber);
        setEmail(email);
    }

    public Client() {
    }

    //XXXXXXXXXXXXXXXXXXXXXX GETS & SETS XXXXXXXXXXXXXXXXXXXXXXXXXX

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //XXXXXXXXXXXXXXXXXXXXXX METHODS XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    //XXXXXXXXXXXXXXXXXXXXXX OVERRIDES XXXXXXXXXXXXXXXXXXXXXXXXXXXX

    @Override
    public String toString() {
        return "\nClient{" +
                "\nphoneNumber: " + getPhoneNumber() +
                "\nemail: " + getEmail() + "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return phoneNumber == client.phoneNumber && Objects.equals(email, client.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), phoneNumber, email);
    }
}
