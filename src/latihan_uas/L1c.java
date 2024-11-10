package latihan_uas;

import java.util.Scanner;
public class L1c {
        // Fungsi untuk membaca elemen array dari keyboard
        public static void bacaArray(char[] arr, int n) {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < n; i++) {
                System.out.print("Masukkan karakter ke-" + (i + 1) + ": ");
                arr[i] = scanner.next().charAt(0);
            }
        }

        // Fungsi untuk menampilkan elemen array
        public static void tampilkanArray(char[] arr, int n) {
            System.out.print("Elemen-elemen array adalah: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // Fungsi untuk menghitung banyaknya huruf vokal dalam array
        public static int hitungVokal(char[] arr, int n) {
            String vokal = "aiueoAIUEO";
            int jumlah = 0;
            for (int i = 0; i < n; i++) {
                if (vokal.indexOf(arr[i]) != -1) {
                    jumlah++;
                }
            }
            return jumlah;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan jumlah elemen dalam array (maks 100): ");
            int n = scanner.nextInt();
            if (n > 100) {
                System.out.println("Jumlah elemen tidak boleh melebihi 100.");
                return;
            }

            char[] arr = new char[n];

            // Membaca elemen array
            bacaArray(arr, n);

            // Menampilkan elemen array
            tampilkanArray(arr, n);

            // Menghitung dan menampilkan banyaknya huruf vokal
            int jumlahVokal = hitungVokal(arr, n);
            System.out.println("Banyaknya huruf vokal dalam array adalah: " + jumlahVokal);
        }
    }




