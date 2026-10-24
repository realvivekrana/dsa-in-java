package Java_Basics;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[]args){
        //Area of Squares
//        double r = 5;
//        double a  = 3.14 * r * r;
//        System.out.println(a);
        Scanner sc = new Scanner(System.in); //Taking inputs from users

        System.out.print("Enter Raduis: ");
        double r = sc.nextDouble();
        double a = 3.14 * r * r;
        System.out.print("Area is: ");
        System.out.println(a);
    }
}
