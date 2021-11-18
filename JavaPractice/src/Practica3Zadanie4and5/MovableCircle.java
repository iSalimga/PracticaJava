package Practica3Zadanie4and5;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public void moveUp(){
        center.moveUp();
    }
    public void moveDown(){
        center.moveDown();
    }
    public void moveRight(){
        center.moveRight();
    }
    public void moveLeft(){
        center.moveLeft();
    }
    public String toString(){
        return center+" "+radius;
    }
}
