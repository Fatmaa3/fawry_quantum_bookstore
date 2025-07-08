public class PaperBook extends Book{
    private int stock;
    public PaperBook(String ISBN, String title, String author, int publication_year, double price,int stock) {
        super(ISBN, title, author, publication_year, price);
        this.stock = stock;
    }

    @Override
    public void purchase_method(int quantity,String shipping_address) {
        if (stock < quantity) {
            System.out.println("insufficient stock");
            return;
        } else {
            System.out.println("total amount paid: "+ quantity*getPrice());
        }
    }
}
