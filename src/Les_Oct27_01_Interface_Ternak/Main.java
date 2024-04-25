package Les_Oct27_01_Interface_Ternak;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        ArrayList<Ternak> ternak = new ArrayList<>();

        int menu = -1;
        while(menu != 0){
            System.out.println("1. Tambah sapi");
            System.out.println("2. Tambah ayam");
            System.out.println("3. Beri makan sapi");
            System.out.println("4. Beri makan ayam");
            System.out.println("5. Beri minum sapi");
            System.out.println("6. Beri minum ayam");
            System.out.println("7. Perah sapi");
            System.out.println("8. Semua ayam bertelur");
            System.out.println("9. Cetak semua ayam");
            System.out.println("10. Cetak semua sapi");
            System.out.println("11. Ganti hari");
            System.out.println("0. Exit");
            menu = scanInt.nextInt();
            if(menu == 1){
                ternak.add(new Sapi());
            }else if(menu == 2){
                ternak.add(new Ayam());
            }else if(menu == 3){
                // semua sapi dikasih makan
                for (int i = 0; i < ternak.size(); i++) {
                    if(ternak.get(i) instanceof Sapi){
                        ternak.get(i).makan();
                    }
                }
            }else if(menu == 4){
                for (int i = 0; i < ternak.size(); i++) {
                    if(ternak.get(i) instanceof Ayam){
                        ternak.get(i).makan();
                    }
                }
            }else if(menu == 5){
                for (int i = 0; i < ternak.size(); i++) {
                    if(ternak.get(i) instanceof Sapi){
                        ternak.get(i).minum();
                    }
                }
            }else if(menu == 6){
                for (int i = 0; i < ternak.size(); i++) {
                    if(ternak.get(i) instanceof Ayam){
                        ternak.get(i).minum();
                    }
                }
            }else if(menu == 7){
                for (int i = 0; i < ternak.size(); i++) {
                    if(ternak.get(i) instanceof Ayam){
                        int telorTambah = (((Ayam) ternak.get(i)).getJumTelorPerHari() + 1);
                        ((Ayam) ternak.get(i)).setJumTelorPerHari(telorTambah);
                    }
                }
            }else if(menu == 8){
                for (int i = 0; i < ternak.size(); i++) {
                    if(ternak.get(i) instanceof Sapi){
                        int literTambah = ((Sapi) ternak.get(i)).getLiterSusuPerHari() + 1;
                        ((Sapi) ternak.get(i)).setLiterSusuPerHari(literTambah);
                    }
                }
            }else if(menu == 9){
                for (int i = 0; i < ternak.size(); i++) {
                    if(ternak.get(i) instanceof Ayam){
                        System.out.println(ternak.get(i).toString());
                    }
                }
            }else if(menu == 10){
                for (int i = 0; i < ternak.size(); i++) {
                    if(ternak.get(i) instanceof Sapi){
                        System.out.println(ternak.get(i).toString());
                    }
                }
            }else if(menu == 11){
                for (int i = 0; i < ternak.size(); i++) {
                    ternak.get(i).gantiHari();
                }
            }
        }
    }
}
