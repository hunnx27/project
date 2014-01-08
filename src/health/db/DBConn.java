package health.db;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBConn {
	public Connection con;
	public DBConn(){
		try{
			Context ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/DBExam");
			con = ds.getConnection();
			
			if(con!=null){
				System.out.println("connect");
			}
		}
		catch(Exception err){
			err.printStackTrace();
		}
	}
}
