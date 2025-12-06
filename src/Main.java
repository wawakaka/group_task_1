public class Main {

    public static void main(String[] args) {
        Book[] books = new Book[10];  // Array with initial capacity

        Book book0 = new Book("Self-Esteem For Dummies", "S. Renee Smith and Vivian Harte");
        Book book1 = new Book("java for dummies", "Barry A. Burd");
        Book book2 = new Book("Python for dummies", "John Paul Mueller");
        Book book3 = new Book("JavaScript for dummies", "Doug Lowe");
        Book book4 = new Book("SQL for dummies", "Allen G. Taylor");

        User admin = new Admin("Strygwyr the Bloodseeker");
        User member = new Member("Kardel");

        System.out.println("\n### call interact()\n");
        admin.interact();// Polymorphism
        member.interact();//Polymorphism
        System.out.println("\n### admin adding books\n");
        ((Admin) admin).addBook(books, book0);//need to cast as Admin to use admin method
        ((Admin) admin).addBook(books, book1);
        ((Admin) admin).addBook(books, book2);
        ((Admin) admin).addBook(books, book3);
        ((Admin) admin).addBook(books, book4);

        System.out.println("\n### admin removing books\n");
        ((Admin) admin).removeBook(books, "SQL for dummies");

        System.out.println("\n### member borrowing books\n");
        ((Member) member).borrowBook(book0);// need to cast as Member to use member method
        ((Member) member).borrowBook(book2);

        System.out.println("\n### member returning books\n");
        ((Member) member).returnBook(book0);

        System.out.println("\n### admin trying to find book by title\n");
        ((Admin) admin).findBookByTitle(books, "java for dummies");

        System.out.println("\n### admin checking available books\n");
        ((Admin) admin).showAvailableBooks(books);
    }
}