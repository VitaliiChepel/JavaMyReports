package epam.regex.model.entity;


public class Name {


    private String name;
    private String surname;
    private String middleName;

    public Name(String name, String surname, String middleName) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;

    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }
}