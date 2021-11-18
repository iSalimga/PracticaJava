package Practica5;

import java.util.Scanner;

public class Zadanie6Test {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        Zadanie6 example = new Zadanie6(n);
        System.out.println(example.proverka());
    }
}
