public class NestExample {
    public static void main(String[] args) {
        for(int a = 1; a <= 3; a++) {
            System.out.println("a = " + a);
            // ↓ ネスト
            for(int b = 1; b <= 3; b++){
                System.out.println("   b = " + b);
                // ↓ ネスト
                for(int c = 1; c <= 3; c++) {
                    System.out.println("       c = " + c);
                    // ↓ ネスト
                    for(int d = 1; d <= 3; d++) {
                        if(d == 2) {
                            System.out.println("Hello World");    
                        }
                        System.out.println("           d = " + d);
                    }
                }
            }
        }
    }
}
