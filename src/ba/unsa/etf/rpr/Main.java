package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static long sumaCifara(long n){
        long suma = 0;
        while(n != 0){
            suma = suma + n % 10;
            n = n / 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        long n = ulaz.nextLong();
        for(long i = 1; i <= n; i++)
        {
            if(i % sumaCifara(i) == 0) System.out.println(i);
        }
    }
}
