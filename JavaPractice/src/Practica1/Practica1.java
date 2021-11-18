package Practica1;

class Dog {
    private int age;
    private String name;
    private String poroda;

    public Dog(int age, String name, String poroda) {
        this.age = age;
        this.name = name;
        this.poroda = poroda;
    }

    public String getName() {
        return name;
    }

    public String getPoroda() {
        return poroda;
    }
    public int intoHuman() {
        return age * 7;
    }
    public String toString() {
        return "The dog name is "+this.getName()+". It is "+this.intoHuman() +" human years old.";
    }
}

class Ball {
    private String color;
    private String name;
    private double height;

    public Ball(String color, String name, double height) {
        this.color = color;
        this.name = name;
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    public double fallingDownTime() {
        if (height>=0) {
            return Math.sqrt(2 * height / 9.8);
        }
        else return 0;
    }
    public String toString() {
        return "It is "+this.getColor()+" ball. It have been falling down for " + this.fallingDownTime();
    }
}

class Book {
    private String name;
    private String author;
    private String color;
    private int pageQuantaty;

    public Book(String name, String author, String color, int pageQuantaty) {
        this.name = name;
        this.author = author;
        this.color = color;
        this.pageQuantaty = pageQuantaty;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getColor() {
        return color;
    }

    public int getPageQuantaty() {
        return pageQuantaty;
    }
    public String toString() {
        return "The "+this.getName()+ " had been written by "+ this.getAuthor() + ". This color is "+ this.getColor()+". It has "+this.getPageQuantaty()+ " pages.";
    }
}
