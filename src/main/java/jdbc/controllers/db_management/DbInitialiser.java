package jdbc.controllers.db_management;

import jdbc.controllers.db_management.sql_queiries.DbInitialiseStatements;

import java.sql.Connection;
import java.sql.SQLException;


public class DbInitialiser {
    private static void initialiseDb() {
        try {
            Connection connection = ConnectionManager.dbInitialiseConnection();
            connection.createStatement().executeUpdate(DbInitialiseStatements.DB_INITIALISE);
            ConnectionManager.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static void initialiseEmployeeTable() {
        try {
            Connection connection = ConnectionManager.dbCompanyXConnection();
            connection.createStatement().executeUpdate(DbInitialiseStatements.CREATE_EMPLOYEES_TABLE);
            ConnectionManager.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void initialiseDbFirstInstance(){
        DbInitialiser.initialiseDb();
        DbInitialiser.initialiseEmployeeTable();

    }

    public static void main(String[] args) {
        DbInitialiser.initialiseDbFirstInstance();
    }

}



