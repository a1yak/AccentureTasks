package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean evenNumberCheck(int numberToCheck){

        if(numberToCheck%2==0){
           return true;
        }else {
           return false;
        }
    }

    public static boolean clearCollection(ArrayList<String> list){
        list.removeAll(list);
        return list.isEmpty();
    }


}