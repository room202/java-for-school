public class PasswordExample {
    public static void main(String[] args) {
        String password = "trustno1";

        if(password.equals(args[0])) {
            System.out.println("パスワードが一致しました。");
        } else {
            System.out.println("パスワードが違います。");
        }

    }
}
