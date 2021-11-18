package Practica5;

public class Zadanie8 {
    private static String str;
    Zadanie8(String str){
        this.str = str;
    }
    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
    public static boolean isEqual(){
        return str.equals(reverse(str));
    }
    public String toString(){
        if(isEqual()) return ("YES");
        else return ("NO");
    }
}
