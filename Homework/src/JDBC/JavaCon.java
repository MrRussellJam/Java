package JDBC;

import java.sql.*;
import java.util.Vector;

public class JavaCon {
	public static Connection Conn() //连接数据库
	{
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //运行sql驱动
			String url = "jdbc:sqlserver://localhost:1433;DatabaseName=BookDB"; //连接数据库具体信息 
			Connection conn = DriverManager.getConnection(url, "ZJQ", "123456");
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static int Insert() //插入数据
	{
		Connection conn = JavaCon.Conn();
		try {
			Statement stmt = conn.createStatement();//此接口用于执行sql语句
			String sql = "insert into Student values('9512155','某某','男',18,'信息系')";
			int bool = stmt.executeUpdate(sql);
			
			stmt.close();
			conn.close();
			
			if(bool > 0) return 1;
			else return 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public static int deleteData() //删除数据
	{
		Connection conn = JavaCon.Conn();
		try {
			Statement stmt = conn.createStatement();
			String sql = "delete from Student where Sno='9512155'";
			int bool = stmt.executeUpdate(sql);
			
			stmt.close();
			conn.close();
			
			if(bool > 0) return 1;
			else return 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public static int updata() // 修改数据
	{
		Connection conn = JavaCon.Conn();
		try
		{
			Statement stmt = conn.createStatement();
			String sql = "update Student set Sname='lise-chen' where Sno='9512155'";
			int bool = stmt.executeUpdate(sql);
			
			stmt.close();
			conn.close();
			
			if(bool > 0) return 1;
			else return 0;
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public static int updataDta(String sql) // 自主定义sql语句进行执行
	{
		Connection conn = JavaCon.Conn();
		try {
			Statement stmt = conn.createStatement();
			int bool = stmt.executeUpdate(sql);
			
			stmt.close();
			conn.close();
			
			if(bool > 0) return 1;
			else return 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public static Vector queryData(String sql) // 查询显示所有数据
	{
		Connection conn = JavaCon.Conn();
		Vector<Vector> data = new Vector<Vector>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				Vector<String> line = new Vector<String>();
				
				for(int i = 1;i<=5;i++)
				{
					String str = rs.getString(i);
					str = str.trim();
					line.add(str);
				}
				
				data.add(line);
			}
			rs.close();
			stmt.close();
			conn.close();
			return data;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
}
