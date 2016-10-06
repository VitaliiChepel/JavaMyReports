package com.db.utilities;

import java.sql.*;
import java.util.*;

import com.db.entities.*;

import static java.sql.DriverManager.getConnection;


public class DataBase {

    static List<Customers> customersList = new ArrayList<Customers>();
    static List<Employees> employeesList = new ArrayList<Employees>();
    static List<Orders> orderList = new ArrayList<Orders>();
    static List<Position> positionList = new ArrayList<Position>();
    static List<Schedule> schedulesList = new ArrayList<Schedule>();
    static List<Services> servicesList = new ArrayList<Services>();

    public static List getTableCustomers() throws SQLException {
        Connection connection = getConnection("jdbc:mysql://localhost:3306/model_car_wash?useSSL=false", "root", "k`[f");
        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM customers")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Customers customers = new Customers(rs.getInt("id_cs"), rs.getString("f_name"), rs.getString("l_name"),
                        rs.getInt("discount"), rs.getString("license"));
                customersList.add(customers);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return customersList;
    }

    public static List getTableEmployees() throws SQLException {
        Connection connection = getConnection("jdbc:mysql://localhost:3306/model_car_wash?useSSL=false", "root", "k`[f");
        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM employees")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Employees employees = new Employees(rs.getInt("id_empls"), rs.getString("f_name"), rs.getString("l_name"),
                        rs.getInt("fk_id_sch"), rs.getInt("fk_id_position"));
                employeesList.add(employees);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return employeesList;
    }

    public static List getTableOrders() throws SQLException {
        Connection connection = getConnection("jdbc:mysql://localhost:3306/model_car_wash?useSSL=false", "root", "k`[f");
        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM orders")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Orders orders = new Orders (rs.getInt("id_ord"), rs.getDate("date_info"), rs.getInt("total_price"),
                        rs.getString("reg_number"), rs.getInt("fk_id_custs"), rs.getInt("fk_id_empls"));
                orderList.add(orders);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return orderList;
    }

    public static List getTablePosition() throws SQLException {
        Connection connection = getConnection("jdbc:mysql://localhost:3306/model_car_wash?useSSL=false", "root", "k`[f");
        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM position_empl")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Position position = new Position (rs.getInt("id_pn_empl"), rs.getString("position_name"));
                positionList.add(position);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return positionList;
    }

    public static List getTableSchedule() throws SQLException {
    Connection connection = getConnection("jdbc:mysql://localhost:3306/model_car_wash?useSSL=false", "root", "k`[f");
    try (PreparedStatement query = connection.prepareStatement("SELECT * FROM schedule")) {
        ResultSet rs = query.executeQuery();
        while (rs.next()) {
            Schedule schedule = new Schedule (rs.getInt("id_sch"), rs.getString("workday"));
            schedulesList.add(schedule);
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return schedulesList;
}

    public static List getTableServices() throws SQLException {
        Connection connection = getConnection("jdbc:mysql://localhost:3306/model_car_wash?useSSL=false", "root", "k`[f");
        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM services")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
               Services services = new Services (rs.getInt("id_serv"), rs.getString("name_serv"), rs.getString("type_vehicle"),
                       rs.getInt("price_val"));
                servicesList.add(services);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return servicesList;
    }
}





