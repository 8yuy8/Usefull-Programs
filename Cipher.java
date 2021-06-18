package General;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cipher {

    Exit exit = new Exit();

    int howMuchToMove = 0;

    Scanner scanner = new Scanner(System.in);

    public void startEncrypting() {


        System.out.println("Podaj tekst do zaszyfrowania: ");
        System.out.println("");
        String textToCipher = scanner.next();
        System.out.println("O ile znaków mam go przesunąć?");
        System.out.println("");
        howMuchToMove = scanner.nextInt();


        List<String> cipheredText = new ArrayList<String>();
        List<Character> alphabet = new ArrayList<>();


        alphabet.add('a');
        alphabet.add('ą');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.add('ć');
        alphabet.add('d');
        alphabet.add('e');
        alphabet.add('ę');
        alphabet.add('f');
        alphabet.add('g');
        alphabet.add('h');
        alphabet.add('i');
        alphabet.add('j');
        alphabet.add('k');
        alphabet.add('l');
        alphabet.add('ł');
        alphabet.add('m');
        alphabet.add('n');
        alphabet.add('ń');
        alphabet.add('o');
        alphabet.add('ó');
        alphabet.add('p');
        alphabet.add('q');
        alphabet.add('r');
        alphabet.add('s');
        alphabet.add('ś');
        alphabet.add('t');
        alphabet.add('u');
        alphabet.add('v');
        alphabet.add('w');
        alphabet.add('x');
        alphabet.add('y');
        alphabet.add('z');
        alphabet.add('ź');
        alphabet.add('ż');
        alphabet.add('.');

        for (int i = 0; i < textToCipher.length(); i++) {
            for (int j = 0; j < alphabet.size(); j++) {
                if (alphabet.get(j).equals(textToCipher.charAt(i)) && (j + howMuchToMove) < alphabet.size()) {
                    cipheredText.add(String.valueOf(alphabet.get(j + howMuchToMove)));
                } else if (alphabet.get(j).equals(textToCipher.charAt(i)) && (j + howMuchToMove) == alphabet.size()) {
                    cipheredText.add(String.valueOf(alphabet.get(alphabet.size() - 1)));
                } else if (alphabet.get(j).equals(textToCipher.charAt(i)) && (j + howMuchToMove) > alphabet.size()) {
                    int z = j + howMuchToMove - alphabet.size();
                    cipheredText.add(String.valueOf(alphabet.get(z)));
                }
            }


        }

        for (int i = 0; i < cipheredText.size(); i++) {
            System.out.printf(cipheredText.get(i));
        }

        exit.exit();


    }

}



