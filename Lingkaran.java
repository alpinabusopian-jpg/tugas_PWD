package Tugas_5_mat;

import java.util.Scanner;

public class Lingkaran {
        
    Scanner s = new Scanner(System.in);
    double r;
    
    public void luas(){
        System.out.println("Masukkan jari : ");
        r = s.nextDouble();
        System.out.println("Luas lingkaran");
        double hasil = 3.14 * (r * r);
        System.out.println("Hasil luas : " + hasil);
    }
    public void keliling(){
        System.out.println("Keliling lingkaran");
        double hasil = 2 * 3.14 * r;
        System.out.println("Hasil keliling : " + hasil);
    }
}
