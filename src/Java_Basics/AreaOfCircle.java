package Java_Basics;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[]args){
        //Area of Squares
//        double r = 5;
//        double a  = 3.14 * r * r;
//        System.out.println(a);
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double a = 3.14 * r * r;
        System.out.println(a);
    }
}
