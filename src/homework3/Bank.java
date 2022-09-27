package homework3;

import java.util.Scanner;

public class Bank {
    static Scanner sc = new Scanner(System.in);
    static String firstName = sc.nextLine();
    static String secondName = sc.nextLine();
    static double payment = sc.nextDouble();

    public static void calculateDeposit(int yearsOfDepocite){
        double depocite = ((payment * 15) / 100) * yearsOfDepocite;
        System.out.println(firstName + " " + secondName + " approved the deposit for " + yearsOfDepocite + " years " + depocite);
    }

}
