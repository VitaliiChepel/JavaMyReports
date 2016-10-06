package com.db;

import com.db.utilities.DataBase;

import java.sql.*;

import static com.db.utilities.DataBase.*;


public class Main {

    public static void main(String[] args) throws SQLException {

        System.out.println(getTableCustomers());
        System.out.println(getTableEmployees());
        System.out.println(getTableOrders());
        System.out.println(getTablePosition());
        System.out.println(getTableSchedule());
        System.out.println(getTableServices());
    }
}

