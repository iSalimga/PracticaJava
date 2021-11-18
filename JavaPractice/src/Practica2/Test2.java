package Practica2;


import java.util.Scanner;

public class Test2 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String name, email;
        char gender;
        double x, y;
        System.out.println("name email gender");
        name = in.nextLine();
        email =in.next();
        gender = in.next().charAt(0);
        Practica2.Book book2 = new Practica2.Book(name, email, gender);
        System.out.println(book2);
        System.out.println("x y");
        x = in.nextDouble();
        y = in.nextDouble();
        Practica2.Ball ball1 = new Practica2.Ball(x, y);
        System.out.println(ball1);
        System.out.println("x y moving");
        x = in.nextDouble();
        y = in.nextDouble();
        ball1.move(x,y);
        System.out.println(ball1);
        Practica2.Ball ball2 = new Practica2.Ball();
        System.out.println("x y");
        x = in.nextDouble();
        y = in.nextDouble();
        ball2.setX(x);
        ball2.setY(y);
        System.out.println(ball2);
        System.out.println("x y moving");
        x = in.nextDouble();
        y = in.nextDouble();
        ball2.move(x,y);
        System.out.println(ball2);
    }
}
