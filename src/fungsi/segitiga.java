package fungsi;

import java.util.Scanner;

public class segitiga {
   double alas, tinggi, luas, keliling;

   void bacaSegitiga(){
       Scanner inputUser = new Scanner(System.in);
       System.out.print("Alas = ");
       alas = inputUser.nextDouble();

       System.out.print("Tinggi = ");
       tinggi = inputUser.nextDouble();

      luas = hitungLuas();
      keliling = hitungKeliling();
   }

   void tampilkanSegitiga (){
       System.out.println("Alas = " + alas);
       System.out.println("Tinggi = " + tinggi);
       System.out.println("Luas = " + luas);
       System.out.println("Keliling = " + keliling);
   }

   double hitungLuas(){
       luas = (alas * tinggi) + 1/2;
       return luas;
   }

   double hitungKeliling(){
       double c;
       c = Math.sqrt(alas * alas + tinggi * tinggi );
       keliling = alas + tinggi + c;
       return keliling;
   }

   static  void selisiSegitiga(segitiga a, segitiga b){
       double Sluas = a.luas-b.luas;
       double SKeliling =a.keliling - b.keliling;
       System.out.println("Selisih keliling = " + SKeliling);
       System.out.println("Selilih keliling = " );
   }





    public static void main(String[] args) {
       segitiga S1 =  new segitiga();
       segitiga S2 = new segitiga();

       Scanner inputUser = new Scanner(System.in);
       S1.bacaSegitiga();
       S1.tampilkanSegitiga();

       S2.bacaSegitiga();
       S2.tampilkanSegitiga();

       selisiSegitiga(S1, S2);
    }


}
