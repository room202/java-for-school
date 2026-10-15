package j1014;

class DataSet {
    int[] data = new int[100];
}

public class FreeMemoryTest {
    public static void main(String[] args) {
        System.out.println("空きメモリサイズ:" + Runtime.getRuntime().freeMemory());

        // 巨大なデータをメモリー上に作成 ここから
        DataSet[] data = new DataSet[1000000];
        for(int i = 0; i < 1000000; i++) {
            data[i] = new DataSet();
            if((i + 1) % 500000 == 0) {
                System.out.println("生成済みインスタンス数:" + (i+1) );
                System.out.println("空きメモリサイズ: " + Runtime.getRuntime().freeMemory());
            }
        }
        // 巨大なデータをメモリー上に作成 ここまで
    }
}
