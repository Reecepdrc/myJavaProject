package g1_ternary;

import java.util.Scanner;

public class C03_ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        double sayi=scan.nextDouble();
        if (sayi>0){
            System.out.println(sayi);
        }else {
            System.out.println("Lütfen bir sayi daha giriniz");
            double sayi2=scan.nextDouble();
            System.out.println(sayi*sayi2);
        }

        // kullanicidan bir sayi isteyin
        // sayi poztifse sayiyi yazdirin
        // sayi sifir veya negatifse, bir sayi daha isteyin ve ikisinin carpimini yazdirin
       /* Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi= scan.nextDouble();
        if (sayi>0){
            System.out.println(sayi);
        } else {
            System.out.println("Lutfen bir sayi daha giriniz");
            double sayi2= scan.nextDouble();
            System.out.println(sayi*sayi2);
        }
        /*
          Eger if else icerisinde yeni kodlar varsa
          ternary ile yapmamiz mumkun olmaz
         */

    }
}
