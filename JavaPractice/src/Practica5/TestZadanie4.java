package Practica5;

import java.util.Scanner;

public class TestZadanie4 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int k, s;
        k = in.nextInt();
        s = in.nextInt();
        Zadanie4 a = new Zadanie4 (k, s);
        System.out.println(a);
    }
}
