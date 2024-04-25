package Les_Oct25_Assignment_Users;

public class User {
    protected String user_id, password, name, address, phone_num, email_add;
    public User (){
        user_id = "";
        password = "";
        name = "";
        address = "";
        phone_num = "";
        email_add = "";
    }
    public User(String user_id,String password, String name, String address, String phone_num, String email_add){
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.address = address;
        this.phone_num = phone_num;
        this.email_add = email_add;
    }
    public String getUserID() {
        return user_id;
    }
    public void setUserID(String user_id) {
        this.user_id = user_id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNum() {
        return phone_num;
    }
    public void setPhoneNum(String phone_num) {
        this.phone_num = phone_num;
    }
    public String getEmailAdd() {
        return email_add;
    }
    public void setEmailAdd(String email_add) {
        this.email_add = email_add;
    }
    public String toString(){
        return  "User ID\t\t\t: " + user_id + "\n" +
                "Password\t\t: " + password + "\n" +
                "Name\t\t\t: " + name + "\n" +
                "Address\t\t\t: " + address + "\n" +
                "Phone number\t: " + phone_num + "\n" +
                "Email address\t: " + email_add + "\n";
    }
}
