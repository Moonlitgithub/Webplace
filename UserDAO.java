package dataAccessObject;
/**
 * @author Nitin Shashi
 *
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dataAccessObject.todoapp.model.User;

public class UserDAO {

	public int registerEmployee1(User employee) throws ClassNotFoundException {
			String INSERT_USERS_SQL = "INSERT INTO users" +
					"  (first_name, last_name, username, password) VALUES " +
					" (?, ?, ?, ?);";

			int result = 0;
			try (Connection connection = dbConnection.JDBCUtils.getConnection();
					// Step 2:Create a statement using connection object
					PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
				preparedStatement.setString(1, employee.getFirstName());
				preparedStatement.setString(2, employee.getLastName());
				preparedStatement.setString(3, employee.getUsername());
				preparedStatement.setString(4, employee.getPassword());

				System.out.println(preparedStatement);
				// Step 3: Execute the query or update query
				result = preparedStatement.executeUpdate();

			} catch (SQLException e) {
				// process sql exception
				dbConnection.JDBCUtils.printSQLException(e);
			}
			return result;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int registerEmployee(User employee) {
		// TODO Auto-generated method stub
		return 0;
	}

}
