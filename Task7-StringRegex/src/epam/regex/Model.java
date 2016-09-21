package epam.regex;

import epam.regex.Entities.Notebook;

import java.util.ArrayList;

/**
 * Created by Витал on 20.09.2016.
 */

public class Model {

    Notebook notebook = new Notebook();

    public Model() {
    }

    public void setNotebookSurname(String surname) {
        notebook.setSurname(surname);
    }

    public void setNotebookName(String name) {
        notebook.setName(name);
    }

    public void setNotebookMiddleName(String middleName) {
        notebook.setMiddleName(middleName);
    }

    public void setNotebookNickName(String nickName) {
        notebook.setNickName(nickName);
    }

    public void setNotebookComment(String comment) {
        notebook.setComment(comment);
    }

    public void setNotebookGroup(String group) {
        notebook.setGroup(group);
    }

    public void setNotebookHomePhone(String homePhone) {
        notebook.setHomePhone(homePhone);
    }

    public void setNotebookMobilePhone(String mobilePhone) {
        notebook.setMobilePhone(mobilePhone);
    }

    public void setNotebookSecondMobilePhone(String secondMobilePhone) {
        notebook.setSecondMobilePhone(secondMobilePhone);
    }

    public void setNotebookEmail(String email) {
        notebook.setEmail(email);
    }

    public void setNotebookSkype(String skype) {
        notebook.setSkype(skype);
    }

    public void setNotebookAddress(ArrayList<String> address) {
        notebook.setAddress(address);
    }

    public void setNotebookCreationNoteDate(String creationNoteDate) {
        notebook.setCreationNoteDate(creationNoteDate);
    }

    public void setNotebookLastChangeDate(String lastChangeDate) {
        notebook.setLastChangeDate(lastChangeDate);
    }
}
