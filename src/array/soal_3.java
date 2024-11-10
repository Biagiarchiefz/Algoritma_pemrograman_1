package array;

public class soal_3 {
    public static void tukarElemen(int[] A, int[] B) {
        if (A.length != B.length) {
            System.out.println("Ukuran larik A dan B tidak sama.");
            return;
        }

        for (int i = 0; i < A.length; i++) {
            // Tukar nilai A[i] dengan B[i] menggunakan variabel bantu
            int bantu = A[i];
            A[i] = B[i];
            B[i] = bantu;
        }
    }

    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5};
        int[] arrayB = {6, 7, 8, 9, 10};

        System.out.println("Sebelum pertukaran:");
        System.out.println("array A: " + java.util.Arrays.toString(arrayA));
        System.out.println("Larik B: " + java.util.Arrays.toString(arrayB));

        tukarElemen(arrayA, arrayB);

        System.out.println("\nSetelah pertukaran:");
        System.out.println("Larik A: " + java.util.Arrays.toString(arrayA));
        System.out.println("Larik B: " + java.util.Arrays.toString(arrayB));
    }
}
