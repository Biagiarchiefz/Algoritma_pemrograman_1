package arrayofstring;

import java.util.Scanner;

public class array_string {
        int N = 3;
        String[] a = new String[N];

        void Bacaarr() {
            System.out.println("Baca nilai setiap elemen array dari keyboard");
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < N; i++) {
                System.out.print("element ke= "+ i + ": ");
                a[i] = sc.nextLine();  // Membaca input sebagai string
            }
        }

        void tampilarr() {
            for (int i = 0; i < N; i++) {
                System.out.println("element ke = " +i + ": " + a[i]);
            }
        }

        public static void main(String[] args) {
            array_string A = new array_string();

            A.Bacaarr();
            A.tampilarr();
        }
    }


