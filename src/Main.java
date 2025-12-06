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

        System.out.println("### call interact()");
        admin.interact();
        member.interact();
        System.out.println("### admin adding books");
        admin.addBook(books, book0);
        admin.addBook(books, book1);
        admin.addBook(books, book2);
        admin.addBook(books, book3);
        admin.addBook(books, book4);

        System.out.println("### admin removing books");
        admin.removeBook(books, "SQL for dummies");

        System.out.println("### member borrowing books");
        member.borrowBook(book0);
        member.borrowBook(book2);

        System.out.println("### member returning books");
        member.returnBook(book0);

        System.out.println("### admin trying to find book by title");
        admin.findBookByTitle(books,"java for dummies");

        System.out.println("### list books");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}