public class Area {
    public static void main(String[] args) {
        double areaOfCircle = getAreaOfCircle(5);
        System.out.println(areaOfCircle);
        return;
    }

    // 円の面積を求めるメソッド
    //           戻り値の型
    //                                            5.0
    public static double getAreaOfCircle(double radius) {
        double areaOfCircle = radius * radius * 3.14;
        return areaOfCircle;
    }
}
