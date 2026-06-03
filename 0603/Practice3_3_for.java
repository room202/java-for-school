public class Practice3_3_for {
    public static void main(String[] args) {
        // 10から20までの和
        int sum = 0;

        for(int i = 10; i <= 20; i++) {
            // sum = sum + i;
            sum += i;
        }
        System.out.println("答えは" + sum);

        sum = 0;
        int i = 10;
        while(i <= 20) {
            sum += i;
            i++;
        }
        System.out.println("答えは" + sum);

    }
}
