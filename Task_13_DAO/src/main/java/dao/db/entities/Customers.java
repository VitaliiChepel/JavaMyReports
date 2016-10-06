package dao.db.entities;


public class Customers {
    private int  id_cs;
    private String f_name;
    private String l_name;
    private int discount;
    private String license;

    public Customers(int id_cs, String f_name, String l_name, int discount, String license) {
        this.id_cs = id_cs;
        this.f_name = f_name;
        this.l_name = l_name;
        this.discount = discount;
        this.license = license;
    }

    public int getId_cs() {
        return id_cs;
    }

    public void setId_cs(int id_cs) {
        this.id_cs = id_cs;
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

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id_cs=" + id_cs +
                ", f_name='" + f_name + '\'' +
                ", l_name='" + l_name + '\'' +
                ", discount=" + discount +
                ", license='" + license + '\'' +
                '}';
    }
}


