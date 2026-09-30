package j0916;

class MyThread extends Thread { // Threadクラスを継承
    public void run() { // runメソッドをオーバーライド
        for (int i = 0; i < 100; i++) {
            System.out.println("MyThreadのrunメソッド(" + i + ")");

            try {
                Thread.sleep(500); // 0.5秒（500ミリ秒）停止
            } catch (InterruptedException e) {
            }
        }
    }
}

class MyThread2 extends Thread { // Threadクラスを継承
    public void run() { // runメソッドをオーバーライド
        for (int i = 0; i < 100; i++) {
            System.out.println("MyThread2のrunメソッド(" + i + ")");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class SimpleThreadTest {
    public static void main(String[] args) {
        MyThread t = new MyThread();    // スレッドのインスタンスを作る
        t.start();

        MyThread t3 = new MyThread();    // スレッドのインスタンスを作る
        t3.start();

        MyThread2 t2 = new MyThread2();    // スレッドのインスタンスを作る
        t2.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("SimpleThreadTestのmainメソッド(" + i + ")");

            try {
                Thread.sleep(700); // 0.5秒（500ミリ秒）停止
            } catch (InterruptedException e) {
            }
        }
    }
}
