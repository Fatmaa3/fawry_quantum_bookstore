public class MailService {
    private Ebook ebook;
    public MailService(Ebook ebook){
        this.ebook = ebook;
    }
    public void sendBook(String Email){
       System.out.println("sending Ebook: "+ebook.getTitle()+" to email address "+Email);
    }
}
