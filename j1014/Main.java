package j1014;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        MyObject mobj = doSomething();
        mobj.display();
    }

    public static MyObject doSomething() {
        MyObject obj = new MyObject();
        return obj;
    }
}
