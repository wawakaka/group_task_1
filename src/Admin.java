import java.util.List;

class Admin extends User {

    public Admin(String name) {
        super(name);
    }

    @Override
    public void interact() {
        System.out.println("Admin managing the library system.");
    }

    public void addBook(List<Book> books, Book newBook) {
        books.add(newBook);
        System.out.println("Book added successfully!");
    }

    public void removeBook(List<Book> books, String title) {
        boolean found = books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
        if (found) {
            System.out.println("Book removed successfully!");
        } else {
            System.out.println("Book not found!");
        }
    }
}