package z2_maps;



import z3_Maps.ReusableMethods;

import java.util.*;

public class C01_DununTekrari {
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap = ReusableMethods.mapOlustur();
        System.out.println(sinifListMap);
        // ogrenci listesini isim soyisim olarak yazdirin
        ReusableMethods.tumValueSiraliYazdir(sinifListMap);
        // kac farkli brans varsa bransIsmi = branstakiOgrencisayisi seklinde yazdirin
        ReusableMethods.bransOgrencisayisiYazdir(sinifListMap);
    }
}
