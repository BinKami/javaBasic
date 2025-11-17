import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoję imię: ");
        String name = scanner.nextLine();

        System.out.println("Podaj swoję nazwisko: ");
        String lastName = scanner.nextLine();

        System.out.println("Podaj swój wiek: ");
        int age = scanner.nextInt();

        System.out.println("Imię: " + name);
        System.out.println("Nazwisko " + lastName);
        System.out.println("Wiek: " + age);
    }
}