package Les_Oct13_Association_01_SimpleLibrary;
public class Book02 {
    private String title;
    private String author;
    private String ISBN;
    private int year;

    public Book02(){
        title = "";
        author = "";
        ISBN = "";
        year = 0;
    }
    public Book02(String t, String a, String i, int y){
        title = t;
        author = a;
        ISBN = i;
        year = y;
    }
    public String getTitle (){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getISBN (){
        return ISBN;
    }
    public int getYear(){
        return year;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String toString(){
        return "Title : " + title + "\n" +
                "Author : " + author + "\n" +
                "ISBN : " + ISBN + "" + "\n" +
                "Year : " + year + "\n";
    }
}

