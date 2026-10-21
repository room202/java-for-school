package j1021;

interface SayHello {
    public void hello();    // 抽象メソッドの宣言→関数型インターフェース
}

class Greeting {
    static void greet(SayHello s) {
        s.hello();
    }
}

public class AnonymousClassExample {
    public static void main(String[] args) {
        Greeting.greet(new SayHello() {
            public void hello() {
                System.out.println("こんにちは");
            }
        });

        // interface SayHello {
        //     public void hello();    // 抽象メソッドの宣言→関数型インターフェース
        // }
        // ラムダ式で書き直す
        Greeting.greet( () -> { System.out.println("こんにちは"); } );

        // ラムダ式の基本的なテンプレ
        // () -> {
        //
        // };

    }
}
