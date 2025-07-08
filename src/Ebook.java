public class Ebook extends Book {
    private String filetype;
    public Ebook(String ISBN, String title, String author, int publication_year, double price,String filetype) {
        super(ISBN, title, author, publication_year, price);
        this.filetype = filetype;
    }

    @Override
    public void purchase_method(int quantity,String email_address) {
        System.out.println("total amount paid: "+ getPrice());
    }
}
