package IO;

import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;


public class FirstDemo {
	

	private static final boolean ture = false;

	public static void main(String[] args) throws IOException {
		 File f= new File("world.txt") ;
		 // 声明File对象
		 OutputStream out = null ;
		 // 准备好一个输出的对象
		 out = new FileOutputStream(f) ;
		 //通过对象多态性，进行实例化
		 String str = "Hello World!!!" ;
		 // 准备一个字符串
		 byte b[] = str.getBytes() ;
		 // 只能输出byte数组，所以将字符串变为byte数组
		 out.write(b) ;
		 // 将内容输出，
		 //out.close() ;
		 
		FileOutputStream f1 = new FileOutputStream("world.txt", true );
		 
		 f1.write(b);f1.write(b);f1.write(b);
		 
		 f1.close();
		 
		    

	}
	
	
}
