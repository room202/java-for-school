public class Main2 {
    public static void main(String[] args) {
        String value = "abc";
        try {
            int num = Integer.parseInt(value);
        } catch(Exception e) {
            e.getMessage();
        } finally {
            System.out.println("なんとか終了させました。");
        }
        
        // System.out.println(value + 1);
        // System.out.println(num + 1);
    }
}
