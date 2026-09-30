package j0916;

// 自分のオリジナル「例外(Exception)」を作成
class InvalidAgeException extends Exception {
    // コンストラクタ
    InvalidAgeException(String message) {
        super(message);
        System.out.println("オリジナル例外が呼び出され");
    }
}

class Person {
    int age;
    void setAge(int age) throws InvalidAgeException {
        if(age < 0) {
            // 手動で例外を発生させる
            throw new InvalidAgeException("年齢にマイナスの値が指定されました");
        }
        this.age = age;
    }
}

public class MyExceptionExample {
    public static void main(String[] args) {
        Person p = new Person();
        
        try{
            p.setAge(-5);   // マイナスの年齢が来たら危ない！！
        }
        catch(InvalidAgeException e) {
            System.out.println("例外をキャッチしました");
            System.out.println(e);
        }
    }
}
