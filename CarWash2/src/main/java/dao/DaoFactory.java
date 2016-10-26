package dao;

import org.apache.log4j.Logger;

public abstract class DaoFactory {
	static Logger logger = Logger.getLogger(DaoFactory.class); 
	
    public abstract OrdersDao createOrdersDao();

    public static DaoFactory getInstance(){
        String factoryClassName = "dao.jdbc.mysql.MySqlJdbcDaoFactory";
        try {
            return (DaoFactory) Class.forName(factoryClassName)
                    .newInstance();
        } catch (Exception e) {
            logger.error("Factory class not exists.");
            throw new RuntimeException(e);
        }
    }
}
