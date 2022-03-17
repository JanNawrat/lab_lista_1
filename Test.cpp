#include <iostream>

#include "LiczbyPierwsze.hpp"

using namespace std;

int main(int argc, char *argv[]) {
    int n, x;
    //pierwsza dana wejściowa
    try {
        n=stoi(argv[0]);
        if(n<2) {
            cout<<argv[0]<<" - nieprawidłowy zakres"<<endl;
            return;
        }
        LiczbyPierwsze *L = new LiczbyPierwsze(n);
        //kolejne dane wejściowe
        for(int i=1; i<argv.size(); i++) {
            try {
                x=stoi(argv[i]); 
                if(L->liczba(x)==-1) {
                    cout<<x<<" - liczba spoza zakresu"<<endl;
                }
                else
                    cout<<x<<" - "<<L->liczba(x)<<endl;
                }
                //nieprawdiwłowe kolejne dane wejściowe
                catch (exception &err) {
                    cout<<argv[i]<<" - nieprawidłowa dana"<<endl;
                }
            }
        }
        //nieprawidłowa pierwsza dana wejściowa
        catch (exception &err) {
            cout<<argv[0]<<" - nieprawidłowy zakres"<<endl;
        }
        return 0;
}

