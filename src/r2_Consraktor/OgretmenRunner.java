package r2_constraktor;

public class OgretmenRunner {
    public static void main(String[] args) {
        r2_constraktor.Ogretmen ogretmen1=new r2_constraktor.Ogretmen();
        System.out.println("Ogretmen 1 " + ogretmen1);
        r2_constraktor.Ogretmen ogretmen2=new r2_constraktor.Ogretmen("Emre","Akdogan","1/1/2001","Matematik","Fizik");
        System.out.println("Ogretmen 2 " + ogretmen2);
        r2_constraktor.Ogretmen ogretmen3=new r2_constraktor.Ogretmen("Cavidan","Kabinkara","1/1/1991");
        System.out.println("Ogretmen 3 " + ogretmen3);
    }

}
