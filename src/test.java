import java.util.List;

public class test {
    public static void main(String[] args) {
        PaperBook paperbook1 = new PaperBook("AB123", "my_Paperbook1", "paperBook_author1", 2002, 20.7, 100);
        PaperBook paperbook2 = new PaperBook("ABCD1", "my_Paperbook2", "paperBook_author2", 2006, 25.8, 80);
        Ebook ebook1 = new Ebook("EFG456", "my_Ebook1", "Ebook_author1", 1900, 30, "txt");
        Ebook ebook2 = new Ebook("TYU78", "my_Ebook2", "Ebook_author2", 2011, 35, "txt");
        DemoBook demoBook = new DemoBook("HIJ89", "my_demobook", "demobook_author", 2013, 10);
        Inventory inventory = new Inventory();
        Quantum_BookStore quantum_book_store = new Quantum_BookStore(inventory);
inventory.addBook(paperbook1);
inventory.addBook(paperbook2);
inventory.addBook(ebook1);
inventory.addBook(ebook2);
inventory.addBook(demoBook);
inventory.removeBook("AB123");
List<Book>removedBooks=inventory.removeOutdatedBooks();
System.out.println("---------------------------");
quantum_book_store.BuyBook("ABCD1",5,"test1@gmail.com","my_address1");
        System.out.println("---------------------------");
quantum_book_store.BuyBook("TYU78",1,"test2@gmail.com","my_address2");
        System.out.println("---------------------------");
quantum_book_store.BuyBook("HIJ89",4,"test3@gmail.com","my_address3");
    }
}
