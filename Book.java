package function;

public class Book {
    public String title;
    public int releaseYear;
    public Author author;
    public int pages;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean matches(String word) {
        return  (this.author.name.contains(word) || this.title.contains(word) || this.author.surname.contains((word)));
    }

    public boolean isBig() {
        return (this.pages > 500);
    }

    public int estimatePrice() {
        int price = this.pages * 3 * (int) Math.floor(Math.sqrt(this.author.rating));
        return (Math.max(price, 250));
    }

}
