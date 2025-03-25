import java.util.Scanner;
class bankException extends Exception{
    public bankException(String msg){
        super(msg);
    }
}
class Bank{
    int bal=0;
    public void deposite(int amt){
        bal = amt+bal;
        System.out.println("Balance Deposited & Your Balance is : "+bal);
    }
    public void withdraw(int amt) throws bankException {
       if (bal-amt<0) {
        throw new bankException("Not sufficient balance");
       }
       else{

           bal = bal - amt;
           System.out.println("Balance Withdrawn & Your Balance is : "+bal);
        }
    }
}
public class practical24{

    public static void main(String s[]) throws bankException{
        Bank b1 = new Bank();
        int amount=0;
        int ch=0;
        Scanner sc = new Scanner(System.in);
        
        while (ch<3) {
            System.out.println("Enter 1 for deposite");
            System.out.println("Etner 2 for withdraw");
            System.out.println("Enter 3 for exit");
            ch = sc.nextInt();
            if (ch==1) {
                System.out.print("Enter Amount to deposite : ");
                amount = sc.nextInt();
                b1.deposite(amount);
            }
            else if(ch==2){
                System.out.print("Enter Amount to withdraw : ");
                amount = sc.nextInt();
                try {
                    b1.withdraw(amount);
                } catch (bankException e) {
                    System.out.println(e.getMessage());
                }
            }
            
        }
        

        
        // System.out.println("Enter Amount to deposite : ");
        sc.close();

        
    }
}  
