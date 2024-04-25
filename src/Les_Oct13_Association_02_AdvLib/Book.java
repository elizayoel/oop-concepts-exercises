package Les_Oct13_Association_02_AdvLib;

public class Book {
    private String title;
    private String author;
    private Boolean isAvailable;

    public Book(){
        title = "";
        author = "";
        isAvailable = true;
    }
    public Book(String title, String author){
        this.title = title;
        this.author = author;
        isAvailable = true;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }

    // Boolean harus pakai huruf besar karena
    public Boolean check_availability(){
        if (isAvailable == false) {
            return false;
        }else{
            return true;
        }
    }
    public void set_availability(boolean b){
        isAvailable = b;
    }
    public String toString() {
        return "Title = " + title + "\n" +
                "Author = " + author + "\n" +
                "Available = " + isAvailable + "\n";
    }
}
