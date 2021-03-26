import java.util.Objects;

class Person {
    //XXXXXXXXXXXXXXXXXXXXXX ATRIBUTES XXXXXXXXXXXXXXXXXXXXXXXXXXXX

    private String fullname;
    private int dni;

    //XXXXXXXXXXXXXXXXXXXXXX CONSTRUCTOR XXXXXXXXXXXXXXXXXXXXXXXXXX

    public Person(String fullname, int dni) {
        setDni(dni);
        setFullname(fullname);
    }

    public Person() {
    }

    //XXXXXXXXXXXXXXXXXXXXXX GETS & SETS XXXXXXXXXXXXXXXXXXXXXXXXXX

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    //XXXXXXXXXXXXXXXXXXXXXX METHODS XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


    //XXXXXXXXXXXXXXXXXXXXXX OVERRIDES XXXXXXXXXXXXXXXXXXXXXXXXXXXX

    @Override
    public String toString() {
        return "\nPerson{" +
                "\nfullname: " + getFullname() +
                "\nDNI: " + getDni() +
                "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return dni == person.dni && Objects.equals(fullname, person.fullname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullname, dni);
    }
}

//XXXXXXXXXXXXXXXXXXXXXX ATRIBUTES XXXXXXXXXXXXXXXXXXXXXXXXXXXX
//XXXXXXXXXXXXXXXXXXXXXX CONSTRUCTOR XXXXXXXXXXXXXXXXXXXXXXXXXX
//XXXXXXXXXXXXXXXXXXXXXX GETS & SETS XXXXXXXXXXXXXXXXXXXXXXXXXX
//XXXXXXXXXXXXXXXXXXXXXX METHODS XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//XXXXXXXXXXXXXXXXXXXXXX OVERRIDES XXXXXXXXXXXXXXXXXXXXXXXXXXXX
