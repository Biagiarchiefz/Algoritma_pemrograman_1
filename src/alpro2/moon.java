package alpro2;


import java.util.Scanner;
public class moon {

        public static void main(String[] args) {
            String Bulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni",
                    "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

            int NumHari = 0, dBulan;
            int tahun = 0;
            boolean Sama;

            Scanner sc= new Scanner(System.in);
            System.out.print("Month Code: (1-12): ");

            //   inputt
            dBulan = sc.nextInt();

            switch (dBulan) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    NumHari = 31;
                    System.out.println("Month: " + Bulan[dBulan-1]);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    NumHari = 30;
                    System.out.println("Month: " + Bulan[dBulan-1]);
                    break;
                case 2:
//                    NumHari = 28;  // Leap year consideration can be added here
//                    System.out.println("Month: " + Bulan[dBulan-1]);
                    System.out.println("Ketik tahun: ");
                    tahun= sc.nextInt();
                    if (tahun % 4 == 0 ){
                        NumHari = 29;
                    } else {
                        NumHari = 28;
                    }
                    break;

                default:
                    System.out.println("Kode yang anda masukan salah");
            }

            System.out.println("Jumlah hari: " + NumHari);
        }
    }

