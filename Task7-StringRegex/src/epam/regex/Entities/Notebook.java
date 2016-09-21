package epam.regex.Entities;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Витал on 20.09.2016.
 */
public class Notebook {
    private String surname;
    private String name;
    private String middleName;
    private String nickName;
    private String comment;
    private String group;
    private String homePhone;
    private String mobilePhone;
    private String secondMobilePhone;
    private String email;
    private String skype;
    private ArrayList<String> address;
    private String creationNoteDate;
    private String lastChangeDate;


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getSecondMobilePhone() {
        return secondMobilePhone;
    }

    public void setSecondMobilePhone(String secondMobilePhone) {
        this.secondMobilePhone = secondMobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public ArrayList<String> getAddress() {
        return address;
    }

    public void setAddress(ArrayList<String> address) {
        this.address = address;
    }

    public String getCreationNoteDate() {
        return creationNoteDate;
    }

    public void setCreationNoteDate(String creationNoteDate) {
        this.creationNoteDate = creationNoteDate;
    }

    public String getLastChangeDate() {
        return lastChangeDate;
    }

    public void setLastChangeDate(String lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", comment='" + comment + '\'' +
                ", group='" + group + '\'' +
                ", comment='" + comment + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", secondMobilePhone='" + secondMobilePhone + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", address='" + address.toString() + '\'' +
                ", creationNoteDate='" + creationNoteDate + '\'' +
                ", lastChangeDate='" + lastChangeDate + '\'' +
                '}';
    }
}






