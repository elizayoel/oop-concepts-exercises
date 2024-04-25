package Les_Oct25_Assignment_Users;

public class Vendor extends User{
    public Vendor (){
        super();
    }
    public Vendor (String user_id,String password, String name, String address, String phone_num, String email_add){
        super(user_id,password,name,address,phone_num,email_add);
    }
    public String toString(){
        return super.toString();
    }
}
