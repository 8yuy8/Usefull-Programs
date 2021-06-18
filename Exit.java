package General;

import java.util.Scanner;

public class Exit {

    Scanner scanner = new Scanner(System.in);

    public void exit(){
        System.out.println("");
        System.out.println("");

        System.out.println("Jeśli chcesz kontynuować, naciśnij '1'. ");
        System.out.println("Jeśli chcesz wyjść, naciśnij '0'. ");
        System.out.println("");
        String endChoose = scanner.next();

        if (endChoose.equals("1")){
            Main main = new Main();
            main.start();
        }
        else if (endChoose.equals("0")){
            System.out.println("");
            System.out.println("Do zobaczenia! :)");
        }
        else if (!endChoose.equals("1") && !endChoose.equals("0")){
            System.out.println("wykryto próbę oszukania systemu ;)");
        }

    }

}
