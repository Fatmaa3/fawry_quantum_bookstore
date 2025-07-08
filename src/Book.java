public abstract class Book {
    private String ISBN;
    private String title;
    private String author;
    private int publication_year;
    private double price;
    public Book(String ISBN, String title, String author, int year, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publication_year = year;
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public String getISBN(){
        return ISBN;
    }
    public int getPublication_year(){
        return publication_year;
    }

    public abstract void purchase_method(int quantity,String shipping_method);

}
