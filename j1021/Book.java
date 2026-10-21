package j1021;

public class Book implements Comparable<Book> {
    // クラス変数
    String title;   // タイトル
    String author;  // 著者名
    int price;      // 価格

    // コンストラクタ
    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int compareTo(Book b) {
        return this.price - b.price;    // 価格差を戻り値
    }
}
