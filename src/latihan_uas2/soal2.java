package latihan_uas2;

public class soal2 {

    public static void main(String[] args) {
        // Inisialisasi array dengan nilai contoh
        int[] arr = {5, 4, 7, 8, 9, 0, 6, 2, 3, 3};

        // Panggil fungsi untuk menghitung rata-rata bilangan genap
        double rataRata = hitungRataRataBilanganGenap(arr);

        // Menampilkan hasil rata-rata
        System.out.println("Nilai rata-rata bilangan genap dalam array adalah: " + rataRata);
    }

    public static double hitungRataRataBilanganGenap(int[] arr) {
        int totalGenap = 0;
        int jumlahGenap = 0;

        // Menghitung total bilangan genap dan jumlah bilangan genap
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                totalGenap += arr[i];
                jumlahGenap++;
            }
        }

        // Menghitung rata-rata bilangan genap
        if (jumlahGenap > 0) {
            return (double) totalGenap / jumlahGenap;
        } else {
            return 0; // Jika tidak ada bilangan genap
        }
    }

}
