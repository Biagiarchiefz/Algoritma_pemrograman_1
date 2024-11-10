package modular;

import java.util.Scanner;

public class segiTiga {
    double alas, tinggi, luas;

    void bacaSegitiga(){
        Scanner sc= new Scanner(System.in);
        System.out.println("alas: ");alas=sc.nextDouble();
        System.out.println("tinggi: ");tinggi=sc.nextDouble();
    }

    void tampilkanSegitiga(){
        System.out.println("alas: " +alas);
        System.out.println("tinggi: " + tinggi);
    }

    void hitungLuas(){
        luas=(alas*tinggi)/2;
        System.out.println("luas: "+ luas);
    }

//    void hitungKeliling(){
//        double c;
//        c=Math.sqrt(alas)
//    }

    public static void main(String[] args) {
       int N;
       segiTiga S=new segiTiga();

       Scanner sc= new Scanner(System.in);
        System.out.println("Nilai N: ");N=sc.nextInt();
        for(int i = 1; i <= N; i++){
           S.hitungLuas();
           S.bacaSegitiga();
           S.tampilkanSegitiga();
        }
    }

}
