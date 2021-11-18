package Practica3;

abstract class Shape {
    protected String name;
    protected String color;
    protected boolean filled;
    abstract double getPerimetr();
    abstract double getArea();
}
class Circle extends Shape{
    protected double radius;
    public Circle(){
        this.filled = false;
        this.color = "red";
        this.name = "Circle";
        this.radius = 1;
    }
    public Circle(double radius){
        this.radius = radius;
        this.filled = true;
        this.name = "FilledCircle";
        this.color = "green";
    }
    public Circle(String name, String color, boolean filled, double radius){
        this.name = name;
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }
    public double getPerimetr(){
        return 2*Math.PI*radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public String toString(){
        return "Name: "+ this.name+" Color: "+this.color+" Filled: "+this.filled+" Radius: "+this.radius+ " Perimetr: "+ this.getPerimetr()+ " Area: "+this.getArea();
    }
}

class Round extends Shape{
    protected double a;
    protected double b;
    Round(){
        this.name = "Round";
        this.color = "black";
        this.filled = false;
        this.a = 1;
        this.b = 1;
    }
    Round(double a, double b){
        this.name = "Round";
        this.color = "white";
        this.filled = true;
        this.a = a;
        this.b = b;
    }
    Round (String name, String color, boolean filled, double a, double b){
        this.name = name;
        this.color = color;
        this.filled = filled;
        this.a = a;
        this.b = b;
    }
    public double getPerimetr(){return 2*(this.a+this.b);}
    public double getArea(){return a*b;}
    public String toString(){
        return "Name: "+this.name+" Color: "+this.color+" Filled: "+this.filled+" Lenght: "+this.a+" Widht: "+this.b+" Perimetr: "+this.getPerimetr()+" Area: "+this.getArea();
    }
}