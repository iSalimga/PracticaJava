package Practica5;

import java.util.Scanner;

public class TestZadanie5 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Zadanie5 example = new Zadanie5(n);
        System.out.println(example);
    }
}
