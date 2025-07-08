import java.util.ArrayList;

public class Quantum_BookStore {
    private Inventory inventory;
    public Quantum_BookStore( Inventory inventory) {
       this.inventory = inventory;
    };
    public void BuyBook(String isbn,int quantity,String email,String address){
        Book book=inventory.getBook(isbn);
        if(book == null){
            throw new UnsupportedOperationException("book does not exist");
        }
        else{
           if(book instanceof PaperBook){
               ShippingService shippingService = new ShippingService((PaperBook) book);
               shippingService.ShipBook(address);
               book.purchase_method(quantity,address);
           }
           else if(book instanceof Ebook){
               MailService mailService = new MailService((Ebook) book);
               mailService.sendBook(email);
               book.purchase_method(quantity,email);
           }
           else if(book instanceof DemoBook){
               DemoBook demoBook = (DemoBook) book;
               demoBook.purchase_method(quantity,email);
            }
        }

    }
}
