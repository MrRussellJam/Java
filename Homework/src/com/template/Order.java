package com.template;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

//自定义泛型类
public class Order<T> {

    private int orderId;
    private String orderName;
    private T t;
    List<T> list = new ArrayList<T>();
    //声明泛型类的方法
    public <E>E getE(E e){
        return e;
    }
    //实现数组到集合的复制
    public <E>List fromArrtoList(E[]e,List<E> list1){
        for(E e1:e){
            list1.add(e1);
        }
        return list1;
    }
    public void add(){
        list.add(t);
    }
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", orderName=" + orderName
                + ", t=" + t + "]";
    }
    @Test //自定义泛型类的使用
    public void test3(){
        Order<String> o1 = new Order<String>();
        o1.setOrderId(32);
        o1.setOrderName("fas");
        o1.setT("tt");
        System.out.println(o1);
        o1.add();
        //List<String> list1 = o1.list; //o1中的list存放的是String类型的数据
        System.out.println(o1.list); //或是System.out.println(list1);
        //声明泛型类的方法
        Integer i1 = o1.getE(789);
        System.out.println("i1="+i1);
        
        //1.SubOrder<Boolean> so = new SubOrder<Boolean>();
        SubOrder so = new SubOrder();
        so.setOrderId(34);
        so.setT(true);
        so.add();
        so.setT(true);
        so.add();
        so.setT(false);
        so.add();
        System.out.println(so.list);
    //实现数组到集合的复制
        Integer[] in = new Integer[]{3,5,6};
        List<Integer> list1 = new ArrayList<Integer>();
        o1.fromArrtoList(in, list1);
        System.out.println(list1);
        
    }
    
    public static void main(String[] args)
    {
    	Order<int> t = new Order<int>();
    }
    
}
//1.class SubOrder<T> extends Order<T>{
class SubOrder extends Order<Boolean>{
    
}