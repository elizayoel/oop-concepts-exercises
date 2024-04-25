package Les_Oct13_Association_01_SimpleLibrary;

public class Library02 {
    private String name;
    private String location;
    private Book02 [] COB;
    private int max; // untuk maximum arraynya brp
    private int n; // posisi array sekarang dimana

    public Library02 (){
        this.name = "";
        this.location = "";
        this.COB = new Book02[10]; // defaultnya terserah mau berapa
        this.n = 0; // posisi array masih nol krn gada buku
        this.max = 10; //sesuaiin sm max default array, nnti dipake buat n < max
    }
    public Library02(String name, String location, int max){
        this.max = max;
        this.name = name;
        this.location = location;
        this.COB = new Book02[this.max];
        this.n = 0; // dipakai kalo buat object baru aja
    }
    public void setName(String name){
        this.name = name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void addCollection(Book02 newCollection){
        if(this.n < this.max){
            this.COB[this.n] = newCollection;
            this.n++;
        }
        else{
            System.out.println("Collection has reached the maximum.");
        }
    }

    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
    public Book02 [] getCOB(){
        return COB;
    }
    public int getJumlahCollection(){
        return n;
    }
    public int getMaxCollection(){
        return max;
    }
    public void printBookList(){
        for (int i = 0; i < n; i++) {
            System.out.println(COB[i]);
        }
    }
}

