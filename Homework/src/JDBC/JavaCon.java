package JDBC;

import java.sql.*;
import java.util.Vector;

public class JavaCon {
	public static Connection Conn() //�������ݿ�
	{
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //����sql����
			String url = "jdbc:sqlserver://localhost:1433;DatabaseName=BookDB"; //�������ݿ������Ϣ 
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
	
	public static int Insert() //��������
	{
		Connection conn = JavaCon.Conn();
		try {
			Statement stmt = conn.createStatement();//�˽ӿ�����ִ��sql���
			String sql = "insert into Student values('9512155','ĳĳ','��',18,'��Ϣϵ')";
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
	
	public static int deleteData() //ɾ������
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
	
	public static int updata() // �޸�����
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
	
	public static int updataDta(String sql) // ��������sql������ִ��
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
	
	public static Vector queryData(String sql) // ��ѯ��ʾ��������
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
