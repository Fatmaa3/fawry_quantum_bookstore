public class ShippingService {
    private PaperBook paperBook;
    public ShippingService(PaperBook paperBook) {
        this.paperBook = paperBook;
    }
    public void ShipBook(String address){
        System.out.println("shipping book: " + paperBook.getTitle() + "to address: " + address);
    }
}
