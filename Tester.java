package Q6;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer p = new Customer(2211554, 1731037101, 444459595, "Nafis Anzum", "Mirpur", 50000);

        while(true)
        {
            System.out.println("Enter your choice: ");
            System.out.println("1. Deposit money\n2. With-draw money\n3. Apply for card\n4. Apply for loan\n5. Account Details\n6. Exit");
            int choice = input.nextInt();
            switch(choice)
            {
                case 1: 
                {
                    System.out.println("How much do you want to deposit: ");
                    p.depositeMoney(input.nextDouble());
                    break;
                }
                case 2: 
                {
                    System.out.println("How much do you want to withdraw: ");
                    p.withdrawMoney(input.nextDouble());
                    break;
                }
                case 3:
                {
                    p.requestCard();
                    break;
                }
                case 4:
                {
                    p.applyForLoan();
                    break;
                }
                case 5:
                {
                    System.out.println(p.toString());
                    break;
                }
                case 6:
                {
                    System.exit(0);
                }
            }
        }
   
    }
    
}
