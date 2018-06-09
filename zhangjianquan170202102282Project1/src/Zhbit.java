import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import org.omg.CORBA.portable.OutputStream;

public class Zhbit {
	Humanbeing aListOfPerson []=null;
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        //String s=  "I am hjjhjhjhjh Jabbed hjjhhjhjhjhj ";
		//System.out.print(s);
		//System.exit(1);
		
		ArrayList<String> list = new ArrayList<String>();
		
		int debug=0;
		
		
		/**
		 * 这是输出文件的信息到控制台
		 */
		File f1 = new File("grouplist.txt");
		
		Scanner fp = new Scanner(f1);
		while(fp.hasNext()) {
			String sDemo = fp.nextLine();
			System.out.println(sDemo);
		}
		
		
		/**
		 * 以下部分为手动创建一些新的Humanbeing对象
		 */
		String whatLabel=Bike.manufactoryLabel;
		
		Bike.manufactoryLabel="jhjhhj";
		// Person a
		Humanbeing aPerson=new Humanbeing("杜睿","170202101111");
		SharedBikeOfLittleGreen aBike=new SharedBikeOfLittleGreen("bike001");
		aBike.personScanCard();
		aPerson.ride(aBike);
		
		String whatLabelA=aBike.manufactoryLabel;

		// Person b
		Humanbeing bPerson=new Humanbeing("黄晓炜","170202102222");
		SharedBikeOfOfO bBike=new SharedBikeOfOfO("bike002");
		bPerson.ride(bBike);

		String whatLabelB=aBike.manufactoryLabel;
		
		// Person c
		Humanbeing cPerson=new Humanbeing("何浩","170202103333");
		SharedBikeOfHello cBike=new SharedBikeOfHello("bike003");
		cPerson.ride(cBike);
		
		Humanbeing dPerson=new Humanbeing("黄伊宁","170202104444");
		SharedBikeOfHello dBike=new SharedBikeOfHello("bike004");
		dPerson.ride(dBike);
		
		/**
		 * 创建Zhbit类数组并把Humanbeing类存进数组
		 */
		Zhbit zhbit=new Zhbit();
		// start to go to Java course
		zhbit.aListOfPerson=new Humanbeing[4];
		zhbit.aListOfPerson[0]=aPerson;
		zhbit.aListOfPerson[1]=bPerson;
		zhbit.aListOfPerson[2]=cPerson;
		zhbit.aListOfPerson[3]=dPerson;
		
		
		/**
		 * 以下部分为对集合操作及输入输出流对文件的操作
		 */
		
		//将信息输入到集合中以便输出操作
		for(int i = 0;i < 4;i++){
			list.add("姓名:" + zhbit.aListOfPerson[i].name 
					 + "编号:" + zhbit.aListOfPerson[i].aBikeRidden.id 
					+ "正在骑" + zhbit.aListOfPerson[i].aBikeRidden.bussiness);
		}
		System.out.println(list);
		
		
		/**
		 * 将集合中的信息输出到文本
		 */
		File f= new File("outputList.txt");
		BufferedWriter bw=new BufferedWriter(new FileWriter(f));
	    for(int i=0;i<list.size();i++){
	    	bw.write(list.get(i));
	    	bw.newLine();
	    }
	    bw.close();
	    
	    
	    /**
	     * 下面对Hashmap存数据
	     */
	    BufferedReader br = new BufferedReader(new FileReader(f));
	    ArrayList<String> arr = new ArrayList<String>();
	    Scanner sc = new Scanner(f);
	    HashMap Hm = new HashMap();
	    int i=0;
	    String stemp;
	    while(sc.hasNextLine()) {
	    	stemp=(String)sc.nextLine();
	    	Hm.put(zhbit.aListOfPerson[i].number, stemp);
	    	i++;
	    }
	    i=0;
	    
	    /**
	     * 下面是对Hashmap的输出操作
	     */
	    File outFile = new File("outputListFromMap.txt");
	    BufferedWriter out = null ;
	    out = new BufferedWriter(new FileWriter(outFile)) ;
	    Iterator it = Hm.keySet().iterator();
	    while(it.hasNext()) {
	    	Object nuTemp = null;
	    	String temp = null;
	    	nuTemp = it.next();
	    	temp=(String)Hm.get(nuTemp);
	    	out.write(temp);
	    	out.newLine();
	    	//byte b[] = temp.getBytes();
	    	//out.write(b);
	    	i++;
	    }
    	out.close();
	    
	    
	    
	    
	    System.out.println(Hm.toString());
	    
	    
	    while(br.ready()) {
	    	String s = br.readLine();
	    	System.out.print(s);
	    	System.out.print("\n");
	    }
	    
		debug=1;
		
	}

}
