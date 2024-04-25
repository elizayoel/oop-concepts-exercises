package Les_Oct27_01_Interface_Ternak;

public class Sapi extends Ternak{
    private int literSusuPerHari;

    public Sapi(){
        super();
        this.literSusuPerHari = 0;
    }
    public Sapi(boolean isHariIniSudahMakan, boolean isHariIniSudahMinum, int literSusuPerHari){
        super(isHariIniSudahMakan,isHariIniSudahMinum);
        this.literSusuPerHari = literSusuPerHari;
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
        literSusuPerHari = 0;
    }
    public String toString(){
        return super.toString() + "Susu harian = " + literSusuPerHari;
    }

    public int getLiterSusuPerHari() {
        return literSusuPerHari;
    }

    public void setLiterSusuPerHari(int literSusuPerHari) {
        this.literSusuPerHari = literSusuPerHari;
    }
}
