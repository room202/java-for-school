package j0916;

public class ExceptionExample {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        try {
            int c = a / b; // 0除算
            System.out.println("cの値は" + c);
        }
        catch(ArithmeticException e) {
            System.out.println("例外をキャッチしました");
            System.out.println(e);
            return;
        }
        finally {
            System.out.println("finallyブロックの処理です");
        }
        System.out.println("プログラムを終了します");

        // int型の配列で要素数3(0～2)
        // int[] scores = new int[3];
        // scores[0] = 50;
        // scores[1] = 55;
        // scores[2] = 70;
        // scores[3] = 65;
    }
}
