public class DoWhile {
    public static void main(String[] args) {
        // 繰り返し処理で、最低１回は繰り返し内の処理実行したい場合に使う
        int i = 10;
        do {
            System.out.println("do-whileこんにちは" + i + "回目");
            i++;
        } while(i < 5);
        
        int k = 10;
        while(k < 5) {
            System.out.println("whileこんにちは" + k + "回目");
            k++;   
        }

        // for(int j = 0; j < 5; j++) {
        //     System.out.println("こんにちは" + j + "回目");
        // }
    }
}
