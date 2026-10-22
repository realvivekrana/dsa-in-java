package Java_Basics;

public class AreaOfCubic {
    public static void main(String[] args) {
        //area of cubic = 2(lb * bh * hl)
        double a = 20;
        double b = 30;
        double c = 40;
        double area = 2 * (a * b + b * c + c * a);
        System.out.println("Area of Cubic =" + area);
    }
}
