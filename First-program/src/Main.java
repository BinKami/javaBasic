import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;

        System.out.println("Jak masz na imię?");
        name = scanner.nextLine();
        System.out.println("Ile masz lat?");
        age = scanner.nextInt();
        System.out.println("Cześć " + name + "!" + " Masz " + age + " lat.");

    }
}