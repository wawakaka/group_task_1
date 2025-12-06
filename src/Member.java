class Member extends User {

    public Member(String name) {
        super(name);
    }

    @Override
    public void interact() {
        System.out.println("Member borrowing or returning books.");
    }

    public void borrowBook(Book book) {
        book.setUnavailable();
        System.out.println("Book borrowed successfully!");
    }

    public void returnBook(Book book) {
        book.setAvailable();
        System.out.println("Book returned successfully!");
    }
}