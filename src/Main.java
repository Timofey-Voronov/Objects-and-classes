import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Author rudyardKipling = new Author("Редьярд", "Киплинг");
        System.out.println("Имя автора книги 'Книга Джунглей' - " + rudyardKipling.getFirstName());
        System.out.println("Фамилия автора книги 'Книга Джунглей' - " + rudyardKipling.getSecondName());


        Book jungleBook = new Book("Книга Джунглей", rudyardKipling, 1894);
        System.out.println("Название книги: " + "'" + jungleBook.getTitle() + "'");
        System.out.println("Автор книги: " + jungleBook.getAuthor().getFirstName() + " " + rudyardKipling.getSecondName());
        System.out.println("Год публикации: " + jungleBook.getYearBook());
        jungleBook.setYearBook(2024);
        System.out.println("Год публикации: " + jungleBook.getYearBook() + " (для примера)");

        System.out.println();

        Author nikolaiNosov = new Author("Николай", "Носов");
        System.out.println("Имя автора книги 'Фантазеры' - " + nikolaiNosov.getFirstName());
        System.out.println("Фамилия автора книги 'Фантазеры' - " + nikolaiNosov.getSecondName());

        Book dreamers = new Book("Фантазеры", nikolaiNosov, 1969);
        System.out.println("Название книги: " + "'" + dreamers.getTitle() +"'");
        System.out.println("Автор книги: " + dreamers.getAuthor().getFirstName() + " " + nikolaiNosov.getSecondName());
        System.out.println("Год публикации: " + dreamers.getYearBook());
        dreamers.setYearBook(2024);
        System.out.println("Год публикации: " + dreamers.getYearBook() + " (для примера)");



    }
}