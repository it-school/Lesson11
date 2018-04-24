package com.itschool;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(7);
        System.out.println(list.toString());

        list.add(1,0);
        System.out.println(list.toString());

        list.set(2, -10);
        System.out.println(list.toString());

        Integer a = list.remove(2);
        System.out.println(list.toString());
        System.out.println(a);

        System.out.println(list.remove((Integer)5));
        System.out.println(list.toString());

        System.out.println(list.size());

        System.out.println(list.contains((Integer)7));

        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.toString());

        System.out.println("-------------------");
        System.out.println(list.subList(1,4).toString());

        List <Integer> sublist = list.subList(1,4);

        System.out.println(sublist.toString());
        System.out.println("-------------------------------------------------------");

        OurList olist = new OurList();

        olist.add(5);
        System.out.println(olist.toString());
        System.out.println(olist.size());
        olist.set(0, 7);
        System.out.println(olist.toString());

        //olist.testMethod();
    }
}
