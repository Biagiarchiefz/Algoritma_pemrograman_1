package membuat_atm;

import java.util.Scanner;

public class atm {

    double jumlah_awal;

    atm (){
        jumlah_awal = 0.0;
    }

    // function untuk memeriksan saldo
    public void ceksaldo (){
        System.out.println("saldo anda saat ini: RP. " + jumlah_awal);
    }

    // function untuk menyetorkan uang
    public void deposit(double amount) {
        if (amount > 0) {
            jumlah_awal += amount;
            System.out.println("Anda telah berhasil menyetorkan Rp " + amount);
        } else {
            System.out.println("Jumlah yang disetor harus lebih dari 0");
        }
    }

    // function untuk menarik uang
    public void penarikan (double amount){
        if (amount > 0) {
            if (jumlah_awal >= amount) {
                jumlah_awal -= amount;
                System.out.println("Anda telah berhasil menarik Rp. " + amount );
            } else {
                System.out.println("Saldo anda tidak cukup untuk melakukan penarikan");
            }
        } else {
            System.out.println("jumlah penarikan harus lebih dari 0");
        }
    }




    public static void main(String[] args) {
        Scanner inputUser =new Scanner(System.in);
        atm atm = new atm();
        int perintah;

        do {
            System.out.println("Selamat datang di atm kelompok kami");
            System.out.println("1. Cek saldo");
            System.out.println("2. Setor tunai");
            System.out.println("3. Tarik tunai");
            System.out.println("4. keluar");
            System.out.print("Pilih Pilihan: ");
            perintah = inputUser.nextInt();

            switch (perintah) {
                case 1:
                    atm.ceksaldo();
                    break;

                case 2:
                    System.out.print("Masukan jumlah yang akan disetor: Rp ");
                    double jumlahdeposit = inputUser.nextDouble();
                    atm.deposit(jumlahdeposit);
                    break;

                case 3:
                    System.out.print("Masukan jumlah yang akan ditarik: Rp ");
                   double jumlahpenarikan = inputUser.nextDouble();
                    atm.penarikan(jumlahpenarikan);
                    break;

                case 4:
                    System.out.print("Terimakasih telah menggunakan atm kelompok kami 4");
                    break;

                default:
                    System.out.print("Perintah tidak valid. Silahkan pilih 1-4");

            }
            System.out.println("");

        } while (perintah != 4);
    }
}
