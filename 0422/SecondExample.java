// ここはクラス名を設定している
public class SecondExample {
    // Javaはmainから実行されるので、mainが無いと動かない
    public static void main(String[] args) {
        // PHPの場合
        // $i = 10;
        // $i = "aiueio";

        // 10(数値)を保存する場合
        int i = 5;              // int型 : 整数値専用の変数(箱)を作る宣言
        double j = 3.14;        // double型 : 小数点がある値専用の変数(箱)を作る宣言
        String k = "こんにちは"; // String型 : 文字、文字列専用の変数(箱)を作る宣言
        int l = 0;  // 変数の初期化

        // ここでは画面に指定した文字を表示する処理
        //System.out.println("こん\nに\tちは\"山田さん\"");
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        l = 100;
        System.out.println(l);
    }
}