package j0930;

public class SleepExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(2000);     // 1000ミリ秒は1秒＝1秒止める
            } catch(InterruptedException e) {
                System.out.println(e);
            }
            System.out.print("*");
        }
    }
}
