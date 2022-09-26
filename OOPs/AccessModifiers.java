package Bank;

class Account {
    // access modifiers----4 types
    //1-->public access modifier--> everyone can use
    public String name; // public 
    String type;// default modifier
    protected String email; // protected modifier can be used on same package or another sub class
    private String subject; // private modifier .....no one can use outside of class


    // getters and setters--->use for accessing private modifiers
}

public class AccessModifiers {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Ain";
        account1.type = "gmail";
        account1.email = "ain@12233";
        account1.subject = "OOPs"; // error bcz it is private
    }    
}
