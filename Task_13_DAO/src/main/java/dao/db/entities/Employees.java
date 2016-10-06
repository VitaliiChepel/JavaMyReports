package dao.db.entities;

public class Employees {

    private int  id_empls;
    private String f_name;
    private String l_name;
    private int  fk_id_sch;
    private int fk_id_position;


    public Employees() {
    }

    public Employees(int id_empls, String f_name, String l_name, int fk_id_sch, int fk_id_position) {
        this.id_empls = id_empls;
        this.f_name = f_name;
        this.l_name = l_name;
        this.fk_id_sch = fk_id_sch;
        this.fk_id_position = fk_id_position;
    }

    public int getId_empls() {
        return id_empls;
    }

    public void setId_empls(int id_empls) {
        this.id_empls = id_empls;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public int getFk_id_sch() {
        return fk_id_sch;
    }

    public void setFk_id_sch(int fk_id_sch) {
        this.fk_id_sch = fk_id_sch;
    }

    public int getFk_id_position() {
        return fk_id_position;
    }

    public void setFk_id_position(int fk_id_position) {
        this.fk_id_position = fk_id_position;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id_empls=" + id_empls +
                ", f_name='" + f_name + '\'' +
                ", l_name='" + l_name + '\'' +
                ", fk_id_sch=" + fk_id_sch +
                ", fk_id_position=" + fk_id_position +
                '}';
    }
}


