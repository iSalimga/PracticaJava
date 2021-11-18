package Practica3Zadanie4and5;
import java.util.Scanner;
public class Test {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int xSpeed = in.nextInt();
        int ySpeed = in.nextInt();
        int radius = in.nextInt();
        MovableCircle example = new MovableCircle(x, y, xSpeed, ySpeed, radius);
        example.moveDown();
        example.moveLeft();
        System.out.println(example);
        x = in.nextInt();
        y = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        xSpeed = in.nextInt();
        ySpeed = in.nextInt();
        MovableReactangle rectangle = new MovableReactangle(x, x2, y, y2, xSpeed, ySpeed);
        if (rectangle.speedEquals()) {
            rectangle.moveRight();
            rectangle.moveRight();
            System.out.println(rectangle);
        }
    }
}
