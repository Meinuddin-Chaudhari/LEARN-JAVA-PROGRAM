package CachedRowSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class CachedRowSetDelete {

	public static void main(String[] args) throws Exception {

		Connection connection = DriverManager.getConnection("jdbc:mysql:///ineuron?relaxAutocommit=true","root","admin");

		Statement stmt = connection.createStatement();
		ResultSet resultSet = stmt.executeQuery("select id,name,age,address,salary from employees");

		RowSetFactory rsf = RowSetProvider.newFactory();
		CachedRowSet crs = rsf.createCachedRowSet();// same as resultSet(connected),but it is scrollable and updatable.
		crs.populate(resultSet);

		while (crs.next()) {
			int actualSalary = crs.getInt(5);
			if (actualSalary < 4000) {
				crs.deleteRow();
			}
		}
		crs.moveToCurrentRow();
		crs.acceptChanges();
		crs.commit();

		System.out.println("Records deleted succesfully....");
		crs.close();

	}
}
