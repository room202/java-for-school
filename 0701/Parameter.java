// Parameter.java

class Param {
    int x;
}

public class Parameter {
    //                     仮引数
    static void changeParam(int x) {
        x = 100;
    }

    static void changeParam(Param param) {
        param.x = 100;
    }

    public static void main(String[] args) {
        int x = 777;
        changeParam(x);
        System.out.println(x);

        Param param = new Param();
        changeParam(param);
        System.out.println(param.x);
    }
}
