public class Main {
    public static void main(String[] args) {
        // OPERACJE NA LICZBACH
        int a = 5;
        a += 2; // a = a + 2;

        System.out.println(a);

        // INKREMENTACJA/DEKREMENTACJA || zwiększanie o 1/zmniejszanie o 1

        int b = 2;
        b++; //     b = 3    || b++ post || ++b pre
//        b++; //   b = 4



        System.out.println(b++); // 3 || System.out.println(++b); = 4
        System.out.println(++b); // 5 || System.out.println(b++); = 4

    }
}