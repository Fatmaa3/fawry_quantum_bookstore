import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private List<Book> Books=new ArrayList<>();
    public  Inventory(){
        this.Books=new ArrayList<>();
    }
    public void addBook(Book book){
        if(book.getISBN()==null){
            throw new NullPointerException("invalid book details");
        }
        else {
            Books.add(book);
            System.out.println("Book with ISBN " +book.getISBN()+ " added successfully");
        }
    }

    public void removeBook(String ISBN){
       Book b= getBook(ISBN);
        if(b==null){
            throw new NullPointerException("book does not exist");
        }
        else {
            Books.remove(b);
            System.out.println("Book with ISBN " +ISBN+ " removed successfully");
        }
    }
    public List<Book> removeOutdatedBooks() {
        List<Book> outdatedBooks = new ArrayList<>();
        Iterator<Book> itr = Books.iterator();
        while (itr.hasNext()) {
            Book book = itr.next();
            if (LocalDate.now().getYear() - book.getPublication_year() > 25) {
                itr.remove();
                outdatedBooks.add(book);
                System.out.println("Book with ISBN " + book.getISBN() + " was removed as an outdated book");
            }
        }
        return outdatedBooks;
    }
    public Book getBook(String ISBN){
        for(Book book:Books){
            if(book.getISBN()== ISBN){
                return book;
            }
        }
        return null;
    }

}
