package Practica3Zadanie2;
import java.util.Scanner;
public class Zadanie2Test {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        String color;
        double radius, a, b;
        boolean filled;
        Circle circle1 = new Circle();
        radius = in.nextDouble();
        Circle circle2 = new Circle(radius);
        color = in.next();
        filled = in.nextBoolean();
        Circle circle3 = new Circle( color, filled, radius);
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
        Rectangle round1 = new Rectangle();
        a = in.nextDouble();
        b = in.nextDouble();
        Rectangle round2 = new Rectangle(a,b);
        color = in.next();
        filled = in.nextBoolean();
        a = in.nextDouble();
        b = in.nextDouble();
        Rectangle round3 = new Rectangle(color, filled, a, b);
        System.out.println(round1);
        System.out.println(round2);
        System.out.println(round3);
        Square square1 = new Square();
        a = in.nextDouble();
        Square square2 = new Square(a);
        color = in.next();
        filled = in.nextBoolean();
        a = in.nextDouble();
        Square square3 = new Square(color, filled, a);
        System.out.println(square1);
        System.out.println(square2);
        System.out.println(square3);
        in.close();
    }

}

/* Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
System.out.println(s1); // which version?
System.out.println(s1.getArea()); // which version?
System.out.println(s1.getPerimeter()); // which version?
System.out.println(s1.getColor());
System.out.println(s1.isFilled());
System.out.println(s1.getRadius());
Circle c1 = (Circle)s1; // Downcast back to Circle
System.out.println(c1);
System.out.println(c1.getArea());
System.out.println(c1.getPerimeter());
System.out.println(c1.getColor());
System.out.println(c1.isFilled());
System.out.println(c1.getRadius());
Shape s2 = new Shape();
Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
System.out.println(s3);
System.out.println(s3.getArea());
System.out.println(s3.getPerimeter());
System.out.println(s3.getColor());
System.out.println(s3.getLength());
Rectangle r1 = (Rectangle)s3; // downcast
System.out.println(r1);
System.out.println(r1.getArea());
System.out.println(r1.getColor());
System.out.println(r1.getLength());
Shape s4 = new Square(6.6); // Upcast
System.out.println(s4);
System.out.println(s4.getArea());
System.out.println(s4.getColor());
System.out.println(s4.getSide());

28

// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
Rectangle r2 = (Rectangle)s4;
System.out.println(r2);
System.out.println(r2.getArea());
System.out.println(r2.getColor());
System.out.println(r2.getSide());
System.out.println(r2.getLength());
// Downcast Rectangle r2 to Square
Square sq1 = (Square)r2;
System.out.println(sq1);
System.out.println(sq1.getArea());
System.out.println(sq1.getColor());
System.out.println(sq1.getSide());
System.out.println(sq1.getLength()); */