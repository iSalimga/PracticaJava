package Practica1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        String name, poroda, color, author;
        int age, pageQuantaty;
        double height;
        Scanner in = new Scanner(System.in);
        System.out.println("name poroda age ");
        name = in.next();
        poroda = in.next();
        age = in.nextInt();
        Dog dog1 = new Dog (age, name, poroda);
        System.out.println(dog1);
        System.out.println("name color height ");
        name = in.next();
        color = in.next();
        height = in.nextDouble();
        Ball ball1 = new Ball (color,name,height);
        System.out.println(ball1);
        System.out.println("name author color pageQuantaty ");
        name = in.next();
        author = in.next();
        color = in.next();
        pageQuantaty = in.nextInt();
        Book book1 = new Book (name, author, color, pageQuantaty);
        System.out.println(book1);
    }
}
