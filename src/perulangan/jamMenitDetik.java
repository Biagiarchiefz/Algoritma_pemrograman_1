package perulangan;


import java.util.Scanner;

public class jamMenitDetik {
    public static void main(String[] args) {
        int jam, menit, detik;

        Scanner sc= new Scanner(System.in);
        System.out.print("jam: ");jam=sc.nextInt();

        while ((jam < 0)&& (jam <= 23)) {
            System.out.println("jam:"); jam=sc.nextInt();
        }
        System.out.print("menit: ");menit=sc.nextInt();
        while ((menit < 0)&& (menit > 59)) {
            System.out.println("menit:"); jam=sc.nextInt();
        }
        System.out.print("detik: ");detik=sc.nextInt();
        while ((detik < 0)&& (detik > 59)) {
            System.out.println("detik:"); jam=sc.nextInt();
        }
        System.out.print("Jamnya adalah" +jam+":"+menit+":"+detik);

    }
}

