package epam.reflection;

import epam.reflection.Group;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import  java.lang.String;

import static epam.reflection.Group.ASUS;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Notebook notebook = new Notebook (ASUS, 1.7, 2, 1000, 512, 15.7, 3.2, 4000);
        System.out.println(notebook);


        Notebook note = new Notebook(notebook);
        note.callAnnoteForMethods();

        note.printClassName();
        note.printAnnoteForMethods();

        note.printPackageName();
        note.printSimpleClassName();
        System.out.println(note.getSuperClassName());
    }
}