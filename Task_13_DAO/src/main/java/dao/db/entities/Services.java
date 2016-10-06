package dao.db.entities;


public class Services {

    private int id_serv;
    private String   name_serv;
    private String type_vehicle;
    private int   price_val;

    public Services(int id_serv, String name_serv, String type_vehicle, int price_val) {
        this.id_serv = id_serv;
        this.name_serv = name_serv;
        this.type_vehicle = type_vehicle;
        this.price_val = price_val;
    }

    public int getId_serv() {
        return id_serv;
    }

    public void setId_serv(int id_serv) {
        this.id_serv = id_serv;
    }

    public String getName_serv() {
        return name_serv;
    }

    public void setName_serv(String name_serv) {
        this.name_serv = name_serv;
    }

    public String getType_vehicle() {
        return type_vehicle;
    }

    public void setType_vehicle(String type_vehicle) {
        this.type_vehicle = type_vehicle;
    }

    public int getPrice_val() {
        return price_val;
    }

    public void setPrice_val(int price_val) {
        this.price_val = price_val;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id_serv=" + id_serv +
                ", name_serv='" + name_serv + '\'' +
                ", type_vehicle='" + type_vehicle + '\'' +
                ", price_val=" + price_val +
                '}';
    }
}


