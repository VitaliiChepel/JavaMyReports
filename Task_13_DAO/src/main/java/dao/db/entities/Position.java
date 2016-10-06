package dao.db.entities;


public class Position {

    private int id_pn_empl;
    private String position_name;


    public Position(int id_pn_empl, String position_name) {
        this.id_pn_empl = id_pn_empl;
        this.position_name = position_name;
    }


    public int getId_pn_empl() {
        return id_pn_empl;
    }

    public void setId_pn_empl(int id_pn_empl) {
        this.id_pn_empl = id_pn_empl;
    }

    public String getPosition_name() {
        return position_name;
    }

    public void setPosition_name(String position_name) {
        this.position_name = position_name;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id_pn_empl=" + id_pn_empl +
                ", position_name='" + position_name + '\'' +
                '}';
    }
}

