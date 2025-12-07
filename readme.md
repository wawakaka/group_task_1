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

# Inheritance (Pewarisan):
Class Admin dan Member mewarisi class User. Artinya, mereka memiliki atribut dan method dasar dari User.

# Polymorphism:
Method interact() di‐override pada Admin dan Member. Hasilnya, meskipun dipanggil melalui referensi User, perilaku interact() akan berbeda tergantung objeknya.