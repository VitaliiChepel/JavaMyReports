package entities;

import java.util.Date;



public class Orders {
	
 	private int  id_ord;
    private String date_info;
    private int  total_price;
    private String reg_number;
    private int fk_id_custs;
    private int fk_id_empls;

    public Orders() {
		super();
	}
    
    public Orders(int id_ord, String date_info, int total_price, String reg_number, int fk_id_custs, int fk_id_empls) {
    	super();
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

    public String getDate_info() {
        return date_info;
    }

    public void setDate_info(String date_info) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Orders)) return false;

        Orders orders = (Orders) o;

        if (id_ord != orders.id_ord) return false;
        if (date_info != orders.date_info) return false;
        if (total_price != orders.total_price) return false;
        if (reg_number != orders.reg_number) return false;
        return reg_number != null ? reg_number.equals(orders.reg_number) : orders.reg_number == null;

    }
    
  
		@Override
	    public int hashCode() {
	        int result = id_ord;
	        result = 31 * result + (date_info != null ? date_info.hashCode() : 0);
	        result = 31 * result + total_price;
	        return result;
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

