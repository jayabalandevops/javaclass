import java.sql.*;

public class FinallySQLException {

	public static void main(String[] args) {
		// Program construct for sql exception
		String url = "Connection String";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url);
		}
		catch(SQLException e) {
			System.out.println("SQL Exception catch block." + e.getMessage());
		}
		finally {
			try {
				if(conn != null)
					conn.close();
			}
			catch(SQLException se) {
				System.out.println("With in finally - try catch block" + se.getMessage());
			}
		}

	}

}
