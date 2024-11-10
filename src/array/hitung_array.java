package array;

public class hitung_array {

    public static void main(String[] args) {

        int[] array = {5,4,7,8,9,0,6,2,3,3};
        int jumlah = 0;

        // Menggunakan loop for untuk menjumlahkan elemen array
        for (int i = 0; i < array.length; i++) {
            jumlah += array[i];
        }

        System.out.println("Jumlah elemen dalam array: " + jumlah);  // Output: 15
    }

}
