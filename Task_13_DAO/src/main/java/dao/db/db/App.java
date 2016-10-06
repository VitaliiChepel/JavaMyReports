package dao.db.db;

import dao.db.dao.DaoFactory;
import dao.db.dao.EmployeesDao;
import dao.db.dao.jdbc.mysql.MySqlEmployeesDao;


public class App {

    public static void main(String[] args) {

        DaoFactory factory = DaoFactory.getInstance();
        EmployeesDao employeesDao = factory.createEmployeesDao();
        System.out.println(employeesDao.findByF_Name("Denys"));
    }
}
