package j1014;

class DataSet {
    int[] data = new int[1000];
}

public class GarbageCollectionExample {
    public static void main(String[] args) {
        System.out.println("空きメモリサイズ:" + Runtime.getRuntime().freeMemory());

        // 巨大なデータをメモリー上に作成 ここから
        DataSet[] data = new DataSet[10000];
        for(int i = 0; i < 10000; i++) {
            data[i] = new DataSet();
            data[i] = null;
            if((i + 1) % 100 == 99) {
                System.out.println("生成済みインスタンス数:" + (i+1) );
                System.out.println("空きメモリサイズ: " + Runtime.getRuntime().freeMemory());
            }
        }
        // 巨大なデータをメモリー上に作成 ここまで
    }
}
