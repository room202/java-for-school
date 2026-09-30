package j0916;

public class ExceptionExample6 {
    public static void main(String[] args) {
        int[] scores = new int[5];
        int a = 4;
        int b = (int)(Math.random() * 10);  // 0～9のランダム値

        System.out.println("b=" + b);

        try{
            int c = a / b;  // 0除算の可能性あり！！危ない！！
            System.out.println("cの値は" + c);
            scores[b] = 10; // 配列の添え字に存在しない値が来る可能性がある！！危ない！！
            System.out.println("処理が正常に行われました");
        }
        catch(ArithmeticException e) {  // ゼロ除算対策
            System.out.println("0除算発生");
            System.out.println(e);
            e.getStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e) {   // 配列の要素対策
            System.out.println("配列の要素番号エラー");
            System.out.println(e);
            e.getStackTrace();
        }
        System.out.println("プログラム終了します");
    }
}
