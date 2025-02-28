import function.Author;
import function.Book;
public class main {
    public static void main (String[] args) {
        Book book = new Book("dar", 1955, new Author("ad","ada", 24), 20);
        System.out.println(book.isBig());
        System.out.println((book.matches("ton")));
        System.out.println(book.estimatePrice());

    }
}
