package j1014;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // 配列
        String[] month = new String[10];
        month[0] = "January";
        month[1] = "February";
        month[2] = "March";
        System.out.println("要素数 : " + month.length);
        for(int i = 0; i < month.length; i++) {
            if(month[i] != null) {
                System.out.println(month[i]);
            }
        }

        month[0] = null;
        month[1] = null;
        System.out.println("要素数 : " + month.length);
        for(int i = 0; i < month.length; i++) {
            if(month[i] != null) {
                System.out.println(month[i]);
            }
        }

        // ArrayList
        ArrayList<String> months = new ArrayList<String>();
        months.add("January");  // [0]
        months.add("February"); // [1]
        months.add("March");    // [2]

        System.out.println("要素数 : " + months.size());
        for(int i = 0; i < months.size(); i++) {
            System.out.println(months.get(i));
        }

        months.remove(0);
        months.remove(1);
        System.out.println("要素数 : " + months.size());
        for(int i = 0; i < months.size(); i++) {
            System.out.println(months.get(i));
        }
    }
}
