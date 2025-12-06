Class diagram:
```mermaid
classDiagram
    User <|-- Member
    User <|-- Admin
    class User{
        +String id
        +String name
        +interact()
    }
    class Admin{
        +String id
        +String name
        +interact()
        +addBook(Book book)
        +removeBook(Book book)
    }
    class Member{
        +String id
        +String name
        +interact()
        +borrowBook(Book book)
        +returnBook(Book book)
    }
```

output sample:
```text
### call interact()

Admin managing the library system.
Member borrowing or returning books.

### admin adding books

Book added successfully!
Book added successfully!
Book added successfully!
Book added successfully!
Book added successfully!

### admin removing books

Book removed successfully!

### admin trying to find book by title

Book found!

Process finished with exit code 0

```