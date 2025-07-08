public class DemoBook extends Book {
    public DemoBook(String ISBN, String title, String author, int publication_year, double price) {
        super(ISBN, title, author, publication_year, price);

    }
    @Override
    public void purchase_method(int quantity,String shipping_method){
        System.out.println("Demo books are not for sale ");

    }
}
