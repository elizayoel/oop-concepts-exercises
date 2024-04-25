package Les_Oct17_Inheritance_01;

public class Person3 {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String emailAddress;

    public Person3(){
        name = "";
        address = "";
        phoneNumber = "";
        emailAddress = "";
    }
    public Person3(String name,String address,String phone, String email){
        this.name = name;
        this.address = address;
        phoneNumber = phone;
        emailAddress = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public String toString(){
        return  "Name\t\t\t: " + name + "\n" +
                "Address\t\t\t: " + address + "\n" +
                "Phone Number\t: " + phoneNumber + "\n" +
                "Email Address\t: " + emailAddress + "\n";
    }
}

