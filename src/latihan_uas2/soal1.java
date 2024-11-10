package latihan_uas2;

public class soal1 {


    public static void main(String[] args) {
        // Inisialisasi array dengan nilai contoh
        int[] ipin = {5, 4, 7, 8, 9, 0, 6, 2, 3, 3};

        int total = 0;

        // Menghitung nilai total bilangan dalam array
        // total = total + ipin[i]
        for (int i = 0; i < ipin.length; i++) {
            total += ipin[i];
        }

        // Menampilkan hasil total
        System.out.println("Nilai total bilangan dalam array adalah: " + total);
    }
}
