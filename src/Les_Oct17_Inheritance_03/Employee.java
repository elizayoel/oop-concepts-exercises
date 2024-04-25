package Les_Oct17_Inheritance_03;

public class Employee {
    protected String firstName, lastName, socialSecurityNumber;
    public Employee(){
        firstName = "";
        lastName = "";
        socialSecurityNumber = "";
    }
    public Employee(String f, String l, String s){
        firstName = f;
        lastName = l;
        socialSecurityNumber = s;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }
    public String toString(){
        return  "First name : " + firstName + "\n" +
                "Last name  : " + lastName + "\n" +
                "Social security number : " + socialSecurityNumber + "\n";
    }
}
