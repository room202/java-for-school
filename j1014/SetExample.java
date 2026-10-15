package j1014;

import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        // set.add("Feb");
        // set.add("Feb");
        // set.add("Mar");
        // set.add("Apr");
        System.out.println(set.add("Jan")); // true
        System.out.println(set.add("Feb")); // true
        System.out.println(set.add("Feb")); // false
        System.out.println(set.add("Mar")); // true
        System.out.println(set.add("Apr")); // true
        System.out.println(set);
        System.out.println(set.contains("Jan"));  // true
        System.out.println(set.contains("Jun"));  // false
    }
}
