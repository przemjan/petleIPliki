package ZapisDoPliku;

import java.io.*;

public class PrintWriterDemo  {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("danie4.txt");

        pw.println("Michał  lubi placki :)");

        //zapisanie kolejnej linii
        //pw.println("Zosia lubi pomidory");

        pw.close();
    }
}
