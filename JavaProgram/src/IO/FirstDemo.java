package IO;

import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;


public class FirstDemo {
	

	private static final boolean ture = false;

	public static void main(String[] args) throws IOException {
		 File f= new File("world.txt") ;
		 // ����File����
		 OutputStream out = null ;
		 // ׼����һ������Ķ���
		 out = new FileOutputStream(f) ;
		 //ͨ�������̬�ԣ�����ʵ����
		 String str = "Hello World!!!" ;
		 // ׼��һ���ַ���
		 byte b[] = str.getBytes() ;
		 // ֻ�����byte���飬���Խ��ַ�����Ϊbyte����
		 out.write(b) ;
		 // �����������
		 //out.close() ;
		 
		FileOutputStream f1 = new FileOutputStream("world.txt", true );
		 
		 f1.write(b);f1.write(b);f1.write(b);
		 
		 f1.close();
		 
		    

	}
	
	
}
