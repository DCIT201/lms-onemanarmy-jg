public class Book{

    // This is your working class.
    private String title;
    private String author;
   
    private boolean isAvailable;

    public Book(String title, String author) {
       this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
  public void setAvailable(boolean available) {
        isAvailable = available;
    
}
