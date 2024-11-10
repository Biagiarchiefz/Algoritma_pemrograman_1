package record;

import java.util.Scanner;

public class KelilingLingkaran {
    double r, phi= 3.14, k;

    double HitungKeliling(){     // ini
        k = 2 * phi * r;         // adalah
        return k;                // fungsi
    }

    double HitungLuas(){
        return phi * r * r;
    }

    double HitungVolum(){
        return  4/3 * phi * r * r * r;
    }

    public static void main(String[] args) {
        KelilingLingkaran KL = new KelilingLingkaran();
        double k,l,v;
        Scanner hai = new Scanner(System.in);
        System.out.print("jari jari = ");KL.r= hai.nextDouble();
        k = KL.HitungKeliling();
        l = KL.HitungLuas();
        v = KL.HitungVolum();
        System.out.println(" jari = " + k + " keliling = " + l + " luas = " + " volume = " + v);
    }

}
