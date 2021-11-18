package Practica2;

public class Practica2 {
    static class Book {
        private String name;
        private String email;
        private char gender;

        public Book(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public char getGender() {
            switch (gender) {
                case 'm': {
                    return gender;
                }
                case 'M':{
                    return gender;
                }
                case 'f':{
                    return gender;
                }
                case 'F':{
                    return gender;
                }
                default: return 'u';
            }
        }

        public void setEmail(String email) {
            this.email = email;
        }
        public String toString(){
            return this.getName()+" is author. "+this.getGender()+" is author's gender. "+this.getEmail()+" is author's email.";
        }
    }
    static class Ball {
        private double x;
        private double y;

        public Ball(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public Ball(){}

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }
        public void setXY(double x,double y) {
            this.x = x;
            this.y = y;
        }
        public void setXYSpeed (double Speed){}
        public void move (double xDisp, double yDisp) {
            x += xDisp;
            y += yDisp;
        }
        public String toString (){
            return "Ball ("+this.getX()+", "+this.getY()+")";
        }
    }
}
