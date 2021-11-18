package Practica5;

public class Zadanie6 {
    private int n;
    private int delitel = 1;
    Zadanie6(int n){
        this.n = n;
    }
    public String proverka(){
        delitel++;
        if (n%delitel==0){
            if(delitel==n){
                return "YES";
            }
            else return "NO";
        }
        return this.proverka();
    }
}
