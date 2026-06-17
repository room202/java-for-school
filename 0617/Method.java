/**
 * Test1クラスのサンプルです<br>
 * テスト改行1<br>
 * テスト改行2 テスト改行3
 * 
 * @author Yagi Yuki
 * @version 1.1
 */

// Method.java
public class Method {
    public static void main(String[] args) {
        display();
        display(2, 3);
        int num = display(2, 3, 4);
        System.out.println(num);
        System.out.println(display(2, 3, 4));
    }

    // 下記メソッドを作ってみてください
    // 戻り値 : なし
    // メソッド名は好きに考えてください
    // 引数 : なし
    // 処理内容
    // 「1 + 1」の結果を画面に表示する
    // mainメソッドから呼び出してください
    public static void display() {
        int num = 1 + 1;
        System.out.println(num);
    }

    // 下記メソッドを作ってみてください
    // 戻り値 : なし
    // メソッド名は好きに考えてください
    // 引数 : int型を2つ
    // 処理内容
    // 引数のint型の２つの値を足し算結果を画面に表示する
    // mainメソッドから呼び出してください
    public static void display(int a, int b) {
        int num = a + b;
        System.out.println(num);
        System.out.println(a + b);
    }

    // 下記メソッドを作ってみてください
    // 戻り値 : int型
    // メソッド名は好きに考えてください
    // 引数 : int型を3つ
    // 処理内容
    // 引数のint型の３つの値を足し算結果を画面に表示する
    // 戻り値として呼び出し元へ返せ
    // mainメソッドから呼び出してください
    public static int display(int a, int b, int c) {
        int num = a + b + c;
        System.out.println(num);
        System.out.println(a + b + c);

        // return num;
        return a + b + c;
    }

	/**
	 * メソッドのサンプル1です
	 * 
	 * @param a メソッドの引数1です
	 * @param b メソッドの引数1です
	 * @param c メソッドの引数1です
	 * @param d メソッドの引数2です
	 * @return intを返します
	 * @throws ArithmeticException 0による除算
	 * 
	 */
    public static int display(int a, int b, int c, int d) {
        int num = a + b + c + d;
        System.out.println(num);
        System.out.println(a + b + c + d);

        // return num;
        return a + b + c + d;
    }
}
