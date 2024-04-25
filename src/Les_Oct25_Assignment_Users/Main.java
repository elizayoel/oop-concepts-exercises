package Les_Oct25_Assignment_Users;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // attribute punya Main
    // GLOBAL VARIABLES
    Scanner scanInt = new Scanner(System.in);
    Scanner scanStr = new Scanner(System.in);

    // ARRAYLIST OBJECTS
    ArrayList<Admin> admins = new ArrayList<Admin>();

    // DEFAULT CONSTRUCTOR MAIN
    public Main()
    {
        Admin a1 = new Admin("A01","admin01","Anna Admin","APU Student Centre 4th floor","0123456789","anna@admin.apu.my");
        Admin a2 = new Admin("A02","admin02","Sasa Admin","APU Student Centre 4th floor","0987654321","sasa@admin.apu.my");
        admins.add(a1); admins.add(a2);
    }
    public void UserRegistration(){
        System.out.println("=================== NEW USER REGISTRATION ==================");
        System.out.println("1. Register New Vendor");
        System.out.println("2. Register New Customer");
        System.out.println("3. Register New DelRun Runner");
        System.out.println("4. Back to Admin Menu");
        System.out.println("Enter your choice");
        int opt = scanInt.nextInt();
        if(opt == 1){
            System.out.println("==================== VENDOR REGISTRATION ===================");
            System.out.println("Enter the details below : ");
            System.out.println("User ID\t:");
            String user_id = scanStr.nextLine();

            // check if the user ID is already taken
            boolean isUserIdTaken = false;
            for (int i = 0; i < vendors.size(); i++) {
                if(vendors.get(i).getUserID().equals(user_id)){
                    System.out.println("User ID is already taken. Please choose a different one. ");
                    // set boolean to true
                    isUserIdTaken = true;
                    break; // exit the loop as the user ID is already taken
                }
            }
            // if not taken yet
            // put this outside the loop otherwise you will add this data in every array element until vendor.size()
            if(!isUserIdTaken){
                System.out.println("Enter password : ");
                String password = scanStr.nextLine();
                int jLower = 0, jUpper = 0, jDigit = 0, jSymbol = 0;
                for (int i = 0; i < password.length(); i++) {
                    if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z') jLower++;
                    else if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') jUpper++;
                    else if(password.charAt(i) >= '0' && password.charAt(i) <= '9') jDigit++;
                    else jSymbol++;
                }

                if(password.length() >= 8 && jLower >= 1 && jUpper >= 1 && jDigit >= 1 && jSymbol >= 1){
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
                    System.out.println("Password does not meet the requirements.\nPlease make sure your password has at least 8 characters consisting of Uppercase, Lowercase, Digit, and Symbol.");
                }
            }
        }else if(opt == 2){
            System.out.println("=================== CUSTOMER REGISTRATION ===================");
            System.out.println("Enter the details below : ");
            System.out.println("User ID\t:");
            String user_id = scanStr.nextLine();


        }else if(opt == 3) {
            System.out.println("================ DELIVERY RUNNER REGISTRATION ===============");
            System.out.println("Enter the details below : ");
            System.out.println("User ID\t:");
            String user_id = scanStr.nextLine();

        }else if(opt == 4){
            System.out.println("Back to admin menu...");
        }
    }
    public void VendorManagement(){
        System.out.println();
        System.out.println("1. View Vendor List");
        System.out.println("2. Update Vendor List");
        System.out.println("3. Delete Vendor From List");
        System.out.println("4. Back to Admin Menu");
        System.out.println("Enter your input : ");
        int opt = scanInt.nextInt();
        if(opt == 1){
            System.out.println("====================== LIST OF VENDORS =====================");
            for (int i = 0; i < vendors.size(); i++) {
                System.out.println(vendors.get(i).toString());
            }
        }else if(opt == 2){
            System.out.println("===================== UPDATE VENDOR LIST ===================");
            String user_id = "";
            System.out.println("Please input the User ID you want to update : ");
            String checkuser_id = scanStr.nextLine();
            for (int i = 0; i < vendors.size(); i++) {

            }

        }else if(opt == 3){
            System.out.println("======================= DELETE VENDOR ======================");
        }else if(opt == 4){
            System.out.println("Back to admin menu...");
        }
    }

    public void CustomerManagement(){

    }
    public void DeliveryRunnerManagement(){

    }
    public void TopUpCustomerCredit(){

    }
    public void GenerateTransactionReceipt(){

    }
    public void SendReceiptToCustomer(){

    }
    public void LoginAdmin(){
        System.out.println("======================== ADMIN LOGIN =======================");
        System.out.println("User ID\t: ");
        String user_id = scanStr.nextLine();
        System.out.println("Password\t: ");
        String password = scanStr.nextLine();
        for (int i = 0; i < admins.size(); i++) {
            if(admins.get(i).getUserID().equals(user_id) && admins.get(i).getPassword().equals(password)){
                int opt = -1;
                while(opt != 0) {
                    System.out.println("======================== ADMIN MENU ========================");
                    System.out.println("1. User Registration");
                    System.out.println("2. Vendor Management");
                    System.out.println("3. Customer Management");
                    System.out.println("4. DelRun Runner Management");
                    System.out.println("5. Top-Up Customer Credit");
                    System.out.println("6. Generate Transaction Receipt");
                    System.out.println("7. Send Receipt to Customer");
                    System.out.println("0. Back to Main Menu");
                    System.out.println("Enter your choice");
                    opt = scanInt.nextInt();
                    if(opt == 1){
                        UserRegistration();
                    }else if(opt == 2){
                        VendorManagement();
                    }else if(opt == 3){
                        CustomerManagement();
                    }else if(opt == 4){
                        DeliveryRunnerManagement();
                    }else if(opt == 5){
                        TopUpCustomerCredit();
                    }else if(opt == 6){
                        GenerateTransactionReceipt();
                    }else if(opt == 7){
                        SendReceiptToCustomer();
                    }else if(opt == 0){
                        System.out.println("You have been logged out as admin");
                    }else{
                        System.out.println("Invalid input");
                    }
                }
            }else{
                System.out.println("Your login is unsuccessful, please enter the correct user ID and password.");
            }
        }
    }
    public void LoginVendor(){
        System.out.println("======================= VENDOR LOGIN =======================");
        System.out.println("User ID\t: ");
        String user_id = scanStr.nextLine();
        System.out.println("Password\t: ");
        String password = scanStr.nextLine();

    }
    public void LoginCustomer(){
        System.out.println("====================== CUSTOMER LOGIN =====================");
        System.out.println("User ID\t: ");
        String user_id = scanStr.nextLine();
        System.out.println("Password\t: ");
        String password = scanStr.nextLine();

    }
    public void LoginDriver(){
        System.out.println("================== DELIVERY RUNNER LOGIN =================");
        System.out.println("User ID\t: ");
        String user_id = scanStr.nextLine();
        System.out.println("Password\t: ");
        String password = scanStr.nextLine();

    }
    // urutan methods ga masalah letaknya
    public void MainMenu(){
        int menu = -1;
        while(menu != 0){
            System.out.println("LOGIN AS:");
            System.out.println("1. Admin");
            System.out.println("2. Vendor");
            System.out.println("3. Customer");
            System.out.println("4. DelRun Runner ");
            System.out.println("0. Exit");
            System.out.println("Enter your choice :");
            menu = scanInt.nextInt();

            if(menu == 1){ // ADMIN
                LoginAdmin();
            }else if(menu == 2){ // VENDOR
                LoginVendor();
            }else if(menu == 3){ // CUSTOMER
                LoginCustomer();
            }else if(menu == 4){ // DRIVER
                LoginDriver();
            }else if(menu == 0){
                System.out.println("You're quitting the program...");
            }else{
                System.out.println("Invalid input");
            }
        }
    }
    public static void main(String[] args) {
        Main mymain = new Main();
        mymain.MainMenu(); // memanggil menu, di dalam menu akan memanggil login methods

    }
}
