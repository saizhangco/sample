package com.kenny.java.copyobject;

/**
 * @Author : saizhang
 * @Date : 2019/12/04
 * @Time : 22:18
 * @Description : Java对象的拷贝，浅拷贝、深拷贝、延时拷贝
 */
public class CopyObject {
    /**
     * 浅拷贝：基本的数据类型（无论拆箱装箱）可以创建副本，引用类型创建引用副本，
     *       两个对象之间可以通过不同的引用修改同一个对象
     * 深拷贝：引用类型，不但会创建引用副本，还会创建一个对象副本
     * 浅拷贝和深拷贝实际应用：
     */
    public static void main(String[] args) {
        MyObject myObject1 = new MyObject();
        myObject1.setAaa(11);
        myObject1.setBbb("12");
        myObject1.setCcc(13);
        myObject1.setDdd('x');
        myObject1.setRef(new MyRef(17, "18"));
        MyObject myObject2 = (MyObject) myObject1.clone();
        myObject2.setAaa(14);
        myObject2.setBbb("15");
        myObject2.setCcc(16);
        myObject2.setDdd('y');
        myObject2.getRef().setEee(19);
        myObject2.getRef().setFff("20");
        System.out.println(myObject1);
        System.out.println(myObject2);
    }
}
