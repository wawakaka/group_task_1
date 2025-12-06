class Admin extends User {

    public Admin(String name) {
        super(name);
    }

    @Override
    public void interact() {
        System.out.println("Admin managing the library system.");
    }

    public void addBook(Book[] books, Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                System.out.println("Book added successfully!");
                return;
            }
        }
        System.out.println("No space available to add book!");
    }

    public void removeBook(Book[] books, String title) {
        boolean found = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equalsIgnoreCase(title)) {
                // Shift elements left
                for (int j = i; j < books.length - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[books.length - 1] = null;
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Book removed successfully!");
        } else {
            System.out.println("Book not found!");
        }
    }
}