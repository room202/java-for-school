package j0930;

class MyThread implements Runnable {
    public void run() { // オーバーライド(上書き)
        for (int i = 0; i < 100; i++) {
            System.out.println("MyThreadのrunメソッド(" + i + ")");
        }
    }
}

public class SimpleThreadTest2 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread thread = new Thread(t);  // 継承(extends)形式と違うところ
        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("mainメソッド(" + i + ")");
        }
    }
}
