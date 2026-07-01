public class Main {
    public static void main(String[] args) {
        // クラスからインスタンスを生成する
        StudentCard studentCard = new StudentCard();
        // インスタンスにデータを流しこむ
        studentCard.id = 12345;
        studentCard.name = "清風太郎";

        StudentCard studentCard2 = new StudentCard();
        studentCard2.id = 6789;
        studentCard2.name = "清風花子";
    }
}
