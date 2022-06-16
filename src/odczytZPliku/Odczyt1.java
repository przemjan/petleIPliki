package odczytZPliku;

import java.io.*;
import java.util.Scanner;

public class Odczyt1 {
    public static void main(String[] args) throws IOException {
        File mojPlik = new File ("danie4.txt");


        Scanner czytaczPlik = new Scanner (mojPlik);


        String linia;

        linia = czytaczPlik.nextLine();

        System.out.println("Pierwsza linia pliku to: " + linia);

        //scanner odczytuje kolejne linie pliku (przechowuje pozycję odczytu)
//        String linia2 = czytaczPlik.nextLine();
//        System.out.println("Druga lina pliku to: " + linia2);


        czytaczPlik.close();
    }
}
