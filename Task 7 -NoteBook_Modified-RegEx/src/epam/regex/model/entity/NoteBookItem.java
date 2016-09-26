package epam.regex.model.entity;


import epam.regex.controller.InputRegForm;



public class NoteBookItem {
    private Name name;
    private String nickname;
    private String comment;
    private Group group;
    private String homeNumber;
    private String mobileNumber;
    private String mobileNumber2;
    private String email;
    private String skype;
    private String index;
    private Address address;
    private String createData;
    private String modifyData;

    @Override
    public String toString() {
        return "NoteBookItem{" +
                "name=" + name +
                ", nickname='" + nickname + '\'' +
                ", comment='" + comment + '\'' +
                ", group=" + group +
                ", homeNumber='" + homeNumber + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", mobileNumber2='" + mobileNumber2 + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", index='" + index + '\'' +
                ", address=" + address +
                ", createData='" + createData + '\'' +
                ", modifyData='" + modifyData + '\'' +
                '}';
    }

    public NoteBookItem() {
        Name name = new Name(InputRegForm.getName(),InputRegForm.getSurname(),InputRegForm.getMiddleName());
        this.name = name;
        Address adress = new Address (InputRegForm.getIndex(),InputRegForm.getCity(), InputRegForm.getStreet(),InputRegForm.getBuilding(),
                InputRegForm.getApartment());
        this.address = adress;
    }
}
