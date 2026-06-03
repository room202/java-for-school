public class ArrayExample {
    public static void main(String[] args) {
        // Javaでの配列の作り方
        // テストの点数(scores)を保存する配列を例にします

        // int型の配列(要素数5)を作成
        int[] scores = new int[5];
        // それぞれの要素に値を代入
        scores[0] = 50;     // 添え字(インデックス)の0番目に値50を代入
        scores[1] = 55;
        scores[2] = 70;
        scores[3] = 65;
        scores[4] = 80;

        for(int i = 0; i < 5; i++) {
            System.out.println(scores[i]);
        }
    }
}
