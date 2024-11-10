package bljr_array;

import java.util.Scanner;

public class Teman {

    String nrp, nama, wa;
    Date bday;

    void baca_Teman () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nrp :");
        nrp = sc.next();

        System.out.println("Nama :");
        nama= sc.next();

        System.out.println("Wa :");
        wa = sc.next();

    }

    void tampil_Teman () {
        Date d = new Date(1,8,2004);
        System.out.println("Nrp :" + nrp);
        System.out.println("Nama :" + nama);
        System.out.println("Nama :" + wa);
        bday=d;
        System.out.println("Tanggal Lahir :" + bday.dd + "/" + bday.mm + "/" + bday.y);

    }

    public static void main(String[] args) {

        Teman T = new Teman();

        T.baca_Teman();
        T.tampil_Teman();

    }





}
