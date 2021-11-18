package Practica3Zadanie2;

abstract class Shape {
    protected String color;
    protected boolean filled;
    Shape(){
        this.color = "black";
        this.filled = true;
    }
    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setFiled(boolean filled){
        this. filled = filled;
    }
    public boolean isFilled(){
        return this.filled;
    }
    abstract double getArea();
    abstract double getPerimetr();
}
class Circle extends Shape{
    protected double radius;
    Circle(){
        this.color ="red";
        this.filled = false;
        double radius = 1;
    }
    Circle (double radius){
        this.color = "blue";
        this.filled = true;
        this.radius = radius;
    }
    Circle (String color, boolean filled, double radius){
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimetr(){
        return Math.PI*radius*2;
    }
    public String toString(){
        return "Color: "+this.getColor()+" Is filled: "+this.isFilled()+" Radius: "+this.getRadius()+" Perimetr: "+this.getPerimetr()+" Area: "+this.getArea();}
}

class Rectangle extends Shape{
    protected double length;
    protected double width;

    public Rectangle(){
        this.color = "green";
        this.filled = false;
        this.length = 1;
        this.width = 1;
    }
    public Rectangle(double length, double width){
        this.color = "yellow";
        this.filled = true;
        this.length = length;
        this.width = width;
    }
    public Rectangle(String color, boolean filled, double lenght, double width){
        this.color = color;
        this.filled = filled;
        this.length = lenght;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getPerimetr(){
        return 2*(this.width+this.length);
    }
    public double getArea(){
        return this.length*this.width;
    }
    public String toString(){
        return "Color: "+this.getColor()+" Is filled: "+this.isFilled()+" Lenght: "+this.getLength()+" Width: "+this.getWidth()+" Perimettr: "+this.getPerimetr()+" Area: "+this.getArea();
    }
}


class Square extends Rectangle{
    Square(){
        super.setColor("white");
        super.setFiled(false);
        super.setLength(1);
        super.setWidth(1);
    }
    Square(double side){
        super.setColor("purple");
        super.setFiled(true);
        super.setWidth(side);
        super.setLength(side);
    }
    Square(String color, boolean filled, double side){
        super.setColor(color);
        super.setFiled(filled);
        super.setLength(side);
        super.setWidth(side);
    }
    public void setWidth(double side){
        super.setWidth(side);
    }
    public void setlLength(double side){
        super.setLength(side);
    }
    public double getWight(){
        return super.getWidth();
    }
    public double getLength(){
        return super.getLength();
    }
    public String toString(){
        return "Color: "+super.getColor()+" Is filled: "+super.isFilled()+" Side: "+super.getLength();
    }
}