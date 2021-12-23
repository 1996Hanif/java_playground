package jdbc.controllers.db_management.sql_queiries;

import jdbc.config.Config;

public interface DbInitialiseStatements {
    String DB_INITIALISE = "CREATE DATABASE IF NOT EXISTS " + Config.dbName();
    String CREATE_EMPLOYEES_TABLE = "CREATE TABLE IF NOT EXISTS employees(" +
            "employeeID INTEGER," +
            "first_name VARCHAR(20)," +
            "last_name VARCHAR(20))";
}
