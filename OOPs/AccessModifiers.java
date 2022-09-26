package Bank;   // NOTE ---> Encapsulation--> Data and its functions combined together and put in one unit is encapsulation.
// ----> access modifiers and packages come under encapsulation

class Account {
    // access modifiers----4 types
    //1-->public access modifier--> everyone can use
    public String name; // public 
    String type;// default modifier
    protected String email; // protected modifier can be used on same package or another sub class
    private String password; // private modifier .....no one can use outside of class


    // getters and setters--->use for accessing private modifiers
public String getPassword() {
    return this.password;
 }

public void setPassword(String pass) {
    this.password = pass;
 }

}

public class AccessModifiers {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Ain";
        account1.type = "gmail";
        account1.email = "ain@12233";
        account1.setPassword("abcdefhfhffjf");
        System.out.println(account1.getPassword());
        
    }    
}
