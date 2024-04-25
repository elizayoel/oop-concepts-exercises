package Les_Oct09_Inheritance_DosenMahasiswa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        Scanner scanD = new Scanner(System.in);

        Dosen d1 = new Dosen("Yuliana","Surabaya",1400,1976);
        Mahasiswa m1 = new Mahasiswa("Eliza","Semarang",4.00,"Data Analytics",2005);

        System.out.println(d1);
        System.out.println(m1);

        d1.setNama("Eliana");
        m1.setKota("Kuala Lumpur");
        System.out.println(d1);
        System.out.println(m1);

        Mahasiswa [] m = new Mahasiswa[100];
        Dosen [] d = new Dosen[100];

        int n = 0;
        int n2 = 0;
        int menu = -1;

        while(menu != 0){
            System.out.println("1. Add dosen");
            System.out.println("2. Add mahasiswa");
            System.out.println("3. Print dosen");
            System.out.println("4. Print mahasiswa");
            System.out.println("5. Update dosen");
            System.out.println("6. Update mahasiswa");
            System.out.println("7. Hapus dosen");
            System.out.println("8. Hapus mahasiswa");
            menu = scanInt.nextInt();

            if(menu == 1){
                System.out.println("Nama : ");
                String nm = scanStr.nextLine();
                System.out.println("Kota : ");
                String kt = scanStr.nextLine();
                System.out.println("Gaji : ");
                int gj = scanInt.nextInt();
                System.out.println("Tahun Mengajar : ");
                int th = scanInt.nextInt();

                d[n] = new Dosen(nm,kt,gj,th);
                n++;
            }else if(menu == 2){
                System.out.println("Nama : ");
                String nm = scanStr.nextLine();
                System.out.println("Kota : ");
                String kt = scanStr.nextLine();
                System.out.println("GPA : ");
                double gpa = scanD.nextDouble();
                System.out.println("Jurusan : ");
                String jr = scanStr.nextLine();
                System.out.println("Tahun Masuk : ");
                int th = scanInt.nextInt();

                m[n2] = new Mahasiswa(nm,kt,gpa,jr,th);
                n2++;
            }else if(menu == 3){
                for (int i = 0; i < n; i++) {
                    System.out.println(d[i].toString());
                }
            }else if(menu == 4){
                for (int i = 0; i < n2; i++) {
                    System.out.println(m[i].toString());
                }
            }else if(menu == 5){
                System.out.println("Nama dosen yang ingin diubah : ");
                String nn = scanStr.nextLine();
                System.out.println("Masukkan data baru: ");
                System.out.println("Nama : ");
                String nm = scanStr.nextLine();
                System.out.println("Kota : ");
                String kt = scanStr.nextLine();
                System.out.println("Gaji : ");
                int gaji = scanInt.nextInt();
                System.out.println("Tahun Mengajar : ");
                int th = scanInt.nextInt();

                for (int i = 0; i < n; i++) {
                    if(d[i].getNama().equalsIgnoreCase(nn)){
                        d[i].setNama(nm);
                        d[i].setKota(kt);
                        d[i].setGaji(gaji);
                        d[i].setTahunMengajar(th);
                        break;
                    }else {
                        System.out.println("Invalid name");
                    }
                }

            }else if(menu == 6){
                System.out.println("Nama mahasiswa yang ingin diubah : ");
                String nn = scanStr.nextLine();

                System.out.println("Nama : ");
                String nm = scanStr.nextLine();
                System.out.println("Kota : ");
                String kt = scanStr.nextLine();
                System.out.println("GPA : ");
                double gpa = scanD.nextDouble();
                System.out.println("Jurusan : ");
                String jr = scanStr.nextLine();
                System.out.println("Tahun Masuk : ");
                int th = scanInt.nextInt();

                for (int i = 0; i < n2; i++) {
                    if(m[i].getNama().equalsIgnoreCase(nn)){
                        m[i].setNama(nm);
                        m[i].setKota(kt);
                        m[i].setGPA(gpa);
                        m[i].setJurusan(jr);
                        m[i].setTahunMasuk(th);
                        break;
                    }else {
                        System.out.println("Invalid name");
                    }
                }
            }else if(menu == 7){
                System.out.println("Nama yang ingin dihapus : ");
                String nm = scanStr.nextLine();

                for (int i = n-1; i >= 0; i--) {
                    if(d[i].getNama().equalsIgnoreCase(nm)){
                        for (int j = i; j < n-1 ; j++) {
                            d[j] = d[j+1];
                        }
                        n--;
                    }
                }
            }else if(menu == 8){
                System.out.println("Nama yang ingin dihapus : ");
                String nm = scanStr.nextLine();
                for (int i = n2-1; i >= 0; i--) {
                    if(m[i].getNama().equalsIgnoreCase(nm)){
                        for (int j = i; j < n-1 ; j++) {
                            m[j] = m[j+1];
                        }
                        n2--;
                    }
                }

            }
        }
    }
}

// SUPER/PARENT CLASS
class Person {
    // proteced = bisa dipakai class diri sendiri + anak
    // private = diri sendiri
    // public = diri sendiri + anak + psvm
    protected String nama;
    protected String kota;

    public Person(){
        nama = "";
        kota = "";
    }
    public Person(String nm, String kt){
        nama = nm;
        kota = kt;
    }
    public String getNama(){
        return nama;
    }
    public String getKota(){
        return kota;
    }
    public void setNama(String nm){
        nama = nm;
    }
    public void setKota(String kt){
        kota = kt;
    }
    public String toString(){
        return "Nama = " + nama + "\n" + "Kota = " + kota + "\n";
    }
}

// SUB/CHILD CLASS
class Dosen extends Person {
    // SPECIALIZATION
    // attribute khusus kelas ini
    // kelas ini sudah mendapat turunan NAMA, KOTA
    // ada tambahan SPESIALISASI
    private int gaji;
    private int tahunMengajar;

    public Dosen(){
        super("","");
        this.gaji = 0;
        this.tahunMengajar = 0;
    }
    public Dosen(String nm, String kt, int gaji,int th){
        super(nm,kt); //kalau mau mengisi element milik parent class harus pakai SUPER
        //spesialisasi bisa diisi seperti biasa
        this.gaji = gaji;
        this.tahunMengajar = th;
    }
    public int getGaji(){
        return gaji;
    }
    public void setGaji(int gaji){
        this.gaji = gaji;
    }
    public int getTahunMengajar(){
        return tahunMengajar;
    }
    public void setTahunMengajar(int thn){
        tahunMengajar = thn;
    }
    public String toString(){
        return super.toString() + "\n" +
                "Gaji = " + gaji + "\n" +
                "Tahun Mengajar = " + tahunMengajar + "\n";
    }
}

class Mahasiswa extends Person {
    // spesialisasi
    private double GPA;
    private String jurusan;
    private int tahunMasuk;

    public Mahasiswa(){
        super("","");
        GPA = 0;
        jurusan = "";
        tahunMasuk = 0;
    }
    public Mahasiswa(String nm, String kt, double gpa, String jurusan, int th){
        super(nm,kt);
        GPA = gpa;
        this.jurusan = jurusan;
        tahunMasuk = th;
    }
    public void setGPA(double brp){
        GPA = brp;
    }
    public void setJurusan(String apa){
        jurusan = apa;
    }
    public void setTahunMasuk(int th){
        tahunMasuk = th;
    }
    public double getGPA(){
        return GPA;
    }
    public String getJurusan(){
        return jurusan;
    }
    public int getTahunMasuk(){
        return tahunMasuk;
    }
    public String toString(){
        return super.toString() + "\nGPA = " + GPA + "\n" +
                "Jurusan = " + jurusan + "\n" +
                "Tahun Masuk = " + tahunMasuk + "\n";
    }
}


