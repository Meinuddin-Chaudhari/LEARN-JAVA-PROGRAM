package in.ineuron.CSV;
import java.sql.*;

public class CSVselect  {
	// csv file represents the table name
	private static final String CSV_SELECT = "select * from hello1.csv";

	public static void main(String[] args) {
		
		//jdbc:Excel:///location where the file is present
		String url = "jdbc:Text:///‪C:";	
		try (Connection connection = DriverManager.getConnection(url)) {
			try (PreparedStatement pstmt = connection.prepareStatement(CSV_SELECT)) {
				try (ResultSet resultSet = pstmt.executeQuery()) {
					while (resultSet.next()) {
						System.out.println(
								resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3));
					}
				}
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}