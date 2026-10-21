package j1021;

public class EnhancedForExample {
    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};
        // 今までやってきたfor文
        for(int i = 0; i < months.length; i++ ) {
            System.out.println(months[i]);
        }

        // PHP版拡張for(foreach)
        // foreach($months as $month)

        // 拡張for
        for(String month : months) {
            System.out.println(month);
        }
    }
}
