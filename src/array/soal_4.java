package array;

public class soal_4 {
    public static void balikLarik(char[] A) {
        int panjang = A.length;
        for (int i = 0; i < panjang / 2; i++) {
            // Tukar nilai A[i] dengan A[panjang - 1 - i]
            char temp = A[i];
            A[i] = A[panjang - 1 - i];
            A[panjang - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        char[] larik = {'m', 'a', 'r', 'a', 'h'};

        System.out.println("Sebelum pembalikan:");
        for (char karakter : larik) {
            System.out.print(karakter + " ");
        }

        balikLarik(larik);

        System.out.println("\nSetelah pembalikan:");
        for (char karakter : larik) {
            System.out.print(karakter + " ");
        }
    }
}
