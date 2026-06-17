public class ReturnExample2 {
    public static void main(String[] args) {
        int i = -10;

        // System.out.println(i > 0);

        if(isPositiveNumber(i)) {
            System.out.println("iの値は正です");
        } else {
            System.out.println("iの値は負またはゼロです");
        }
    }

    //                                      -10
    public static boolean isPositiveNumber(int i) {
        return (i > 0); // false
    }
}
