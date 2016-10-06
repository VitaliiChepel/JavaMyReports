package com.db.entities;


import java.util.Date;

public class Orders {

    private int  id_ord;
    private Date date_info;
    private int  total_price;
    private String reg_number;
    private int fk_id_custs;
    private int fk_id_empls;

    public Orders(int id_ord, Date date_info, int total_price, String reg_number, int fk_id_custs, int fk_id_empls) {
        this.id_ord = id_ord;
        this.date_info = date_info;
        this.total_price = total_price;
        this.reg_number = reg_number;
        this.fk_id_custs = fk_id_custs;
        this.fk_id_empls = fk_id_empls;
    }

    public int getId_ord() {
        return id_ord;
    }

    public void setId_ord(int id_ord) {
        this.id_ord = id_ord;
    }

    public Date getDate_info() {
        return date_info;
    }

    public void setDate_info(Date date_info) {
        this.date_info = date_info;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public String getReg_number() {
        return reg_number;
    }

    public void setReg_number(String reg_number) {
        this.reg_number = reg_number;
    }

    public int getFk_id_custs() {
        return fk_id_custs;
    }

    public void setFk_id_custs(int fk_id_custs) {
        this.fk_id_custs = fk_id_custs;
    }

    public int getFk_id_empls() {
        return fk_id_empls;
    }

    public void setFk_id_empls(int fk_id_empls) {
        this.fk_id_empls = fk_id_empls;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id_ord=" + id_ord +
                ", date_info=" + date_info +
                ", total_price=" + total_price +
                ", reg_number='" + reg_number + '\'' +
                ", fk_id_custs=" + fk_id_custs +
                ", fk_id_empls=" + fk_id_empls +
                '}';
    }
}
