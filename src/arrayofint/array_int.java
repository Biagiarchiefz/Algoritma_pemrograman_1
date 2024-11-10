package arrayofint;

import bljr_array.array_Teman;

import java.util.Scanner;

public class array_int {
    int N = 3;
    int [] a = new int [N];

    void Bacaarr (){
        System.out.println("Baca nilai setiap elemen array dari keyboard");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            System.out.println( i + ": " );
            a[i] = sc.nextInt();
        }

    }

    void tampilarr(){

        for (int i = 0; i < N; i++){
            System.out.println(i + ": " + a[i]);

        }

    }

    void rata_2 () {
        int total = 0;
        for (int i = 0; i < N; i++){
            total += total + a[i];
        }
        double r = total/N;
        System.out.println("rata-rata : " + r);
    }

    public static void main(String[] args) {
        array_int A = new array_int();

        A.Bacaarr();
        A.tampilarr();
        A.rata_2();
    }









}
