import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Admin admin = new Admin("Strygwyr the Bloodseeker");
        Member member = new Member("Kardel");

        admin.interact();
        member.interact();

        admin.addBook(books, new Book("Self-Esteem For Dummies", "S. Renee Smith and Vivian Harte"));
        admin.addBook(books, new Book("java for dummies", "Barry A. Burd"));
        admin.addBook(books, new Book("Python for dummies", "John Paul Mueller"));
        admin.addBook(books, new Book("JavaScript for dummies", "Doug Lowe"));
        admin.addBook(books, new Book("SQL for dummies", "Allen G. Taylor"));

        admin.removeBook(books, "SQL for dummies");

        member.borrowBook(books.get(0));
        member.borrowBook(books.get(2));

        member.returnBook(books.get(0));
        member.returnBook(books.get(2));
    }
}