package Practica5;

public class Zadanie7 {
    private int n;
    Zadanie7(int n){
        this.n = n;
    }
    public void mnogiteli(){
        int i = 2;
        if ((n%i)==0){
            System.out.println(i);
            n /= i;
            if((n%i)!=0){
                mnogiteli(i);
            }else mnogiteli();
        }
    }
    public void mnogiteli(int i){
        i++;
        if ((n%i)==0){
            System.out.println(i);
            n /= i;
            if((n%i)!=0){
                mnogiteli(i);
            }else mnogiteli(i);
        }
    }
}
