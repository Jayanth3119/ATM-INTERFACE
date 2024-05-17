
import java.util.Scanner;

public class ATM {
    Scanner sc =  new Scanner(System.in);
    public void Withdraw(int num){
        System.out.println("------------------------------------------");
        System.out.print("Enter amount for Withdraw : ");
        int amount =  sc.nextInt();
        if(amount>num){
            System.out.println("Insufficient balance for withdrawls");
        }
        else{
            System.out.println("Successful withdrawal");
            System.out.println("Please collect your money ");
            System.out.print("Your bank balance is : "+(num-amount));
        }
        System.out.println("------------------------------------------");
    }

    public void Deposit(int num){
        System.out.println("------------------------------------------");
        System.out.print("Enter amount for deposit : ");
        int amt = sc.nextInt();
        int total=num+amt;
        System.out.println("Successful deposit");
        System.out.println("Your bank balance is : "+total);
        System.out.println("------------------------------------------");
    }

    public void CheckBalance(int num){
        System.out.println("------------------------------------------");
        System.out.println("your bank balance : "+num);
        System.out.println("------------------------------------------");
    }
    public static void main(String[] args) {
        int Amount = 12000;
        Scanner sc =  new Scanner(System.in);
        System.out.println("WellCome to ATM");
        System.out.println("1 : Withdraw");
        System.out.println("2 : Deposit");
        System.out.println("3 : Check Balance");
        System.out.println("4 : Exit");
        System.out.print("Select option for banking : ");
        int num = sc.nextInt();

        ATM obj =  new ATM();
        if(num==1){
            obj.Withdraw(Amount);
        }
        else if(num==2){
            obj.Deposit(Amount);
        }else{
            obj.CheckBalance(Amount);
        }
    }
}
