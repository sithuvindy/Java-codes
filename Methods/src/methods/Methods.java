
package methods;


public class Methods {

   
    public static void main(String[] args) {
        Bank user1 = new Bank ();
        user1.deposite(100);
        user1.deposite(200);
        System.out.println(user1.checkBal());
        Bank user2 = new Bank();
        user2.deposite(200);
        user2.deposite(300);
        System.out.println(user2.checkBal());
        
    }
    
}

class Bank {
    int bal = 0;
    void deposite(int amount){
        bal = bal + amount;
    }
    int checkBal(){
        return bal;
    }
}