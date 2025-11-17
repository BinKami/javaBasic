import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
//        double a = 1.0;
//        double b = 2.0;

//        System.out.println(b - a);
//        Wydaję się to git, ale finalnie nie dokońca jest okej. Przykład na dole

        /*double a = 2.55;
        double b = 2.45;

        System.out.println(a - b); // = 0.09999999999999964

         */

        double a = 0.1;
        double b = 0.2;

        System.out.println(a + b); // = 0.30000000000000004

        BigDecimal c = new BigDecimal("0.1");
        BigDecimal d = new BigDecimal("0.2");

        System.out.println(c.add(d)); // ZAPAMIĘTAĆ DOUBLE NIE JEST NAJLEPSZY DO REPREZENTOWANIA WALUTY

//        DLATEGO UŻYWAMY DZIAŁANIA NA STRINGU
    }
}