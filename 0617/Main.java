public class Main {

    

    public static void main(String[] args) {
        //hello();
        // countDownメソッドを呼び出す
        //           引数を渡す
        //           実引数
        int start = 10;   // ローカル変数
        int end = 5;      // ローカル変数
        //        第一引数, 第二引数
        countDown(start, end);
    }
    
    // countdownメソッドを宣言する
    //                              引数を受け取る
    //                              仮引数
    //                                 10        5
    public static void countDown(int start, int end) {
        System.out.println("カウントダウンをします");
        for(int i = start; i >= end; i--) {
            System.out.println(i);
        }
        hello();
    }

    // helloメソッドを宣言する
    public static void hello() {
        // 処理
        System.out.println("Hello World");
    }
}
