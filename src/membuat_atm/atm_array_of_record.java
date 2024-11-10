package membuat_atm;
import java.util.Scanner;

class Customer {
    String norek;
    String nama;
    String pin;
    double saldo;


    void BacaRec() {
        Scanner sc = new Scanner(System.in);
        System.out.print("No rekening: ");
        norek = sc.next();
        System.out.print("Nama: ");
        nama = sc.next();
        System.out.print("Pin: ");
        pin = sc.next();
        System.out.print("Saldo: ");
        saldo = sc.nextDouble();
    }

    void CekSaldo() {
        System.out.println("Saldo Anda: " + saldo);
    }

    void Pengambilan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah penarikan: ");
        double jumlah = sc.nextDouble();
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil. Saldo baru: " + saldo);
        } else {
            System.out.println("Saldo tidak cukup.");
        }
    }

    void Deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah setor: ");
        double jumlah = sc.nextDouble();
        saldo += jumlah;
        System.out.println("Setoran berhasil. sisa saldo anda: " + saldo);
    }
}

public class atm_array_of_record {
    int N = 2; // Jumlah nasabah
    Customer[] customers = new Customer[N];

    void IsiArray() {
        for (int i = 0; i < N; i++) {
            System.out.println("Data Customer [" + (i + 1) + "]: ");
            Customer customer = new Customer();
            customer.BacaRec();
            customers[i] = customer;
        }
    }

    int Menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1. Cek Saldo ");
        System.out.println("2. Penarikan ");
        System.out.println("3. Setor ");
        System.out.println("0. Keluar ");
        System.out.print("Pilihan anda: ");
        return sc.nextInt();
    }

    int Login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Login\n");
        System.out.print("No Rekening: ");
        String norek = sc.next();
        boolean ketemu = false;
        int i = 0;
        int ulang = 1;
        do {
            System.out.print("Pin: ");
            String pin = sc.next();
            i = 0;
            ketemu = false;
            while ((ketemu == false) && (i < N)) {
                if (customers[i].norek.equals(norek) && customers[i].pin.equals(pin)) {
                    ketemu = true;
                } else {
                    i++;
                }
            }
            ulang++;
        } while ((ketemu == false) && (ulang <= 3));
        if (ketemu) {
            System.out.println("Selamat Datang, " + customers[i].nama);
            return i;
        } else {
            System.out.println("Login gagal. Anda telah mencoba 3 kali.");
            return -1;
        }
    }

    public static void main(String[] args) {
        atm_array_of_record atm = new atm_array_of_record();
        atm.IsiArray();
        int active = atm.Login();
        if (active != -1) {
            int pilih;
            do {
                pilih = atm.Menu();
                switch (pilih) {
                    case 1:
                        atm.customers[active].CekSaldo();
                        break;
                    case 2:
                        atm.customers[active].Pengambilan();
                        break;
                    case 3:
                        atm.customers[active].Deposit();
                        break;
                    case 0:
                        System.out.println("Terima kasih telah menggunakan ATM.");
                        break;
                    default:
                        System.out.println("Pilihan salah!");
                }
            } while (pilih != 0);
        }
    }
}
