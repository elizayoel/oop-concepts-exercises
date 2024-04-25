package Les_Oct13_Association_02_AdvLib;

public class Library {
    private String Name;
    private Book[] Books;
    private Member[] Members;
    private Staff[] Staffs;

    private int couBook = 0;
    private int couMember = 0;
    private int couStaff = 0;

    public Library(String ln) {
        Name = ln;
        Books = new Book[100];
        Members = new Member[500];
        Staffs = new Staff[10];
    }

    public int getCouStaff(){
        return couStaff;
    }
    public void addStaff(Staff st){
        Staffs[couStaff] = st;
        couStaff++;
    }
    public Staff getStaff(int index){
        if(index >= 0 && index < couStaff){
            return Staffs[index];
        }
        return null; // if the index is out of bounds
    }
    public Book getBook(int index){
        if(index >= 0 && index < couBook){
            return Books[index];
        }
        return null; // if the index is out of bound
    }
    public void addBook(Book bk) {
        Books[couBook] = bk;
        couBook++;
    }

    public int getCouBook(){
        return couBook;
    }
    public void removeBook(Book bk) {
        int posremove = -1;
        // cari judul yang mau dihapus
        for (int i = 0; i < couBook; i++) {
            if (Books[i].getTitle().equalsIgnoreCase(bk.getTitle())) {
                posremove = i;
            }
        }
        if (posremove == -1) {
            System.out.println("Book tidak ditemukan");
        } else {
            for (int i = posremove; i < couBook - 1; i++) {
                Books[i] = Books[i + 1];
            }
        }
        couBook--;
    }
    public void addMember(Member mb) {
        Members[couMember] = mb;
        couMember++;
    }
    public void removeMember(Member mb){
        int posremove = -1;
        for (int i = 0; i < couMember; i++) {
            if(Members[i].getName().equalsIgnoreCase(mb.getName())){
                posremove = i;
            }
        }
        if(posremove == -1){
            System.out.println("Member tidak ditemukan");
        }else{
            for (int i = posremove; i < couMember - 1 ; i++) {
                Members[i] = Members[i+1];
            }
            couMember--;
        }
    }
    public boolean borrowBook(Book bk, Member mb){
        if(bk.check_availability() == true){
            bk.set_availability(false); // supaya gabisa dipinjem org lain
            mb.borrow_book(bk);
            return true;
        }else{
            return false;
        }
    }
    public boolean returnBook(Book bk, Member mb){
        Book hasil = mb.getBookBorrow(bk.getTitle()); // masukkan JUDUL BUKU yg mau dikembaliin MEMBER
        if(hasil == null){
            System.out.println("Member " + mb.getName() + " tidak pinjam buku " + bk.getTitle());
            return false;
        }else{
            bk.set_availability(true); // bisa dipinjam
            return mb.return_book(bk); // hapus buku dari list pinjaman member
        }
    }
    public void printBookList(){
        for (int i = 0; i < couBook ; i++) {
            System.out.println(Books[i]);
        }
    }
}
