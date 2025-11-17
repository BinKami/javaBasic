import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę całkowitą: ");
        int a = scanner.nextInt();

        System.out.println("Podaj drugą liczbę całkowitą: ");
        int b = scanner.nextInt();


        System.out.println("Wynik dodawania: " + (a + b));
        System.out.println("Wynik odejmowania: " + (a - b));
        System.out.println("Wynik mnożenia: " + (a * b));
        System.out.println("Wynik dzielenia: " + (a / b));
    }
}