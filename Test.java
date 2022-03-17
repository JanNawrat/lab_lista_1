public class Test {
    public static void main(String args[]) {
        int n, x;
        //pierwsza dana wejściowa
        try {
            n=Integer.parseInt(args[0]);
            if(n<2) {
                System.out.println(args[0] + " - nieprawidłowy zakres");
                return;
            }
            LiczbyPierwsze L = new LiczbyPierwsze(n);
            //kolejne dane wejściowe
            for(int i=1; i<args.length; i++) {
                try {
                    x=Integer.parseInt(args[i]); 
                    if(L.liczba(x)==-1) {
                    System.out.println(x + " - liczba spoza zakresu");
                    }
                    else
                        System.out.println(x +" - "+ L.liczba(x));
                }
                //nieprawdiwłowe kolejne dane wejściowe
                catch (NumberFormatException ex) {
                System.out.println(args[i] + " - nieprawidłowa dana");
                }
            }
        }
        //nieprawidłowa pierwsza dana wejściowa
        catch (NumberFormatException ex) {
        System.out.println(args[0] + " - nieprawidłowy zakres");
        }
    }
}
