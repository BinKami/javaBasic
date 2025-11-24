public class Main {
    public static void main(String[] args) {
        String name = "Kamil";
        int length = name.length(); // długość Stringa

        System.out.println(name);
        System.out.println(length);

        String text = "         Jak nauczyć się programowania       ";
        String text2 = text.replace(" ", "-"); // zamiana danego znaku na inny  Jak-nauczyć-się-programowania
        System.out.println(text2);

        text = text.strip();  // metoda ta usuwa nam spacje z końca oraz z początku
        System.out.println(text);

//        boolean startsWithK = name.startsWith("K"); // sprawdzanie czy dany string zaczyna się na daną literę (wielkość też jest ważna!)
//        System.out.println(startsWithK);

        name = name.toLowerCase(); // Zamienia wszystkie znaki na małe w danym stringu || analogicznie toUpperCase je powiększa
        System.out.println(name);
    }
}