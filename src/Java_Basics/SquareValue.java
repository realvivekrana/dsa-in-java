package Java_Basics;

import java.util.Scanner;

public class SquareValue {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Value: ");
        int n = sc.nextInt();
        int a = n * n;
        System.out.print("Output: ");
        System.out.println(a);
    }
}
