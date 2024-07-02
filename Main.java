import java.util.Scanner;

public class Main {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int pin = 1234;
        int balance = 1000;
        int add=0;
        boolean loop=true;
        int withd=0;
        String name = "Musavirudeen";
        System.out.println("-----------------Welcome to ATM Machine-------------------");
        System.out.println("\nEnter your pin here...");
        int password = sc.nextInt();
        if (password == pin) {
            System.out.println("\nHi! " + name);
            while (loop) {
                System.out.println("\n1. Check Balance\n2. Deposite Money\n3. Withdraw Money\n4. Take Receipt\n5. Exit\n");
                System.out.println("Enter number: ");
                int op = sc.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Your Balance is: "+balance);
                        break;
                    case 2:
                        System.out.println("Enter amount you want to Add?");
                        add=sc.nextInt();
                        balance=balance+add;
                        System.out.println("Thank you...");
                        break;
                    case 3:
                        System.out.println("Enter amount you want to withdraw?");
                        withd=sc.nextInt();
                        if(balance>=withd){
                            System.out.println("Your amount withdrawed Successfully...");
                            balance=balance-withd;
                        }
                        else{
                            System.out.println("Insufficient balance....");
                            System.out.println("Try to Enter Less Amount you want to withdraw");
                            continue;
                        }
                        break;
                    case 4:
                        System.out.println("-----Mini Statement-------");
                        System.out.println("Your name: "+name);
                        System.out.println("Your Current Balance: "+balance);
                        break;

                    default:
                        System.out.println("Thank you For using....");
                        loop=false;
                        continue;
                }
            }

        } else {
            System.out.println("Your pin is wrong....\nPlease Try Again Later.....");
            System.out.println("Thank You.....");
        }

    }
}