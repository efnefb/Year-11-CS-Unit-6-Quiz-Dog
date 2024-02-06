public class Owner {
    private String firstName, lastName, phoneNumber;
    public Owner(String fn, String ln, String pn){
        firstName = fn;
        lastName = ln;
        phoneNumber = pn;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String fn){
        firstName = fn;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String ln){
        lastName = ln;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String pn){
        phoneNumber = pn;
    }
}
