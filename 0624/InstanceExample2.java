// InstanceExample.java

// StudentCardクラスの宣言
class StudentCard {
    int id;      // 学生番号保存用
    String name; // 氏名保存用
}

public class InstanceExample2 {
    public static void main(String[] args) {
        // クラスからインスタンスを生成する
        StudentCard studentCard2 = new StudentCard();
        StudentCard studentCard3 = studentCard2;


        // インスタンスにデータを流しこむ(代入する)
        studentCard2.id = 1235;
        studentCard2.name = "佐藤花子";

        // インスタンスに保存したデータを表示(参照)する
        System.out.println("2人目のidの値は" + studentCard2.id);
        System.out.println("2人目のnameの値は" + studentCard2.name);
        System.out.println("3人目のidの値は" + studentCard3.id);
        System.out.println("3人目のnameの値は" + studentCard3.name);

        studentCard3.id = 7777;
        studentCard3.name = "林次郎";
        System.out.println("2人目のidの値は" + studentCard2.id);
        System.out.println("2人目のnameの値は" + studentCard2.name);
        System.out.println("3人目のidの値は" + studentCard3.id);
        System.out.println("3人目のnameの値は" + studentCard3.name);
    }
}
