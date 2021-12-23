package jdbc.controllers.db_management;

import jdbc.controllers.db_management.sql_queiries.EmployeesSQL;
import jdbc.models.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {


    public static void addEmployeePureSql(int id, String fName, String sName){
        Employee employee = new Employee(id, fName, sName);
        try {
            Connection connection = ConnectionManager.dbCompanyXConnection();
            ConnectionManager.dbCompanyXConnection().createStatement()
                    .execute("INSERT INTO employees VALUES (" +
                    employee.getId()  + ", " +  "\"" + employee.getFname() +  "\"" + ", " +  "\"" + employee.getSname() +  "\"" + ")");
            ConnectionManager.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void addEmployeePreparedStatement (int id, String fName, String sName){
        try {
            PreparedStatement employeePreparedStatement = ConnectionManager.dbCompanyXConnection().prepareStatement(EmployeesSQL.ADD_EMPLOYEE);
            employeePreparedStatement.setInt(1, id);
            employeePreparedStatement.setString(2,fName);
            employeePreparedStatement.setString(3,sName);
            employeePreparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static void getAllEmployees(){
        ResultSet resultSet = null;

            try {
                resultSet = ConnectionManager.dbCompanyXConnection().createStatement().executeQuery(EmployeesSQL.GET_ALL_EMPLOYEES);
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1));
                    System.out.println(resultSet.getString(2));
                    System.out.println(resultSet.getString(3));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }




    }
    public static void main(String[] args) {
        EmployeeDAO.addEmployeePreparedStatement(1, "hnif", "ali");
        EmployeeDAO.getAllEmployees();
    }
}
