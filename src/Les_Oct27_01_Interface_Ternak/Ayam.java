package Les_Oct27_01_Interface_Ternak;

public class Ayam extends Ternak {
    private int jumTelorPerHari;

    public Ayam(){
        super();
        jumTelorPerHari = 0;
    }
    public Ayam(boolean isHariIniSudahMakan, boolean isHariIniSudahMinum, int jumTelorPerHari){
        super(isHariIniSudahMakan,isHariIniSudahMinum);
        this.jumTelorPerHari = jumTelorPerHari;
    }
    public void makan(){
        if(isHariIniSudahMakan){
            System.out.println("sudah makan loh");
        }else{
            System.out.println("yummy...");
            isHariIniSudahMakan = true;
        }
    }
    public void minum(){
        if(isHariIniSudahMinum){
            System.out.println("sudah minum loh");
        }else{
            System.out.println("yummy...");
            isHariIniSudahMinum = true;
        }
    }
    public void gantiHari(){
        isHariIniSudahMinum = false;
        isHariIniSudahMakan = false;
        jumTelorPerHari = 0;
    }
    public String toString(){
        return super.toString() + "Telur harian = " + jumTelorPerHari + "\n";
    }

    public int getJumTelorPerHari() {
        return jumTelorPerHari;
    }

    public void setJumTelorPerHari(int jumTelorPerHari) {
        this.jumTelorPerHari = jumTelorPerHari;
    }
}
