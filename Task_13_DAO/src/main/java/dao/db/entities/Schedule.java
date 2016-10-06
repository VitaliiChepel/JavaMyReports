package dao.db.entities;


public class Schedule {

    private int id_sch;
    private String workday;

    public Schedule(int id_sch, String workday) {
        this.id_sch = id_sch;
        this.workday = workday;
    }

    public int getId_sch() {
        return id_sch;
    }

    public void setId_sch(int id_sch) {
        this.id_sch = id_sch;
    }

    public String getWorkday() {
        return workday;
    }

    public void setWorkday(String workday) {
        this.workday = workday;
    }


    @Override
    public String toString() {
        return "Schedule{" +
                "id_sch=" + id_sch +
                ", workday='" + workday + '\'' +
                '}';
    }
}

