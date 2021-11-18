package Practica3Zadanie4and5;

public class MovableReactangle implements Movable{
    private MovablePoint topLeft, bottomRight;
    MovableReactangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed){
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    public boolean speedEquals(){
        return (topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed);
    }
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    public String toString(){
        return topLeft.toString()+" "+bottomRight.toString();
    }
}
