package a3_variables;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi, soyisminizi ve yasinizi giriniz\n aralarda Enter tusuna basiniz");
        String isim= scan.nextLine ();
        String soyisim= scan.nextLine ();
        int yas=scan.nextInt();

    }
}