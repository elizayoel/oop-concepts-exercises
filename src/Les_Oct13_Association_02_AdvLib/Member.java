package Les_Oct13_Association_02_AdvLib;

public class Member {
    private String name;
    private Book [] books_borrowed;
    private int couBook;

    public Member(){
        name = "";
        books_borrowed = new Book[5];
        couBook = 0;
    }
    public Member(String nm){
        name = nm;
        books_borrowed = new Book[10];
        couBook = 0;
    }
    public String getName(){
        return name;
    }
    public Book [] getBooks_borrowed(){
        return books_borrowed;
    }
    public Book getBookBorrow(int pos){
        return books_borrowed[pos];
    }
    public Book getBookBorrow(String title){
        Book result = null;
        for (int i = 0; i < couBook; i++) {
            if(books_borrowed[i].getTitle().equalsIgnoreCase(title)){
                result = books_borrowed[i];
            }
        }
        return result;
    }
    public void borrow_book(Book b){
        // kalau mau pinjam masuk ke list books_borrowed
        books_borrowed[couBook] = b; // shallow copy
        couBook++;
    }
    public boolean return_book(Book b){
        int posKembali = -1;
        for (int i = 0; i < couBook; i++) {
            if(books_borrowed[i].getTitle().equalsIgnoreCase(b.getTitle())){
                posKembali = i;
            }
        }
        if (posKembali == -1){
            System.out.println("Buku tidak ada di member");
            return false;
        }else{
            for (int i = posKembali; i < couBook-1; i++) {
                books_borrowed[i] = books_borrowed[i+1]; // dimajuin krn list yg i udah dikembaliin, keluar dari list pinjaman member
            }
            couBook -= 1;
            return true;
        }
    }
}

class Staff {
    private String nama;
    private String password;

    public Staff(String n, String p){
        nama = n;
        password = p;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNama(){
        return nama;
    }
    public String getPassword(){
        return password;
    }
}