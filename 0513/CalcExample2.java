public class CalcExample2 {
    public static void main(String args[]) {
        int num = 0;
        int num2 = 0;
        int i = 10;
        int j = i * 2;  // jの値は20

        System.out.println(num++);
        num++;
        System.out.println(num);

        System.out.println(++num2);
        System.out.println(num2);

        System.out.println("jの値は" + j);

        // ++ : インクリメント
        // 変数++ : 後置インクリメント
        // ++変数 : 前置インクリメント
        // -- : デクリメント
        // 変数-- : 後置デクリメント
        // --変数 : 前置デクリメント
        for(int k = 0; k < 10; k++) {
            System.out.println(k);
        }

    }
}