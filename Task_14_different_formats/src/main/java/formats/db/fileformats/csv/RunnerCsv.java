package formats.db.fileformats.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import formats.db.fileformats.json.Customers;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;



public class RunnerCsv {

    public static void main(String[] args) throws IOException {


        CSVFormat format = CSVFormat.RFC4180.withHeader().withDelimiter(',');

//initialize the CSVParser object

        CSVParser parser = new CSVParser(new FileReader("D:\\customers.csv"), format);

        List<Customers> customersList = new ArrayList<Customers>();
        for (CSVRecord record : parser) {
            Customers customers = new Customers();

            customers.setId_cs(Integer.parseInt(record.get("id_cs")));
            customers.setF_name(record.get("f_name"));
            customers.setL_name(record.get("l_name"));
            customers.setDiscount(Integer.parseInt(record.get("discount")));
            customers.setLicense(record.get("license"));

            customersList.add(customers);
        }
//close the parser
        parser.close();

        System.out.println(customersList);
    }
}

