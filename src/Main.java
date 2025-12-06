public class Main {

    public static void main(String[] args) {
        Book[] books = new Book[10];  // Array with initial capacity

        Book book0 = new Book("Self-Esteem For Dummies", "S. Renee Smith and Vivian Harte");
        Book book1 = new Book("java for dummies", "Barry A. Burd");
        Book book2 = new Book("Python for dummies", "John Paul Mueller");
        Book book3 = new Book("JavaScript for dummies", "Doug Lowe");
        Book book4 = new Book("SQL for dummies", "Allen G. Taylor");

        Admin admin = new Admin("Strygwyr the Bloodseeker");
        Member member = new Member("Kardel");

        admin.interact();
        member.interact();

        admin.addBook(books, book0);
        admin.addBook(books, book1);
        admin.addBook(books, book2);
        admin.addBook(books, book3);
        admin.addBook(books, book4);

        admin.removeBook(books, "SQL for dummies");

        member.borrowBook(book0);
        member.borrowBook(book2);

        member.returnBook(book0);
        member.returnBook(book2);
    }
}