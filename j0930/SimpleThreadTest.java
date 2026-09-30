package j0930;

class MyThread extends Thread { // Threadクラスを継承
    public void run() { // runメソッドをオーバーライド
        for (int i = 0; i < 10; i++) {
            System.out.println("MyThreadのrunメソッド(" + i + ")");
        }
    }
}

public class SimpleThreadTest {
    public static void main(String[] args) {
        MyThread t = new MyThread();    // スレッドのインスタンスを作る
        t.start();

        // スレッドtの処理が終わるのを待つ処理追加
        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("SimpleThreadTestのmainメソッド(" + i + ")");
        }
    }
}
