package Les_Oct25_Assignment_Users;
import java.util.ArrayList;
import java.util.Scanner;
public class ManageCust {
    Scanner scanInt = new Scanner(System.in);
    Scanner scanStr = new Scanner(System.in);
    ArrayList<Customer> customers = new ArrayList<Customer>();

    // DEFAULT CONSTRUCTOR
    public ManageCust(){
        Customer c1 = new Customer("C01","cust01","Eliza","Parkhilll Residence","0123096514","eliza@cust.apu.my");
        Customer c2 = new Customer("C02","cust02","Vicenza","Parkhill Residence","0289167039","vicenza@cust.apu.my");
        Customer c3 = new Customer("C03","cust03","Justyn","Endah Promenade","0390882708","justyn@cust.apu.my");
        customers.add(c1); customers.add(c2); customers.add(c3);
    }
    // PARAMETER CONSTRUCTOR
    public ManageCust(String user_id, String password, String name, String address, String phone_num, String email_add){
        Customer newCust = new Customer(user_id, password, name, address, phone_num, email_add);
        customers.add(newCust);
    }
    // gaperlu pake parameter constructor krn ga ada datanya
    public void insertCustomer(){

    }
    public void updateCustomer(){

    }
}
