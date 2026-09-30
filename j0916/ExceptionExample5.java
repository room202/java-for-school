package j0916;

class SimpleClass {
    void doSomething() {
        int array[] = new int[3];
        try {
            array[10] = 99;
        } catch(Exception e) {
            System.out.println("doSomethingでエラー");
        }
        
        System.out.println("doSomethingメソッドを終了します");
    }
}

public class ExceptionExample5 {
    public static void main(String[] args) {
        SimpleClass obj = new SimpleClass();
        try {
            obj.doSomething();
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("例外をキャッチしました");
            e.printStackTrace();
        }
    }
}
