package Tugas_5_mat;

import java.util.Scanner;

public class PersegiPanjang {
        Scanner s = new Scanner(System.in);
    int panjang;
    int lebar;
            
    public void luas(){
        System.out.print("Input panjang : ");
        panjang = s.nextInt();
        System.out.print("Input lebar : ");
        lebar = s.nextInt();
                
        System.out.println("Luas Persegi Panjang");
        int hasil = panjang * lebar;
        System.out.println("Hasil luas : " + hasil);
    }
    public void keliling(){
        System.out.println("Keliling persegi panjang");
        int hasil = 2 * (panjang + lebar);
        System.out.println("Hasil keliling : " + hasil);
    }
}
