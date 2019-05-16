package com.template;

public class Template<T> {
	int n;
	T temp;
	<E>E change(E s)
	{
		return s;
	}
	public static void main(String[] args)
	{
		Template t = new Template();
		t.n = 10;
		t.temp = 100;
		System.out.println(t.n + "   " + t.temp);
		Template<String> t1 = new Template<String>();
		t1.temp = "asdasds";
		System.out.println(t1.change("adasdas"));
		Template<Integer> t2 = new Template<Integer>();
		//int s = t2.change(10, 20);
		//System.out.println(s);
	}
}