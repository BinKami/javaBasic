public class Main {
    public static void main(String[] args) {
        String title = "      Jak nauczyć się programowania    ";

        title = title.strip().toUpperCase().substring(4);

        System.out.println(title);

    }
}