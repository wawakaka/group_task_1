import java.util.UUID;

public class Book {
    private String id;
    private String title;
    private String author;
    private boolean available;

    Book(String title, String author) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable() {
        available = true;
    }

    public void setUnavailable() {
        available = false;
    }
}
