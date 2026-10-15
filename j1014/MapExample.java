package j1014;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();

        //                 キー, バリュー
        map.put("first name", "太郎");
        map.put("last name", "山田");
        map.put("address", "大阪府大阪市");
        map.put("tel", "029-000-0000");

        // System.out.println(map.entrySet());
        // System.out.println(map.values());
        // System.out.println(map.keySet());
        System.out.println(map.get("first name"));
        System.out.println(map.get("last name"));
        System.out.println(map.get("address"));
        System.out.println(map.get("tel"));
        System.out.println(map.get("e-mail"));
    }
}
