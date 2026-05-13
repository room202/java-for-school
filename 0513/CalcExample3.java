public class CalcExample3 {
    public static void main(String args[]) {
        int i = 11;
        i++;    // 11に+1される→ i => 12
        i /= 2; // i = i / 2; => 12 / 2 => 6
        System.out.println("iの値は" + i);

        int j;
        j = i * i;
        System.out.println("jの値は" + j);

        int k = 2 + 3;
        int m = k * 2;
        System.out.println(m);
        
    }
}