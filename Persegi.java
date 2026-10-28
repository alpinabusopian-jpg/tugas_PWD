package Tugas_5_mat;

import java.util.Scanner;

public class Persegi {
        Scanner s = new Scanner(System.in);
    int sisi;
    
    public void luas(){
        System.out.println("Masukkan sisi : ");
        sisi = s.nextInt();
        System.out.println("Luas persegi");
        int hasil = sisi * sisi;
        System.out.println("Hasil luas : " + hasil);
    }
    public void keliling(){
        System.out.println("Keliling persegi");
        int hasil = sisi * 4;
        System.out.println("Hasil keliling : " + hasil);
    }
}
