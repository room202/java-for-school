package j0930;

class MyThreadEx extends Thread { // Threadクラスを継承
    public boolean running = true;
    public void run() { // runメソッドをオーバーライド
        while(running) {
            System.out.print("*");
        }
        System.out.println("runメソッドを終了します");
    }
}

public class ThreadStopExample {
    public static void main(String[] args) {
        MyThreadEx t = new MyThreadEx();    // スレッドのインスタンスを作る
        t.start();

        // 1秒処理を止める
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        // 処理を止める処理
        t.running = false;

    }
}
