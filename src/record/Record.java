package record;

import java.util.Scanner;

public class Record {
    float x,y;

    public static void main(String[] args) {


        Record T = new Record();
        Record T2 = new Record();


        Scanner sc = new Scanner(System.in);

        System.out.println("Titik Pertama");
        System.out.print("x : ");
        T.x=sc.nextFloat();

        System.out.print("y : ");
        T.y=sc.nextFloat();

        System.out.println("x : "+T.x);
        System.out.println("y : "+T.y);

        System.out.println("Titik Kedua");
        System.out.print("x : ");T2.x=sc.nextFloat();
        System.out.print("y : ");T2.y=sc.nextFloat();

        System.out.println("x : "+T2.x);

        System.out.println("y : "+T2.y);

    }

}


