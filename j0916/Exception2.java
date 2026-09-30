package j0916;

import java.io.*;

public class Exception2 {
    static void methodA() throws FileNotFoundException {
        FileReader fr = new FileReader("test.txt");
    }

    public static void main(String[] args) {
        try{
            methodA();
        }
        catch(FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
