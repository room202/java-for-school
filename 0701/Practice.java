// 個人の情報を表すクラス
class Person {
    String name;    // 名前
    int age;        // 年齢
}

public class Practice {

    // ここに各設問のメソッドを追加する
    // (A)
    static void printInfo(Person p) {
        // 引数で受け取ったPersonインスタンスの情報を出力
        System.out.println("名前 : " + p.name);
        System.out.println("年齢 : " + p.age);
    }

    static boolean ageCheck(Person p, int i) {
        if(p.age > i) {
            return true;
        } else {
            return false;
        }

        // これでもOK
        // return p.age > i;
    }

    static void printYoungerPersonName(Person p1, Person p2) {
        // 年齢の若い方の名前を出力
        // ただし、同じ年齢の場合はp1の名前出力

        // p1の年齢がp2より大きいか判定
        if(p1.age > p2.age) {
            System.out.println(p2.name);
        } else {
            System.out.println(p1.name);
        }
    }
    
    static int getTotalAge(Person p1, Person p2) {
        int age = p1.age + p2.age;
        return age;

        // return p1.age + p2.age
    }

    public static void main(String[] args) {
        Person a = new Person();    // Personクラスを変数aでインスタンス化
        a.name = "高橋太郎";
        a.age = 19;

        Person b = new Person();
        b.name = "小林花子";
        b.age = 20;

        // 追加したメソッドを呼び出す、戻り値がある場合には出力する
        // (B)
        // printInfo(a);
        // printInfo(b);

        System.out.println(ageCheck(a, 19));
        // boolean result = ageCheck(a, 15);
        // System.out.println(result);

        printYoungerPersonName(a, b);

        System.out.println(getTotalAge(a, b));
    }
    
}
