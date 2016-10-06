package dao.db.dao;

import java.util.List;
import dao.db.entities.Employees;
import dao.db.entities.*;


public interface EmployeesDao extends GenericDao<Employees>  {

    List<Employees> findByF_Name (String name);
}
