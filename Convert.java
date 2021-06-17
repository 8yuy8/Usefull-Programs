package General;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Convert {

    Scanner scanner = new Scanner(System.in);

    public void startConverting() {
        System.out.println("");
        System.out.println("Podaj liczbę, którą chcesz przekonwertować: ");
        String numberToConvert = scanner.next();
        System.out.println("");
        System.out.println("Podaj system w jakim zapisana jest ta liczba: ");
        int systemStart = scanner.nextInt();
        System.out.println("");
        System.out.println("Podaj system na jaki mam przekonwertować liczbę: ");
        int systemEnd = scanner.nextInt();


        if (numberToConvert.charAt(0) == '-' || numberToConvert.charAt(0) == '0') {
            System.out.printf("Wpisz liczbę dodatnią!");
        }
        if (systemEnd < 1 || systemStart < 1 || systemStart > 16 || systemEnd > 16) {
            System.out.println("System nie może być niższy niż 1, ani większy niż 16!");
        }

        List<String> numberToConvertList = new ArrayList<>();


        for (int i = 0; i < numberToConvert.length(); i++) {
            if (numberToConvert.charAt(i) != 'A' && numberToConvert.charAt(i) != 'B' && numberToConvert.charAt(i) != 'C' &&
                    numberToConvert.charAt(i) != 'D' && numberToConvert.charAt(i) != 'E' && numberToConvert.charAt(i) != 'F' &&
            numberToConvert.charAt(i) != 'a' && numberToConvert.charAt(i) != 'b' && numberToConvert.charAt(i) != 'c' &&
                    numberToConvert.charAt(i) != 'd' && numberToConvert.charAt(i) != 'e' && numberToConvert.charAt(i) != 'f') {
                numberToConvertList.add(String.valueOf(numberToConvert.charAt(i)));
            }
            if (numberToConvert.charAt(i) == 'A' || numberToConvert.charAt(i) == 'a') {
                numberToConvertList.add("10");
            }
            if (numberToConvert.charAt(i) == 'B' || numberToConvert.charAt(i) == 'b') {
                numberToConvertList.add("11");
            }
            if (numberToConvert.charAt(i) == 'C' || numberToConvert.charAt(i) == 'c') {
                numberToConvertList.add("12");
            }
            if (numberToConvert.charAt(i) == 'D' || numberToConvert.charAt(i) == 'd') {
                numberToConvertList.add("13");
            }
            if (numberToConvert.charAt(i) == 'E' || numberToConvert.charAt(i) == 'e') {
                numberToConvertList.add("14");
            }
            if (numberToConvert.charAt(i) == 'F' || numberToConvert.charAt(i) == 'f') {
                numberToConvertList.add("15");
            }
        }



        int sizeOfListToConvert = numberToConvertList.size();
        int decimalValue = 0;
        double decrementator = 1;

        for (int i = 0; i < sizeOfListToConvert; i++) {
            Integer numberToConvertListCharAti = Integer.parseInt(String.valueOf(numberToConvertList.get(i)));
            double valueToAdd = numberToConvertListCharAti * (Math.pow(systemStart, (sizeOfListToConvert - decrementator)));
            decimalValue += valueToAdd;
            decrementator++;
        }

        System.out.println("");
        System.out.println("Liczba w systemie dziesiętnym: " + (int) decimalValue);

        List<Integer> convertedNumberList = new ArrayList<>();



        int decimalValueLength = String.valueOf(decimalValue).length();


        for(int i = 0; i < decimalValueLength; i++){
            convertedNumberList.add(Integer.parseInt(String.valueOf(String.valueOf(decimalValue).charAt(i))));
        }


        List <Integer> finalNumberList = new ArrayList<>();

        int decimalValueCopy = decimalValue;
        double sumOfPowering;
        double sumOfAll;
        int multiplier;
        int intValueOfSystemEnd = systemEnd;

        for (int i = 35; i >= 0; i--) {

            for (multiplier = (intValueOfSystemEnd - 1); multiplier > 0; multiplier--) {

                sumOfPowering = Math.pow(systemEnd, i);
                sumOfAll = multiplier * sumOfPowering;


                if (decimalValueCopy < systemEnd) {
                    finalNumberList.add(decimalValueCopy);
                    decimalValueCopy -= decimalValueCopy;
                    break;
                } else {

                    if (sumOfAll <= decimalValueCopy) {
                        finalNumberList.add(multiplier);
                        decimalValueCopy -= sumOfAll;
                        break;

                    }

                    if (finalNumberList.size() != 0 && multiplier == 1 && sumOfAll > decimalValueCopy) {
                        finalNumberList.add(0);
                        break;
                    }

                }
}

            }


        Integer finalNumberListSize = finalNumberList.size();
        Integer[] newFinalNumberList = new Integer[finalNumberList.size()];

        for (int i = 0; i < finalNumberListSize; i++) {
            int j = finalNumberList.get(i);
            newFinalNumberList[i] = j;
        }


        String valueOfSystemEnd = String.valueOf(systemEnd);
        switch (valueOfSystemEnd) {
            case "1":
                valueOfSystemEnd = "unalnym(jedynkowym [1])";
                break;
            case "2":
                valueOfSystemEnd = "binarnym(dwójkowym [2]): ";
                break;
            case "3":
                valueOfSystemEnd = "trialnym(trójkowym [3]): ";
                break;
            case "4":
                valueOfSystemEnd = "kwartalnym(czwórkowym [4]): ";
                break;
            case "5":
                valueOfSystemEnd = "pentalnym(piątkowym [5]): ";
                break;
            case "6":
                valueOfSystemEnd = "hexalnym(szóstkowym [6]): ";
                break;
            case "7":
                valueOfSystemEnd = "heptalnym(siódemkowym [7]): ";
                break;
            case "8":
                valueOfSystemEnd = "oktalnym(ósemkowym [8]): ";
                break;
            case "9":
                valueOfSystemEnd = "nanonalnym(dziewiątkowym [9]): ";
                break;
            case "a":
                valueOfSystemEnd = "undecynalnym(jedenastkowym [11]): ";
                break;
            case "A":
                valueOfSystemEnd = "undecynalnym(jedenastkowym [11]): ";
                break;
            case "11":
                valueOfSystemEnd = "undecynalnym(jedenastkowym [11]): ";
                break;
            case "b":
                valueOfSystemEnd = "duodecynalnym(dwunastkowym [12]): ";
                break;
            case "B":
                valueOfSystemEnd = "duodecynalnym(dwunastkowym [12]): ";
                break;
            case "12":
                valueOfSystemEnd = "duodecynalnym(dwunastkowym [12]): ";
                break;
            case "c":
                valueOfSystemEnd = "tridecynalnym(trzynastkowym [13]): ";
                break;
            case "C":
                valueOfSystemEnd = "tridecynalnym(trzynastkowym [13]): ";
                break;
            case "13":
                valueOfSystemEnd = "tridecynalnym(trzynastkowym [13]): ";
                break;
            case "d":
                valueOfSystemEnd = "tetradecynalnym(czternastkowym [14]): ";
                break;
            case "D":
                valueOfSystemEnd = "tetradecynalnym(czternastkowym [14]): ";
                break;
            case "14":
                valueOfSystemEnd = "tetradecynalnym(czternastkowym [14]): ";
                break;
            case "e":
                valueOfSystemEnd = "pentadecynalnym(piętnastkowym [15]): ";
                break;
            case "E":
                valueOfSystemEnd = "pentadecynalnym(piętnastkowym [15]): ";
                break;
            case "15":
                valueOfSystemEnd = "pentadecynalnym(piętnastkowym [15]): ";
                break;
            case "f":
                valueOfSystemEnd = "hexadecynalnym(szesnastkowym [16]): ";
                break;
            case "F":
                valueOfSystemEnd = "hexadecynalnym(szesnastkowym [16]): ";
                break;
            case "16":
                valueOfSystemEnd = "hexadecynalnym(szesnastkowym [16]): ";
                break;
        }
        System.out.println("");
        System.out.println("");
        System.out.printf("Liczba w systemie " + valueOfSystemEnd);
        System.out.println("");


        List<String> makingCharacterList = new ArrayList<>();
        for (int i = 0; i < newFinalNumberList.length; i++) {
            if (newFinalNumberList[i] == 10) {
                makingCharacterList.add("A");
            } else if (newFinalNumberList[i] == 11) {
                makingCharacterList.add("B");
            } else if (newFinalNumberList[i] == 12) {
                makingCharacterList.add("C");
            } else if (newFinalNumberList[i] == 13) {
                makingCharacterList.add("D");
            } else if (newFinalNumberList[i] == 14) {
                makingCharacterList.add("E");
            } else if (newFinalNumberList[i] == 15) {
                makingCharacterList.add("F");
            } else {
                makingCharacterList.add(newFinalNumberList[i].toString());
            }
        }
        for (int i = 0; i < (makingCharacterList.size()); i++) {
            System.out.print(makingCharacterList.get(i));
        }
    }







}
