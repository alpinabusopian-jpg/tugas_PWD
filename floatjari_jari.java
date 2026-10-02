package Tugaspwd;

import java.util.Scanner;

public class floatjari_jari {
public static void main(String[] args) {
        Scanner inputJari = new Scanner(System.in);
        float jari, keliling, luas;
        float PHI = 3.14F;
       
        System.out.print("Masukan jari jari : ");
        jari = inputJari.nextFloat();
        luas = PHI*jari*jari;
        keliling = 2*PHI*jari;
        
        System.out.println(luas);
        System.out.println(keliling);
        
    }    
}
