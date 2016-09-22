package maxproject;

/**
 * Created by Витал on 20.09.2016.
 */
public class StudentChildRD extends Employee {

    private DirectionRD directionRD;


    public StudentChildRD(String fname, String surname, int age, String edu, String mstatus, DirectionRD directionRD) {
        super(fname, surname, age, edu, mstatus);
        this.directionRD = directionRD;
    }

        public DirectionRD getDirectionRD() {
        return directionRD;
    }

    public void setDirectionRD(DirectionRD directionRD) {
        this.directionRD = directionRD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentChildRD)) return false;
        if (!super.equals(o)) return false;

        StudentChildRD studentChildRD = (StudentChildRD) o;

        return directionRD == studentChildRD.directionRD;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 13 * result + (directionRD != null ? directionRD.hashCode() : 0);
        return result;
    }
}



