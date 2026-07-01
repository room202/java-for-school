public class Practice {
    // ここに各設問のメソッドを追加する
    // static 戻り値型 メソッド名(引数) {
    //      return 戻り値;
    // }
    static double getTriangleArea(double height, double base) {
        // return base * height / 2.0;
        double area = base * height / 2.0;
        return area;
    }

    // 問い(1)
    static void printHello(int count) {
        // 引数で渡されてきた値(count)分"Hello"を表示する
        for(int i = 0; i < count; i++) {
            System.out.println("Hello");
        }
    }

    // 問い(2)
    static double getRectangleArea(double width, double height) {
        return width * height;
    }

    // 問い(3)
    static String getMessage(String name) {
        return "こんにちは" + name + "さん";
    }

    // 問い(4)
    static int getAbsoluteValue(int value) {
        // 絶対値を返す
        // パターン１
        // if(value < 0) {
        //     return -value;
        // } else {
        //     return value;
        // }

        // パターン２
        // if(value < 0) {
        //     return -value;
        // } 

        // パターン３
        // 三項演算子
        //        (条件式) ? 条件が成立時の値 : 条件が不成立時の値
        return (value < 0) ? -value : value;
    }

    // 問い5
    static double getAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // 問い6
    static boolean isSameAbsoluteValue(int i, int j) {
        return getAbsoluteValue(i) == getAbsoluteValue(j);
    }

    public static void main(String[] args) {
        // 練習
        // 追加したメソッド呼び出し、戻り値がある場合には出力する
        // double triangleArea = getTriangleArea(10.0, 3.0);
        // System.out.println(triangleArea);

        // 問い(1)の呼び出し
        // printHello(5);

        // 問い(2)の呼び出し
        double area = getRectangleArea(5, 10);
        System.out.println(area);

        // 問い(3)の呼び出し
        // String name = getMessage("山田");
        // System.out.println(name);
        System.out.println(getMessage("竹田"));

        // 問い(4)の呼び出し
        // int i = getAbsoluteValue(-3);
        // System.out.println(i);
        System.out.println(getAbsoluteValue(-3));

        // 問い(5)の呼び出し
        System.out.println(getAverage(1.5, 9.7, 2.0));

        // 問い(6)
        System.out.println(isSameAbsoluteValue(3, -3));

    }
}
