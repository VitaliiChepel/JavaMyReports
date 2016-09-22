package maxproject;

/**
 * Created by Витал on 20.09.2016.
 */
public class Employee {

    private String fname;
    private String surname;
    private int age;
    private String edu;
    private String mstatus;

    public Employee() {

    }

    public Employee(String fname, String surname, int age, String edu, String mstatus) {
        this.fname = fname;
        this.surname = surname;
        this.age = age;
        this.edu = edu;
        this.mstatus = mstatus;
    }


    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getMstatus() {
        return mstatus;
    }

    public void setMstatus(String mstatus) {
        this.mstatus = mstatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        if (fname != null ? !fname.equals(employee.fname) : employee.fname != null) return false;
        if (surname != null ? !surname.equals(employee.surname) : employee.surname != null) return false;
        if (edu != null ? !edu.equals(employee.edu) : employee.edu != null) return false;
        return mstatus != null ? mstatus.equals(employee.mstatus) : employee.mstatus == null;

    }

    @Override
    public int hashCode() {
        int result = fname != null ? fname.hashCode() : 0;
        result = 13 * result + (surname != null ? surname.hashCode() : 0);
        result = 13 * result + age;
        result = 13 * result + (edu != null ? edu.hashCode() : 0);
        result = 13 * result + (mstatus != null ? mstatus.hashCode() : 0);
        return result;
    }
}



















