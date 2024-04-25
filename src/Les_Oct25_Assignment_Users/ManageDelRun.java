package Les_Oct25_Assignment_Users;
import java.util.ArrayList;
import java.util.Scanner;

public class ManageDelRun {
    Scanner scanInt = new Scanner(System.in);
    Scanner scanStr = new Scanner(System.in);
    ArrayList<DelRun> drivers = new ArrayList<DelRun>();

    public ManageDelRun(){
        DelRun d1 = new DelRun("D01","driver01","Samcan","Sungai Besi","0193892039","samcan@driver.apu.my");
        DelRun d2 = new DelRun("D02","driver02","Kayla","Semarang","6289647729","kayla@driver.apu.my");
        drivers.add(d1); drivers.add(d2);
    }
    public ManageDelRun(String user_id, String password, String name, String address, String phone_num, String email_add){
        DelRun newDelRun = new DelRun(user_id, password, name, address, phone_num, email_add);
        drivers.add(newDelRun);
        }
    }
}
