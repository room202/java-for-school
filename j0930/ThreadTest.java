package j0930;

class SimpleThread implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        // Thread thread = new Thread(new SimpleThread());
        // thread.start();
        
        SimpleThread st = new SimpleThread();
        Thread thread = new Thread(st);
        thread.start();
    }
}
