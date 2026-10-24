package Java_Basics;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter first Number: ");
//        int a = sc.nextInt();
//
//        System.out.print("Enter Second Number: ");
//        int b = sc.nextInt();
//
//        System.out.print("Enter Third Number: ");
//        int c = sc.nextInt();
//
//        int sum = a + b + c;
//
//        System.out.print("Output: ");
//        System.out.println(sum);
//
//        sc.close();

        System.out.print("Enter principle: ");
        double p = sc.nextDouble();

        System.out.print("Enter raduis: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        System.out.print("Output: ");
        double si = p * r * t / 100;
        System.out.println(si);

    }
}
