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
		 * ��������ļ�����Ϣ������̨
		 */
		File f1 = new File("grouplist.txt");
		
		Scanner fp = new Scanner(f1);
		while(fp.hasNext()) {
			String sDemo = fp.nextLine();
			System.out.println(sDemo);
		}
		
		
		/**
		 * ���²���Ϊ�ֶ�����һЩ�µ�Humanbeing����
		 */
		String whatLabel=Bike.manufactoryLabel;
		
		Bike.manufactoryLabel="jhjhhj";
		// Person a
		Humanbeing aPerson=new Humanbeing("���","170202101111");
		SharedBikeOfLittleGreen aBike=new SharedBikeOfLittleGreen("bike001");
		aBike.personScanCard();
		aPerson.ride(aBike);
		
		String whatLabelA=aBike.manufactoryLabel;

		// Person b
		Humanbeing bPerson=new Humanbeing("�����","170202102222");
		SharedBikeOfOfO bBike=new SharedBikeOfOfO("bike002");
		bPerson.ride(bBike);

		String whatLabelB=aBike.manufactoryLabel;
		
		// Person c
		Humanbeing cPerson=new Humanbeing("�κ�","170202103333");
		SharedBikeOfHello cBike=new SharedBikeOfHello("bike003");
		cPerson.ride(cBike);
		
		Humanbeing dPerson=new Humanbeing("������","170202104444");
		SharedBikeOfHello dBike=new SharedBikeOfHello("bike004");
		dPerson.ride(dBike);
		
		/**
		 * ����Zhbit�����鲢��Humanbeing��������
		 */
		Zhbit zhbit=new Zhbit();
		// start to go to Java course
		zhbit.aListOfPerson=new Humanbeing[4];
		zhbit.aListOfPerson[0]=aPerson;
		zhbit.aListOfPerson[1]=bPerson;
		zhbit.aListOfPerson[2]=cPerson;
		zhbit.aListOfPerson[3]=dPerson;
		
		
		/**
		 * ���²���Ϊ�Լ��ϲ�����������������ļ��Ĳ���
		 */
		
		//����Ϣ���뵽�������Ա��������
		for(int i = 0;i < 4;i++){
			list.add("����:" + zhbit.aListOfPerson[i].name 
					 + "���:" + zhbit.aListOfPerson[i].aBikeRidden.id 
					+ "������" + zhbit.aListOfPerson[i].aBikeRidden.bussiness);
		}
		System.out.println(list);
		
		
		/**
		 * �������е���Ϣ������ı�
		 */
		File f= new File("outputList.txt");
		BufferedWriter bw=new BufferedWriter(new FileWriter(f));
	    for(int i=0;i<list.size();i++){
	    	bw.write(list.get(i));
	    	bw.newLine();
	    }
	    bw.close();
	    
	    
	    /**
	     * �����Hashmap������
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
	     * �����Ƕ�Hashmap���������
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
