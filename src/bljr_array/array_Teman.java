package bljr_array;

import java.util.Scanner;

public class array_Teman {
    int N;
    Teman [] a = new Teman[N];

void Bacaarr (){
    System.out.println("Baca nilai setiap elemen array dari keyboard");
    for (int i = 0; i < N; i++) {
    Teman T = new Teman();
        T.baca_Teman();
        a[i]=T;
    }

}

void tampilarr(){

    for (int i = 0; i < N; i++){
        a[i].tampil_Teman();

    }

}

    public static void main(String[] args) {
        array_Teman A = new array_Teman();

        A.Bacaarr();
        A.tampilarr();
    }

}


