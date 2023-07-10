package bank;

class Account{
    public String name;
    protected String email;
    private int key;

    //getter & setters
    public int getter(){
        return this.key;
    }
    
    public void setter(int key){
        this.key = key;
    }
}
public class Bank {
    public String name;
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Apna College";
        account1.email = "apnacollege@gmail.com";
        // account1.key = 123456;//not accessible directly
        account1.setter(123456);
        System.out.println(account1.getter());
    }
}