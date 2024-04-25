package Les_Oct25_Assignment_Users;
import java.util.Scanner;
import java.util.ArrayList;

public class ManageVend {
    Scanner scanInt = new Scanner(System.in);
    Scanner scanStr = new Scanner(System.in);

    ArrayList<Vendor> vendors = new ArrayList<Vendor>();
    // DEFAULT CONSTRUCTOR
    public ManageVend(){
        Vendor v1 = new Vendor("V01","vendor01","Shin Zushi","APU Canteen","0789789123","shinzushi@vendor.apu.my");
        Vendor v2 = new Vendor("V02","vendor02","Din Tai Fung","APU Canteen","0523746928","dintaifung@vendor.apu.my");
        Vendor v3 = new Vendor("V03","vendor03","McDonalds","APU Canteen","0124362989","mcdonalds@vendor.apu.my");
        vendors.add(v1); vendors.add(v2); vendors.add(v3);
    }
    public void viewVendor(){
        System.out.println("====================== LIST OF VENDORS =====================");
        for (int i = 0; i < vendors.size(); i++) {
            System.out.println(vendors.get(i).toString());
        }
    }
    public void insertVendor(){
        String user_id = "";
        String checkuser_id = "";
        int takenid = -1;
        int wrongpw = -1;
        boolean isUserIDTaken = false;

        // taken id = 1 -> id nya blm kepake, loop ke stop
        // wrong pasword = 1 -> pw dah betul, loop nya ke stop
        // wrongps = 0 -> masih salah, loop lagi
        while(takenid != 1){
            System.out.println("==================== VENDOR REGISTRATION ===================");
            System.out.println("User ID\t:");
            checkuser_id = scanStr.nextLine();
            for (int i = 0; i < vendors.size(); i++) {
                if(vendors.get(i).getUserID().equals(checkuser_id)){
                    System.out.println("User ID is already taken. Please input another user ID!");
                    isUserIDTaken = true;
                    takenid = 0; // loop nya bakal tetep jalan lagi dari awal
                }
            }
            if(isUserIDTaken == false){
                user_id = checkuser_id;
                while(wrongpw != 1){
                    System.out.println("Enter password : ");
                    String checkpassword = scanStr.nextLine();
                    for (int i = 0; i < checkpassword.length(); i++) {
                        if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z') jLower++;
                        else if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') jUpper++;
                        else if(password.charAt(i) >= '0' && password.charAt(i) <= '9') jDigit++;
                        else jSymbol++;
                    }
                    if(checkpassword.length() >= 8 && jLower >= 1 && jUpper >= 1 && jDigit >= 1 && jSymbol >= 1){
                        wrongpw = 1;
                        password = checkpassword;
                        // password accepted, nanti lsg masuk ke vendor class.
                        System.out.println("Password meet the requirements.");
                        System.out.println(user_id);
                        System.out.println("Enter other details for vendor registration.");
                        System.out.println("Enter name : ");
                        String name = scanStr.nextLine();
                        System.out.println("Enter address : ");
                        String address = scanStr.nextLine();
                        System.out.println("Enter phone number : ");
                        String phone_num = scanStr.nextLine();
                        System.out.println("Enter email address :");
                        String email_address = scanStr.nextLine();
                        Vendor newVendor = new Vendor(user_id,password,name,address,phone_num,email_address);
                        vendors.add(newVendor);
                    }else{
                        wrongpw = 0;
                        System.out.println("Password does not meet the requirements.\n" +
                                "Please make sure your password has at least 8 characters consisting of Uppercase, Lowercase, Digit, and Symbol.");
                    }
                }
            }
        }

        /*String user_id = "";
        String checkuser_id = "";
        boolean isUserIDTaken = false;
        int takenid = -1; // taken = 0 -> belum diambil, taken = 1 -> sudah di ambil
        int wrongpw = -1; // wrongpw = 0 -> correct, wrongpw = 1 -> incorrect
        System.out.println("==================== VENDOR REGISTRATION ===================");
        System.out.println("User ID\t: ");
        checkuser_id = scanStr.nextLine();
        while(takenid != 1){
            for (int i = 0; i < vendors.size(); i++) {
                if(vendors.get(i).getUserID().equals(checkuser_id)){
                    System.out.println("sini");
                    isUserIDTaken = true;
                }
            }
            if(isUserIDTaken == true){
                System.out.println("here");
                System.out.println("User ID is already taken, please input another user ID!");
                takenid = 1; // KELUAR DARI LOOP, proses selesai
            }else{ // user ID not taken, masukkan checkuserid ke user_id
                user_id = checkuser_id;
                while(wrongpw!=0){ //kalo pass masih salah, disuruh enter password terus
                    takenid = 0; // belum di ambil
                    System.out.println("Enter your password :");
                    String checkpassword = "";
                    String password = "";
                    checkpassword = scanStr.nextLine();
                    int jLower = 0, jUpper = 0, jDigit = 0, jSymbol = 0;
                    for (int i = 0; i < checkpassword.length(); i++) {
                        if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z') jLower++;
                        else if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') jUpper++;
                        else if(password.charAt(i) >= '0' && password.charAt(i) <= '9') jDigit++;
                        else jSymbol++;
                    }
                    // if password meet the requirements, password will be accepted
                    if(checkpassword.length() >= 8 && jLower >= 1 && jUpper >= 1 && jDigit >= 1 && jSymbol >= 1){
                        wrongpw = 0;
                        password = checkpassword;
                        // password accepted, nanti lsg masuk ke vendor class.
                        System.out.println("Password meet the requirements.");
                        System.out.println(user_id);
                        System.out.println("Enter other details for vendor registration.");
                        System.out.println("Enter name : ");
                        String name = scanStr.nextLine();
                        System.out.println("Enter address : ");
                        String address = scanStr.nextLine();
                        System.out.println("Enter phone number : ");
                        String phone_num = scanStr.nextLine();
                        System.out.println("Enter email address :");
                        String email_address = scanStr.nextLine();
                        Vendor newVendor = new Vendor(user_id,password,name,address,phone_num,email_address);
                        vendors.add(newVendor);
                    }else{
                        wrongpw = 1;
                        System.out.println("Password does not meet the requirements.\n" +
                                "Please make sure your password has at least 8 characters consisting of Uppercase, Lowercase, Digit, and Symbol.");
                    }
                }
            }
        }*/
    }
    public void updateVendor(){

    }
    public void deleteVendor(){

    }
}
