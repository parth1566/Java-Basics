package OOPs.Bank;



class Account{
    public String name; // Public modifier
    protected String email; // Protected modifier
    private String password; // private modifier

    // getters annd setters 
    public String getPassword() { // getter
        return this.password;
    }

    public void setPassword(String pass) { // setter
        this.password = pass;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Parth Sharma";
        account1.email = "parth@gmail.com";
        account1.setPassword("abcd"); 
        System.out.println(account1.getPassword());
    }
}

