public class Book {
    private String title;
    private Author author;
    private int yearBook;

    public Book(String title, Author author, int yearBook) {
        this.title = title;
        this.author = author;
        this.yearBook = yearBook;

    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearBook() {
        return this.yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook=yearBook;
    }
}
