package epam.regex.model;

import epam.regex.model.entity.NoteBookItem;


public class Model {
    private static final int INT = 500;
    private static NoteBookItem[] noteBook = new NoteBookItem[INT];
    private static int itemQuantity;

    public Model() {
        noteBook = new NoteBookItem[INT];
    }

    public void addItem(){
        NoteBookItem noteBookItem = new NoteBookItem();
        if (itemQuantity == INT) {
            noteBook[itemQuantity++] = noteBookItem;
        }
    }
}