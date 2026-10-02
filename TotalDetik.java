package Tugaspwd;

import java.util.Scanner;

public class TotalDetik {
     public static void main (String[] args) {
        int jam, menit, detik, totdet;
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukan jam : ");
        jam = input.nextInt();
        
        System.out.print("Masukan menit : ");
        menit = input.nextInt();
        
        System.out.print("Masukan detik : ");
        detik = input.nextInt();
        
        totdet = jam * 3600 + menit * 60 + detik;
        
        System.out.println("Total detik : " + totdet);
        
        
    }
}
