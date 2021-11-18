package Practica5;

public class Zadanie4 {
    private int k;
    private int s;
    private int quant;
    Zadanie4 (int k, int s){
        this.k = k;
        this.s = s;
        this.proverka();
    }
    private void proverka (){
        for (int i = (int) Math.pow(10, k-1);i<(int) Math.pow(10, k); i++){
            int k = i;
            int sum = 0;
            while (k!=0){
                sum += (k%10);
                k /= 10;
            }
            if (sum == s){quant++;}
        }
    }
    public int getQuant(){
        return quant;
    }
    public String toString(){
        return ""+this.getQuant();
    }
}





