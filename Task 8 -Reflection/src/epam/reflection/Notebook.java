package epam.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Notebook extends Computer{

    private double diagonal;
    private double weight;
    private int batCapacity;

    public Notebook (Group name, double frequency, int amount, int operMemory, int constMemory, double diagonal, double weight, int batCapacity ) {
        super(name, frequency, amount,operMemory, constMemory);
        this.diagonal=diagonal;
        this.weight=weight;
        this.batCapacity=batCapacity;
    }

    //@Override
    public void setAllParameters(Group name, double frequency, int amount, int operMemory, int constMemory,double diagonal, double weight, int batCapacity) {
        super.setAllParameters(name, frequency,amount, operMemory, constMemory);
        this.diagonal=diagonal;
        this.weight=weight;
        this.batCapacity=batCapacity;
    }

    @AnnotForMethod
    public void buyNotebook(Group notebook) {
        System.out.println("I want to buy this notebook: " + notebook);
    }



    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public int getBatCapacity() {
        return batCapacity;
    }

    public void setBatCapacity(int batCapacity) {
        this.batCapacity = batCapacity;
    }



    Class clazz;
    Object obj;

    public Notebook(Object obj) {
        this.clazz = obj.getClass();
        this.obj = obj;

    }

    public void callAnnoteForMethods() throws InvocationTargetException, IllegalAccessException {

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(AnnotForMethod.class)) {

                    System.out.println(
                            "Invoke : " + methodReturnType(method) + method.getName() + methodParametersTypes(method));
                    method.invoke(obj, Group.ASUS);

            }
        }
    }
    public void printAnnoteForMethods(){
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            if(method.getAnnotations().length > 0) {
                System.out.println(method.getName() + methodParametersTypes(method) + " has annotattion:");
                for (Annotation anot : method.getAnnotations()){
                    System.out.println(anot.toString());
                };
                System.out.println();
            }

        }

    }
    public String getSuperClassName(){
        return  "SupperClass name : " + clazz.getSuperclass().toString();
    }

    private String methodReturnType(Method method) {
        String[] res = method.getReturnType().toString().split("\\.");
        return res[res.length - 1] + " ";
    }

    private String methodParametersTypes(Method method) {
        StringBuilder res = new StringBuilder("(");
        if (method.getParameters().length > 0) {
            for (Parameter type : method.getParameters()) {
                String[] tmp = type.toString().toString().split("\\.");
                res.append(tmp[tmp.length - 1]).append(',');
            }
            ;
            res.setLength(res.length() - 1);
        }
        res.append(')');
        return res.toString();
    }

    public void printClassName() {
        System.out.println("Class name : " + clazz.getName());
    }

    public void printPackageName() {
        System.out.println("Package name : "+ clazz.getPackage().getName());
    }

    public void printSimpleClassName() {
        System.out.println("Class simple name : " + clazz.getSimpleName());
    }


    @Override
    public String toString() {
        return "Notebook{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                ", amount=" + amount +
                ", operMemory=" + operMemory +
                ", constMemory=" + constMemory +
                "diagonal=" + diagonal +
                ", weight=" + weight +
                ", batCapacity=" + batCapacity +
                '}';
    }
}
