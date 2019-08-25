package zadania.szyfrCezara;

import java.util.Scanner;

public class SzyfrApp {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        final int key = 1;


        System.out.println("Podaj tekst");

        String szyfr = scanner.nextLine();

        char[] entryText = szyfr.toCharArray();

        char[] txtCHAR = new char[entryText.length];



        for (int i = 0; i < entryText.length; i++) {
            int n = entryText[i];
            int C = 0;

            if (n >= 97 && n <= 122) {
                if (n + key > 122) {
                    n -= 26;
                }

                C = n + key % 26;
            }

            txtCHAR[i] = (char) C;
            System.out.print(txtCHAR[i]);
        }
        System.out.println();


    }
}