import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        double a = 2.0;
        double b = 1.5;

        System.out.println(a / b);

        // ZAOKRĄGLANIE
        double c = a / b;

        System.out.println(Math.round(c * 100.0)/100.0); // pierwsza opcja zaokrąglenia

        BigDecimal roundedNumber = new BigDecimal(c).setScale(2, RoundingMode.HALF_UP);// drugi sposób
        System.out.println(roundedNumber.doubleValue());

        DecimalFormat decimalFormat = new DecimalFormat("###.##"); // trzeci sposób
        System.out.println(decimalFormat.format(c));

        String formatedNumber = String.format("%.2f", c);// metoda statyczna, dzięki niej nie musimy tworzyć nowej instancji klasy
        System.out.println(formatedNumber);


        // DODATKOWE INFORMACJE

        double d = 4.0;
        double e = 3.5;

        double f = d / e;

        System.out.println(Math.ceil(f)); // zaokrągla w góre, dobule
        System.out.println(Math.floor(f)); // zaokągla w dól, double
        System.out.println(Math.round(f)); // zaokrągla do long (bez przecinka)


    }
}