package h2_stringManipulation;

public class C05_endWith {
    public static void main(String[] args) {

        String str= "Ah be Java";
        System.out.println(str.endsWith("ava")); // true
        System.out.println(str.endsWith("be Java")); // true
        System.out.println(str.endsWith("Ah be Java")); // true
        System.out.println(str.endsWith("")); // t
    }
}
