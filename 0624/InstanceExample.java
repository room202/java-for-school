// InstanceExample.java

// StudentCardクラスの宣言
class StudentCard {
    int id;      // 学生番号保存用
    String name; // 氏名保存用
}

public class InstanceExample {
    public static void main(String[] args) {
        // クラスからインスタンスを生成する
        StudentCard studentCard = new StudentCard();
        // インスタンスにデータを流しこむ(代入する)
        studentCard.id = 1234;
        studentCard.name = "鈴木太郎";

        StudentCard studentCard2 = new StudentCard();
        studentCard2.id = 1235;
        studentCard2.name = "佐藤花子";

        // インスタンスに保存したデータを表示(参照)する
        System.out.println("1人目のidの値は" + studentCard.id);
        System.out.println("1人目のnameの値は" + studentCard.name);
        System.out.println("2人目のidの値は" + studentCard2.id);
        System.out.println("2人目のnameの値は" + studentCard2.name);
    }
}
