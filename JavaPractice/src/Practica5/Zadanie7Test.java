package Practica5;

import java.util.Scanner;

public class Zadanie7Test {
    public static void main (String []args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Zadanie7 example = new Zadanie7(n);
        example.mnogiteli();
    }
}
