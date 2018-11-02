import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        double amount,answer;
        int x,y,z,m;
        x = 250;
        y = 300;
        z = 400;
        m = 500;

        Scanner amountt;
        amountt = new Scanner(System.in);
        System.out.println("Enter the amount between Ksh 1 - Ksh 10,000");
        amount = amountt.nextDouble();

        if ((amount>0) && (amount<=1000)){
            System.out.println("Your total amount is "+(amount+x));
        }else if ((amount>1000) && (amount<=5000)){
            System.out.println("Your total amount is "+(amount+y));
        }else if ((amount>5000)&& (amount<=7000)){
            System.out.println("Your total amount is "+(amount+z));
        }else if ((amount>7000) && (amount<=10000)){
            System.out.println("Your total amount is "+(amount+m));
        }else {
            System.out.println("Invalid Amount");
        }
    }
}
