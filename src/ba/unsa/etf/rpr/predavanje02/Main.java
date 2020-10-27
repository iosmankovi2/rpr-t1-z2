package ba.unsa.etf.rpr.predavanje02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int n;
	System.out.println("Unesi n: ");
	n = input.nextInt();
	for(int i = 1; i <= n; i++)
    {
        if(i % sumaCifara(i) == 0) System.out.print("To brojevi su:  "+i + " ");

    }
    }

    private static int sumaCifara(int broj) {
        int cifra, suma = 0;
        while(broj != 0)
        {
            cifra = broj % 10;
            suma += cifra;
            broj = broj /10;
        }
        return suma;
    }
}
