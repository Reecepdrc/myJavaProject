package r2_constraktor;
import jdk.swing.interop.SwingInterOpUtils;
public class KamyonRunner {

    public static void main(String[] args) {
        r2_constraktor.Kamyon kamyon1=new r2_constraktor.Kamyon();
        System.out.println("kamyon1 ozelikleri " + kamyon1.toString());
        r2_constraktor.Kamyon kamyon2=new r2_constraktor.Kamyon("Mercedes","4140",2005,500000);
        System.out.println("Kamyon2 bilgileri " + kamyon2);
        r2_constraktor.Kamyon kamyon3=new r2_constraktor.Kamyon("MAN","as900",2007,400000);
        System.out.println("Kamyon3 bilgileri " + kamyon3);
        r2_constraktor.Kamyon kamyon4=new r2_constraktor.Kamyon("Scania","s540");
        System.out.println("Kamyon4 bilgileri " + kamyon4);
    }
}
