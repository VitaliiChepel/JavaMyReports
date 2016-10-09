package formats.db.fileformats.json;

import org.json.simple.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;
import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RunnerJSON {

    public static void main(String args[]) throws Exception {
//        Customers c = new Customers(3, "Anna", "Dovlat", 0, "ПАР392819");
//        JSONObject json = new JSONObject();
//        json.put("id_cs", c.getId_cs());
//        json.put("f_name", c.getF_name());
//        json.put("l_name", c.getL_name());
//        json.put("discount", c.getDiscount());
//        json.put("license", c.getLicense());
//        System.out.println(json.toJSONString());
//        String jString = json.toJSONString();
//
//        ObjectMapper mapper = new ObjectMapper();
//        Customers wasRead = mapper.readValue(jString, Customers.class);
//        System.out.println(wasRead);

        Customers customers = new Customers(4, "Olga", "Petrova", 1, "КАВ378492");
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("D:\\customers.json"), customers);


    }
}





