package Practica3Zadanie4and5;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return this.x+" "+this.y;
    }
    public void moveUp(){
        y -= ySpeed;
    }
    public void moveDown(){
        y += ySpeed;
    }
    public void moveRight(){
        x += xSpeed;
    }
    public void moveLeft(){
        x -= xSpeed;
    }
}
