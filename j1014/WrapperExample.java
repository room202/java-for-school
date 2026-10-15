package j1014;

import java.util.ArrayList;
import java.lang.Integer;   // デフォルトで読み込まれるので書かなくてもいい

public class WrapperExample {
    public static void main(String[] args) {
        int[] intList = new int[10];
        intList[0] = 50;
        intList[1] = 100;
        System.out.println(intList[0]);
        System.out.println(intList[1]);

        //           ↓これはできない
        // ArrayList<int> integerList = new ArrayList<int>();
        // Wrapperクラスを使うと解決できる
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        integerList.add(Integer.valueOf(50));
        integerList.add(Integer.valueOf(100));
        // Integer integer0 = integerList.get(0);
        // Integer integer1 = integerList.get(1);
        System.out.println(integerList.get(0));
        System.out.println(integerList.get(1));
    }
}
