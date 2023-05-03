package in.ineuron.main;
import java.io.*;
import java.sql.*;
import org.apache.commons.io.IOUtils;
import in.ineuron.util.JdbcUtil;

public class BlobRetrievalImage {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet resultSet = null;
		int id = 1;
		try {
			connection = JdbcUtil.getJdbcConnection();

			String sqlSelectQuery = "select id,name,image from person where id=?";
			if (connection != null)
				pstmt = connection.prepareStatement(sqlSelectQuery);

			if (pstmt != null) {
				pstmt.setInt(1, id);
				resultSet = pstmt.executeQuery();
			}
			if (resultSet != null) {

				if (resultSet.next()) {
					System.out.println("ID\tNAME\tIMAGE");
					int sid = resultSet.getInt(1);
					String sname = resultSet.getString(2);
					InputStream is = resultSet.getBinaryStream(3);

					File file = new File("copied.jpg");
					FileOutputStream fos = new FileOutputStream( file);

					// copying the data from is to fos
					IOUtils.copy(is, fos);
					fos.close();
					System.out.println(sid + "\t" + sname + "\t" + file.getAbsolutePath());

				} else {
					System.out.println("Record not available for the given id :: " + id);
				}
			}
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				JdbcUtil.cleanUp(connection, pstmt, resultSet);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}