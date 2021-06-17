package General;

import java.util.Scanner;

public class Main {

    Cipher cipher = new Cipher();
    Scanner scaner = new Scanner(System.in);
    Convert convert = new Convert();


    public static void main(String[] args) {
        System.out.println("Witaj! 🙂 Wybierz co chcesz robić: ");
        System.out.println(" ");

        mainn.start();
    }
        public void start () {


            System.out.printf("1. Chcę zaszyfrować wiadomość                    ");
            System.out.printf("2. Chcę przekonwertować liczbę                   ");
            System.out.println("3. Chcę poznać historię Państw                  ");
            System.out.printf("4. Chcę się uczyć dat wojen                      ");
            System.out.printf("5. Chcę zgadywać państwa kontynentów             ");
            System.out.println("6. Chcę poznawać rodzaje chmur                  ");
            System.out.printf("7. Chcę poznawać dynastie                        ");
            System.out.printf("8. Chcę się uczyć komend wiersza poleceń         ");
            System.out.println("9. Chcę poznawać morza i oceany                 ");
            System.out.printf("10. Chcę poznawać religie                        ");
            System.out.printf("11. Chcę poznawać gwiazdozbiory                  ");
            System.out.println("0. Kończymy na dziś                             ");
            System.out.println("");


            String choosenNumber = scaner.next();

            switch (choosenNumber) {
            case "1":
               // Cipher.startEncrypting();
                break;
            case "2":
                convert.startConverting();
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            case "7":
                break;
            case "8":
                break;
            case "9":
                break;
            case "0":
                System.out.println("Do zobaczenia! 🙂");
                break;
        }

    }


    static Main mainn = new Main();
}