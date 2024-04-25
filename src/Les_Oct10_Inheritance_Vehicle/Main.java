package Les_Oct10_Inheritance_Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("MOBIL\n");
        Mobil m1 = new Mobil(400,800,"Toyota","Fortuner",2023,2200);
        Mobil m2 = new Mobil(300,700,"Mitsubishi","Pajero Sport",2023,2500);
        System.out.println(m1);
        System.out.println(m2);

        System.out.println("\nMOTOR\n");
        Motor mo1 = new Motor(150,500,"Honda","Vario",1000,2);
        Motor mo2 = new Motor(200,700,"Yamaha","CBR",1500,2);
        System.out.println(mo1);
        System.out.println(mo2);

        System.out.println("\nSEPEDA\n");
        Sepeda s1 = new Sepeda(150,0,"Sepeda Gunung",14,"Besi");
        Sepeda s2 = new Sepeda(200,0,"Sepeda Balap",16,"Aluminium");
        System.out.println(s1);
        System.out.println(s2);
    }
}

class Vehicle{
    protected double maxSpeed;
    protected int fuelCapacity; // untuk kendaraan bermotor saja
    public Vehicle(){
        maxSpeed = 0.0;
        fuelCapacity = 0;
    }
    public Vehicle(double spd,int fc){
        maxSpeed = spd;
        fuelCapacity = fc;
    }
    public double getMaxSpeed(){
        return maxSpeed;
    }
    public int getFuelCapacity(){
        return fuelCapacity;
    }
    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public String toString(){
        return "Maximum Speed\t= " + maxSpeed + "\n" +
                "Fuel Capacity\t= " + fuelCapacity + "\n";
    }
}

class Mobil extends Vehicle{
    private String merk;
    private String model;
    private int tahun;
    private int kapasitas;

    public Mobil(){
        super();
        merk = "";
        model = "";
        tahun = 0;
        kapasitas = 0;
    }
    public Mobil(double spd,int fc,String merk,String model,int th,int kp){
        super(spd,fc);
        this.merk = merk;
        this.model = model;
        tahun = th;
        kapasitas = kp;
    }
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    public String getMerk(){
        return merk;
    }
    public String getModel(){
        return model;
    }
    public int getTahun(){
        return tahun;
    }
    public int getKapasitas(){
        return kapasitas;
    }
    public String toString(){
        return  super.toString() +
                "Merk\t\t\t= " + merk + "\n" +
                "Model\t\t\t= " + model + "\n" +
                "Tahun Keluaran\t= " + tahun + "\n" +
                "Kapasitas\t\t= " + kapasitas + "\n";
    }
}

class Motor extends Vehicle {
    private String merk;
    private String tipe;
    private int kapasitas;
    private int jumlahRoda;

    public Motor(){
        super();
        merk = "";
        tipe = "";
        kapasitas = 0;
        jumlahRoda = 0;
    }
    public Motor(double spd, int fc, String merk, String tipe,int kapasitas, int jumlahRoda){
        super(spd,fc);
        this.merk = merk;
        this.tipe = tipe;
        this.kapasitas = kapasitas;
        this.jumlahRoda = jumlahRoda;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
    public void setJumlahRoda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }
    public String getMerk(){
        return merk;
    }
    public String getTipe(){
        return tipe;
    }
    public int getKapasitas(){
        return kapasitas;
    }
    public int getJumlahRoda(){
        return jumlahRoda;
    }
    public String toString(){
        return super.toString() +
                "Merk\t\t\t= " + merk + "\n" +
                "Tipe\t\t\t= " + tipe + "\n" +
                "Kapasitas\t\t= " + kapasitas + "\n" +
                "Jumlah Roda\t\t= " + jumlahRoda + "\n";
    }
}

class Sepeda extends Vehicle{
    private String jenis;
    private int ukuranRoda;
    private String tipeBahanRangka;

    public Sepeda(){
        super();
        jenis = "";
        ukuranRoda = 0;
        tipeBahanRangka = "";
    }
    public Sepeda (double spd, int fc,String jenis, int ukuranRoda,String tipeBahanRangka){
        super(spd,fc);
        this.jenis = jenis;
        this.ukuranRoda = ukuranRoda;
        this.tipeBahanRangka = tipeBahanRangka;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public void setUkuranRoda(int ukuranRoda) {
        this.ukuranRoda = ukuranRoda;
    }
    public void setTipeBahanRangka(String tipeBahanRangka) {
        this.tipeBahanRangka = tipeBahanRangka;
    }
    public String getJenis(){
        return jenis;
    }
    public int getUkuranRoda(){
        return ukuranRoda;
    }
    public String getTipeBahanRangka(){
        return tipeBahanRangka;
    }
    public String toString(){
        return super.toString() +
                "Jenis\t\t\t= " + jenis + "\n" +
                "Ukuran Roda\t\t= " + ukuranRoda + "\n" +
                "Tipe Bahan Rangka = " + tipeBahanRangka + "\n";
    }
}