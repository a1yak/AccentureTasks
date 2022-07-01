package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();


        colors.add("purple");
        colors.add("magenta");
        colors.add("black");
        colors.add("white");
        colors.add("blue");
        colors.add("pink");
        System.out.println(reverseList(colors));
    }

    public static boolean evenNumberCheck(int numberToCheck) {

        if (numberToCheck % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean clearCollection(ArrayList<String> list) {
        list.removeAll(list);
        return list.isEmpty();
    }


    public static boolean reverseList(ArrayList<String> list) {
        int size = list.size();
        String x, y;
        ArrayList<String> temp = (ArrayList<String>) list.clone();
        for (int i = 0; i < size; i++) {

            x = list.get(i); //purple
            y = list.get(size - i - 1); //
            list.set((size - i - 1), x); //not finished
            list.set(i, y);
            if ((i == (size / 2)) && size % 2 == 1) {
                break;
            }
            if ((i == ((size / 2) - 1)) && size % 2 == 0) {
                break;
            }
        }
        Collections.reverse(list);
        if (temp.equals(list)) {
            return true;
        }
        else {
            return false;
        }
    }

}