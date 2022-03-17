import java.lang.Math;

public class LiczbyPierwsze {
    //pola
    private int[] L;
    //metody
    public int liczba(int m) {
        if(m<0||m>=L.length)
            return -1;
        else
            return L[m];
    }
    //konstruktory
    LiczbyPierwsze(int n) {
        //przygotowanie tablicy do sita Erastotenesa
        boolean[] P = new boolean[n+1];
        int licznik=0;
        for(int i=2; i<=n; i++) {
            P[i]=true;
        }
        //sito Erastotenesa
        int i;
        for(i=2; i<=n; i++) {
            if(P[i]==true) {
                for(int j=2*i; j<=n; j+=i) {
                    P[j]=false;
                }
                licznik++;
            }
        }
        //tablica liczb pierwszych
        this.L = new int[licznik];
        int j=2;
        for(int k=0; k<licznik; k++) {
            while(P[j]!=true)
                j++;
            L[k]=j;
            j++;
        }
    }
}