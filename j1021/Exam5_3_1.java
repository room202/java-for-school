package j1021;

import java.util.Iterator;
import java.util.LinkedList;

public class Exam5_3_1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("(1)");
        list.add("(2)");
        list.add("(3)");

        System.out.println("問題文のfor文");
        for(int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }

        // (1) 拡張for文を使って書き換えてください。
        System.out.println("拡張for文");
        for(String str : list) {
            System.out.println(str);
        }

        // (2) イテレータを使って書き換えてください
        System.out.println("イテレータ文");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
