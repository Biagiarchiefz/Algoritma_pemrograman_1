package alpro2;


import java.util.Scanner;

public class nama_bulan_kabisat {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan nomor bulan (1-12): ");
            int bulan = scanner.nextInt();

            String namaBulan;
            int jumlahHari;

            switch (bulan) {
                case 1:
                    namaBulan = "Januari";
                    jumlahHari = 31;
                    break;
                case 2:
                    namaBulan = "Februari";
                    System.out.print("Apakah tahun kabisat? (true/false): ");
                    boolean kabisat = scanner.nextBoolean();
                    jumlahHari = kabisat ? 29 : 28;
                    break;
                case 3:
                    namaBulan = "Maret";
                    jumlahHari = 31;
                    break;
                case 4:
                    namaBulan = "April";
                    jumlahHari = 30;
                    break;
                case 5:
                    namaBulan = "Mei";
                    jumlahHari = 31;
                    break;
                case 6:
                    namaBulan = "Juni";
                    jumlahHari = 30;
                    break;
                case 7:
                    namaBulan = "Juli";
                    jumlahHari = 31;
                    break;
                case 8:
                    namaBulan = "Agustus";
                    jumlahHari = 31;
                    break;
                case 9:
                    namaBulan = "September";
                    jumlahHari = 30;
                    break;
                case 10:
                    namaBulan = "Oktober";
                    jumlahHari = 31;
                    break;
                case 11:
                    namaBulan = "November";
                    jumlahHari = 30;
                    break;
                case 12:
                    namaBulan = "Desember";
                    jumlahHari = 31;
                    break;
                default:
                    namaBulan = "Nomor bulan tidak valid!";
                    jumlahHari = 0;
                    break;
            }

            if (jumlahHari > 0) {
                System.out.println("Nama bulan: " + namaBulan);
                System.out.println("Jumlah hari: " + jumlahHari);
            } else {
                System.out.println(namaBulan);
            }
         }

        }
