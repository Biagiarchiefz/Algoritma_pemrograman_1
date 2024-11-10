package array;

public class soal_2 {
    public static int cariElemenTerbesar(int[] A) {
        int terbesar = A[0]; // Anggap elemen pertama sebagai elemen terbesar awal
        for (int i = 1; i < A.length; i++) {
            if (A[i] > terbesar) {
                terbesar = A[i];
            }
        }
        return terbesar;
    }

    public static void main(String[] args) {
        int[] larik = {1, 3, 5, 7, 3, 9, 5};
        int elemenTerbesar = cariElemenTerbesar(larik);
        System.out.println("Elemen terbesar dalam larik adalah: " + elemenTerbesar);
    }
}
