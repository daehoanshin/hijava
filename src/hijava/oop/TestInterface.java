package hijava.oop;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface TestInterface {
	public ResultSet select(String sql) throws SQLException, IOException;

	static void out(int i) {
		System.out.println("ii=" + i);
	}
}
