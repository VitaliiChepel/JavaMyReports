package epam.regex.model.entity;


public class Address {

    private String index;
    private String city;
    private String street;
    private String building;
    private String apartment;

    public Address(String index, String city, String street, String building, String apartment) {
        this.index = index;
        this.city = city;
        this.street = street;
        this.building = building;
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return "Address{" +
                "index='" + index + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
