public class TypeExample {
    public static void main(String args[]) {
        int num = 100;       // 整数値・・・小数点が無い値(-1, 0, 1)
        double d = 9.9;      // 実数値・・・小数点が有る値(3.14)
        boolean bool = true; // 真偽値・・・true(真) : 1/false(偽) : 0
        String str = "こんにちは世界";  // 文字列(複数文字)
        char c = 'あ';       // 文字(1文字)
        byte b = 81;

        System.out.println("dの値は" + d);
        System.out.println("cの値は" + c);
        System.out.println("bの値は" + b);
        System.out.println("boolの値は" + bool);
        System.out.println("strの値は" + str);
        System.out.println("numの値は" + num);
    }
}
