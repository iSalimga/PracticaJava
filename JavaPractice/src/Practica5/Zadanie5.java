package Practica5;

public class Zadanie5 {
    private int n;
    private int sumOfNumbers;
    Zadanie5(int n){
        this.n = n;
    }
    public int getSum(){
        this.summutor();
        return sumOfNumbers;
    }
    public void summutor(){
        if ((n%10)!=0){
            sumOfNumbers+=(n%10);
            n /=10;
            this.summutor();
        }
    }
    public String toString(){
        return ""+this.getSum();
    }
}
