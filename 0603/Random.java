public class Random {
    public static void main(String[] args) {
        // 1～6のランダムな値を生成する
        int random = (int)(Math.random() * 6) + 1;
        System.out.println(random);
    }
}
