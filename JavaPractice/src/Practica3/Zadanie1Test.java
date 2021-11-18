package Practica3;
import java.util.Scanner;
public class Zadanie1Test {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String name, color;
        double radius, a, b;
        boolean filled;
        Circle circle1 = new Circle();
        radius = in.nextDouble();
        Circle circle2 = new Circle(radius);
        name = in.next();
        color = in.next();
        filled = in.nextBoolean();
        Circle circle3 = new Circle(name, color, filled, radius);
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
        Round round1 = new Round();
        a = in.nextDouble();
        b = in.nextDouble();
        Round round2 = new Round(a,b);
        name = in.next();
        color = in.next();
        filled = in.nextBoolean();
        a = in.nextDouble();
        b = in.nextDouble();
        Round round3 = new Round(name, color, filled, a, b);
        System.out.println(round1);
        System.out.println(round2);
        System.out.println(round3);
    }
}
