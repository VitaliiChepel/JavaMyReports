package dao.db.dao;


import dao.db.entities.Customers;
import dao.db.entities.Employees;
import dao.db.entities.Orders;
import dao.db.entities.Services;

public abstract class DaoFactory {
    public abstract CustomersDao createCustomersDao();
    public abstract OrdersDao createOrdersDao();
    public abstract EmployeesDao createEmployeesDao();
    public abstract ServicesDao createServicesDao();

    public static DaoFactory getInstance() {
        String factoryClassName = "dao.db.dao.jdbc.mysql.MySqlJdbcDaoFactory";
        try {
            return (DaoFactory) Class.forName(factoryClassName)
                    .newInstance();
        } catch (Exception e) {
            //log
            throw new RuntimeException(e);
        }
    }
}
