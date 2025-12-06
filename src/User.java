import java.util.UUID;

public class User {
    protected String id;
    protected String name;

    public User(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public void interact() {
        System.out.println("some interaction");
    }
}
