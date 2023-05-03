package in.ineuron.JDBCRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JDBCRowSetDelete {

	public static void main(String[] args) throws Exception {

		RowSetFactory rsf = RowSetProvider.newFactory();
		JdbcRowSet jrs = rsf.createJdbcRowSet();// same as resultSet(connected),but it is scrollable and updatable.

		// setting url,username,password and getting connection object..
		jrs.setUrl("jdbc:mysql:///ineuron");
		jrs.setUsername("root");
		jrs.setPassword("admin");

		// setting a command for execution
		jrs.setCommand("select id,name,age,address,salary from employees");
		jrs.execute();

		while (jrs.next()) {
			int actualSalary = jrs.getInt(5);
			if (actualSalary > 6000) {
				jrs.deleteRow();
			}
		}
		System.out.println("Records deleted succesfully....");
		jrs.close();

	}
}
