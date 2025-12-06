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