package com.siq.training;

/* How many cartons are needed to package Candy Bars?
    Each Carton can hold 24 Candy Bars.
    If the user Enters <=24, the one Carton.
    If the user Enters >24, 25-48, then two Cartons.
 
    So no matter the number of Candy Bars entered, they
    all need to be put in a Carton.
*/
 
import java.util.Scanner;
 
public class PackagingCalculator {

    private static final int MAX = 24;

    public int getCount(int n) {
        int total = n / MAX;
        int rem = n % MAX;

        if (rem == 0) {
            return total;
        } else {
            return total + 1;
        }
    }

    public static void main(String[] args) {
        PackagingCalculator calc = new PackagingCalculator();
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter the number of Candy Bars: ");
        int x = sc.nextInt();

        int total = calc.getCount(x);

        System.out.printf("You need %d carton%s for %d candy bars%n", total,
                (total > 1) ? "s" : "", x);
    }
}