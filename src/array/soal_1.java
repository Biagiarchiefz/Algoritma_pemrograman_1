package array;

public class soal_1 {
        public static int cariIndeksTerakhir(int[] A, int X) {
            int indeksTerakhir = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] == X) {
                    indeksTerakhir = i + 1; // Menggunakan i + 1 karena indeks dimulai dari 0
                }
            }
            return indeksTerakhir;
        }

        public static void main(String[] args) {
            int[] larik = {1, 3, 5, 7, 3, 9, 5};
            int nilai = 5;
            int indeks = cariIndeksTerakhir(larik, nilai);
            if (indeks != 0) {
                System.out.println("Elemen " + nilai + " ditemukan pada indeks terakhir: " + indeks);
            } else {
                System.out.println("Elemen " + nilai + " tidak ditemukan dalam larik.");
            }
        }


}
