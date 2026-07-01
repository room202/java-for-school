// StudentCardクラスの宣言
class StudentCardEx {
    int id;      // 学籍番号保存用
    String name; // 氏名保存用

    // コンストラクタ
    StudentCardEx(int id, String name) {
        System.out.println("StudentCardExクラスのコンストラクタが呼び出されました");
        this.id = id;
        this.name = name;
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        //                               コンストラクタに引数を設定している
        StudentCardEx a = new StudentCardEx(1234, "鈴木太郎");
        System.out.println("aのidの値は" + a.id);
        System.out.println("aのnameの値は" + a.name);
    }
}
