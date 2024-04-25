package Les_Oct23_Polymorphism_Employee;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        Scanner scanD = new Scanner(System.in);

        Employee [] emp = new Employee [30];
        int n = 0; int opt = -1;
        while(opt!= 3){
            System.out.println("1. Inputkan karyawan");
            System.out.println("2. Cetak karyawan");
            System.out.println("3. Exit");
            opt = scanInt.nextInt();

            if(opt == 1) {
                System.out.println("Pilih tipe jabatan");
                System.out.println("1. Kasir");
                System.out.println("2. Manager");
                System.out.println("3. Director");
                int p = scanInt.nextInt();
                if(p == 1){
                    System.out.println("KASIR");
                    System.out.println("Code\t\t: ");
                    String code = scanStr.nextLine();
                    System.out.println("Name\t\t: ");
                    String name = scanStr.nextLine();
                    System.out.println("City\t\t: ");
                    String city = scanStr.nextLine();
                    System.out.println("Tanggal masuk : ");
                    int day = scanInt.nextInt();
                    System.out.println("Bulan masuk\t:");
                    int month = scanInt.nextInt();
                    System.out.println("Tahun masuk\t: ");
                    int year = scanInt.nextInt();
                    System.out.println("Uang laci awal : ");
                    double uanglaciawal = scanD.nextDouble();
                    System.out.println("Uang pendapatan :");
                    double uangpendapatan = scanD.nextDouble();
                    emp[n] = new Kasir(code,name,city,new MyDate(day,month,year),uanglaciawal,uangpendapatan);
                    n++;
                }else if(p == 2){
                    System.out.println("MANAGER");
                    System.out.println("Code\t\t: ");
                    String code = scanStr.nextLine();
                    System.out.println("Name\t\t: ");
                    String name = scanStr.nextLine();
                    System.out.println("City\t\t: ");
                    String city = scanStr.nextLine();
                    System.out.println("Keahlian\t\t: ");
                    String keahlian = scanStr.nextLine();
                    System.out.println("Tanggal masuk : ");
                    int day = scanInt.nextInt();
                    System.out.println("Bulan masuk :");
                    int month = scanInt.nextInt();
                    System.out.println("Tahun masuk : ");
                    int year = scanInt.nextInt();
                    System.out.println("Tanggal jadi manager : ");
                    int d = scanInt.nextInt();
                    System.out.println("Bulan jadi manager : ");
                    int m = scanInt.nextInt();
                    System.out.println("Tahun jadi manager : ");
                    int y = scanInt.nextInt();
                    emp[n] = new Manager(code,name,city,new MyDate(day,month,year),keahlian,new MyDate(d,m,y));
                    n++;
                }else if(p == 3){
                    // bisa jadi director kalau sudah dua tahun jadi manager
                    // cek dulu di code manager

                    for (int i = 0; i < n; i++) {
                        if (emp[i] instanceof Manager){ // kalau array ke 0 jenis manager, lanjut
                            if(((Manager) emp[i]).getTgljadimanager().getYear() - emp[i].getStartwork().getYear() >= 2){
                                System.out.println("DIRECTOR");
                                System.out.println("Code\t\t: ");
                                String code = scanStr.nextLine();
                                System.out.println("Name\t\t: ");
                                String name = scanStr.nextLine();
                                System.out.println("City\t\t: ");
                                String city = scanStr.nextLine();
                                System.out.println("Tanggal masuk : ");
                                int day = scanInt.nextInt();
                                System.out.println("Bulan masuk :");
                                int month = scanInt.nextInt();
                                System.out.println("Tahun masuk : ");
                                int year = scanInt.nextInt();
                                System.out.println("Tanggal jadi director :");
                                int d = scanInt.nextInt();
                                System.out.println("Bulan jadi director : ");
                                int m = scanInt.nextInt();
                                System.out.println("Tahun jadi director :");
                                int y = scanInt.nextInt();
                                emp[n] = new Director(code,name,city,new MyDate(day,month,year),new MyDate(d,m,y));
                                n++;
                            }else{
                                System.out.println("A director should have at least two years of experience");
                            }
                        }else{
                            System.out.println("Non-manager can not be a director");
                        }
                    }
                }else {
                    System.out.println("Invalid input");
                }
            }else if(opt == 2){
                for (int i = 0; i < n; i++) {
                    System.out.println(emp[i].toString());
                }
            }else{
                System.out.println("Invalid input");
            }
        }
    }
}
