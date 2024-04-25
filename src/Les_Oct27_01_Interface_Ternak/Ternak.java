package Les_Oct27_01_Interface_Ternak;

public abstract class Ternak implements Inter01{
    // extends =  is a
    // implements = memakai
    protected boolean isHariIniSudahMakan;
    protected boolean isHariIniSudahMinum;

    public Ternak(){
        isHariIniSudahMinum = false;
        isHariIniSudahMakan = false;
    }
    public Ternak(boolean isHariIniSudahMakan, boolean isHariIniSudahMinum){
        this.isHariIniSudahMakan = isHariIniSudahMakan;
        this.isHariIniSudahMinum = isHariIniSudahMinum;
    }

    public boolean isHariIniSudahMakan() {
        return isHariIniSudahMakan;
    }
    public void setHariIniSudahMakan(boolean hariIniSudahMakan) {
        isHariIniSudahMakan = hariIniSudahMakan;
    }
    public boolean isHariIniSudahMinum() {
        return isHariIniSudahMinum;
    }
    public void setHariIniSudahMinum(boolean hariIniSudahMinum) {
        isHariIniSudahMinum = hariIniSudahMinum;
    }

    public String toString(){
       String cmakan = "";
       String cminum = "";
       if (isHariIniSudahMinum) {
           cminum = "sudah minum ";
       } else {
           cminum = "belum minum ";
       }
       if (isHariIniSudahMakan) {
           cmakan = "sudah makan";
       } else {
           cmakan = "belum makan";
       }
       return "Minum : " + cminum + "\n" + "Makan : " + cmakan + "\n";
    }
}
