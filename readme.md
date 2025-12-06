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
```
Admin managing the library system.
Member borrowing or returning books.
Book added successfully!
Book added successfully!
Book added successfully!
Book added successfully!
Book added successfully!
Book not found!
Book borrowed successfully!
Book borrowed successfully!
Book returned successfully!
Book returned successfully!

Process finished with exit code 0
```