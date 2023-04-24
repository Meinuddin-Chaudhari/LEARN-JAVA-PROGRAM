package in.ineuron.main;
import java.io.File;
import java.io.*;
import java.sql.*;
import java.util.Scanner;
import in.ineuron.util.JdbcUtil;

public class CLOBinsertionPDForTEXT {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement pstmt = null;
		Scanner scanner = null;
		String name = null;
		String pdfLoc = null;

		try {
			connection = JdbcUtil.getJdbcConnection();

			String sqlInsertQuery = "insert into city(name,history) values(?,?)";
			if (connection != null)
				pstmt = connection.prepareStatement(sqlInsertQuery);

			if (pstmt != null) {
				scanner = new Scanner(System.in);

				if (scanner != null) {
					System.out.print("Enter the cityname :: ");
					name = scanner.next();

					System.out.print("Enter the textpath location :: ");
					pdfLoc = scanner.next();// D:\images\history.txt
				}
				pstmt.setString(1, name);
				pstmt.setCharacterStream(2, new FileReader(new File(pdfLoc)));;

				int rowAffected = pstmt.executeUpdate();
				System.out.println("No of rows inserted inserted is :: " + rowAffected);
			}
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				JdbcUtil.cleanUp(connection, pstmt, null);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			scanner.close();
		}
	}
}