package JDBC;

import java.sql.*;

public class DBcon {
	public static void main(String[] args)
	{
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://localhost:1433;DatabaseName=StudentDB";
			Connection conn = DriverManager.getConnection(url, "ZJQ", "123456");
			
			//�������
			Statement stmt = conn.createStatement();
			//String sql = "insert into student values('s001','���','Ů','16','�����')";
			
			//ɾ������
			//String sql = "delete from student where Sno='s001'";
			
			//�޸�����
			String sql = "update Student set Sno = '9214201' where Sname = '����' ";
			stmt.executeUpdate(sql);
			
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
}
