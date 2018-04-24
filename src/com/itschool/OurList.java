package com.itschool;

import java.util.ArrayList;

public class OurList extends ArrayList {
    ArrayList<Integer> ourList;

    public ArrayList<Integer> getOurList() {
        return ourList;
    }

    public void setOurList(ArrayList<Integer> ourList) {
        this.ourList = ourList;
    }

    public OurList(){
        ourList = new ArrayList<>();
    }

    public boolean add (Integer element)
    {
        this.ourList.add(element);
        return true;
    }

    public void set(int index, Integer element) {
        super.set(index, element);
    }

    @Override
    public String toString() {
        String result = "{ ";
//           System.out.println(ourList.size());

        if (ourList.size()>0) {
            for (Integer element : ourList) {
                //System.out.println(element);
                result += element.toString() + ", ";
            }
        }
        result += " }";

        return result;
    }

}
