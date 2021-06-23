package General;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Convert {

    Exit exit = new Exit();

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


        if (systemEnd < 1 || systemStart < 1 || systemStart > 65 || systemEnd > 65) {
            System.out.println("Nie umiem jeszcze konwertować na system mniejszy, niż 1, ani większy niż 66!");
        }

        List<String> numberToConvertList = new ArrayList<>();


        for (int i = 0; i < numberToConvert.length(); i++) {
            if(numberToConvert.charAt(i) != 'A' && numberToConvert.charAt(i) != 'a' && numberToConvert.charAt(i) != '~' &&
                    numberToConvert.charAt(i) != 'B' && numberToConvert.charAt(i) != 'b' && numberToConvert.charAt(i) != '`' &&
                    numberToConvert.charAt(i) != 'C' && numberToConvert.charAt(i) != 'c' && numberToConvert.charAt(i) != '!' &&
                    numberToConvert.charAt(i) != 'D' && numberToConvert.charAt(i) != 'd' && numberToConvert.charAt(i) != '@' &&
                    numberToConvert.charAt(i) != 'E' && numberToConvert.charAt(i) != 'e' && numberToConvert.charAt(i) != '#' &&
                    numberToConvert.charAt(i) != 'F' && numberToConvert.charAt(i) != 'f' && numberToConvert.charAt(i) != '$' &&
                    numberToConvert.charAt(i) != 'G' && numberToConvert.charAt(i) != 'g' && numberToConvert.charAt(i) != '%' &&
                    numberToConvert.charAt(i) != 'H' && numberToConvert.charAt(i) != 'h' && numberToConvert.charAt(i) != '^' &&
                    numberToConvert.charAt(i) != 'I' && numberToConvert.charAt(i) != 'i' && numberToConvert.charAt(i) != '&' &&
                    numberToConvert.charAt(i) != 'J' && numberToConvert.charAt(i) != 'j' && numberToConvert.charAt(i) != '*' &&
                    numberToConvert.charAt(i) != 'K' && numberToConvert.charAt(i) != 'k' && numberToConvert.charAt(i) != '(' &&
                    numberToConvert.charAt(i) != 'L' && numberToConvert.charAt(i) != 'l' && numberToConvert.charAt(i) != ')' &&
                    numberToConvert.charAt(i) != 'M' && numberToConvert.charAt(i) != 'm' && numberToConvert.charAt(i) != '_' &&
                    numberToConvert.charAt(i) != 'N' && numberToConvert.charAt(i) != 'n' && numberToConvert.charAt(i) != '-' &&
                    numberToConvert.charAt(i) != 'O' && numberToConvert.charAt(i) != 'o' && numberToConvert.charAt(i) != '=' &&
                    numberToConvert.charAt(i) != 'P' && numberToConvert.charAt(i) != 'p' && numberToConvert.charAt(i) != '[' &&
                    numberToConvert.charAt(i) != 'Q' && numberToConvert.charAt(i) != 'q' && numberToConvert.charAt(i) != ']' &&
                    numberToConvert.charAt(i) != 'R' && numberToConvert.charAt(i) != 'r' && numberToConvert.charAt(i) != '{' &&
                    numberToConvert.charAt(i) != 'S' && numberToConvert.charAt(i) != 's' && numberToConvert.charAt(i) != '}' &&
                    numberToConvert.charAt(i) != 'T' && numberToConvert.charAt(i) != 't' && numberToConvert.charAt(i) != '|' &&
                    numberToConvert.charAt(i) != 'U' && numberToConvert.charAt(i) != 'u' && numberToConvert.charAt(i) != '/' &&
                    numberToConvert.charAt(i) != 'V' && numberToConvert.charAt(i) != 'v' && numberToConvert.charAt(i) != '?' &&
                    numberToConvert.charAt(i) != 'W' && numberToConvert.charAt(i) != 'w' && numberToConvert.charAt(i) != '<' &&
                    numberToConvert.charAt(i) != 'X' && numberToConvert.charAt(i) != 'x' && numberToConvert.charAt(i) != '>' &&
                    numberToConvert.charAt(i) != 'Y' && numberToConvert.charAt(i) != 'y' && numberToConvert.charAt(i) != ',' &&
                    numberToConvert.charAt(i) != 'Z' && numberToConvert.charAt(i) != 'z' && numberToConvert.charAt(i) != '.' &&
                    numberToConvert.charAt(i) != '+' && numberToConvert.charAt(i) != ';' && numberToConvert.charAt(i) != ':' &&
                    numberToConvert.charAt(i) != '€'
            ) {
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
            if (numberToConvert.charAt(i) == 'G' || numberToConvert.charAt(i) == 'g') {
                numberToConvertList.add("16");
            }
            if (numberToConvert.charAt(i) == 'H' || numberToConvert.charAt(i) == 'h') {
                numberToConvertList.add("17");
            }
            if (numberToConvert.charAt(i) == 'I' || numberToConvert.charAt(i) == 'i') {
                numberToConvertList.add("18");
            }
            if (numberToConvert.charAt(i) == 'J' || numberToConvert.charAt(i) == 'j') {
                numberToConvertList.add("19");
            }
            if (numberToConvert.charAt(i) == 'K' || numberToConvert.charAt(i) == 'k') {
                numberToConvertList.add("20");
            }
            if (numberToConvert.charAt(i) == 'L' || numberToConvert.charAt(i) == 'l') {
                numberToConvertList.add("21");
            }
            if (numberToConvert.charAt(i) == 'M' || numberToConvert.charAt(i) == 'm') {
                numberToConvertList.add("22");
            }
            if (numberToConvert.charAt(i) == 'N' || numberToConvert.charAt(i) == 'n') {
                numberToConvertList.add("23");
            }
            if (numberToConvert.charAt(i) == 'O' || numberToConvert.charAt(i) == 'o') {
                numberToConvertList.add("24");
            }
            if (numberToConvert.charAt(i) == 'P' || numberToConvert.charAt(i) == 'p') {
                numberToConvertList.add("25");
            }
            if (numberToConvert.charAt(i) == 'Q' || numberToConvert.charAt(i) == 'q') {
                numberToConvertList.add("26");
            }
            if (numberToConvert.charAt(i) == 'R' || numberToConvert.charAt(i) == 'r') {
                numberToConvertList.add("27");
            }
            if (numberToConvert.charAt(i) == 'S' || numberToConvert.charAt(i) == 's') {
                numberToConvertList.add("28");
            }
            if (numberToConvert.charAt(i) == 'T' || numberToConvert.charAt(i) == 't') {
                numberToConvertList.add("29");
            }
            if (numberToConvert.charAt(i) == 'U' || numberToConvert.charAt(i) == 'u') {
                numberToConvertList.add("30");
            }
            if (numberToConvert.charAt(i) == 'V' || numberToConvert.charAt(i) == 'v') {
                numberToConvertList.add("31");
            }
            if (numberToConvert.charAt(i) == 'W' || numberToConvert.charAt(i) == 'w') {
                numberToConvertList.add("32");
            }
            if (numberToConvert.charAt(i) == 'X' || numberToConvert.charAt(i) == 'x') {
                numberToConvertList.add("33");
            }
            if (numberToConvert.charAt(i) == 'Y' || numberToConvert.charAt(i) == 'y') {
                numberToConvertList.add("34");
            }
            if (numberToConvert.charAt(i) == 'Z' || numberToConvert.charAt(i) == 'z') {
                numberToConvertList.add("35");
            }
            if (numberToConvert.charAt(i) == '€') {
                numberToConvertList.add("36");
            }
            if (numberToConvert.charAt(i) == '~') {
                numberToConvertList.add("37");
            }
            if (numberToConvert.charAt(i) == '`') {
                numberToConvertList.add("38");
            }
            if (numberToConvert.charAt(i) == '!') {
                numberToConvertList.add("39");
            }
            if (numberToConvert.charAt(i) == '@') {
                numberToConvertList.add("40");
            }
            if (numberToConvert.charAt(i) == '#') {
                numberToConvertList.add("41");
            }
            if (numberToConvert.charAt(i) == '$') {
                numberToConvertList.add("42");
            }
            if (numberToConvert.charAt(i) == '%') {
                numberToConvertList.add("43");
            }
            if (numberToConvert.charAt(i) == '^') {
                numberToConvertList.add("44");
            }
            if (numberToConvert.charAt(i) == '&') {
                numberToConvertList.add("45");
            }
            if (numberToConvert.charAt(i) == '*') {
                numberToConvertList.add("46");
            }
            if (numberToConvert.charAt(i) == '(') {
                numberToConvertList.add("47");
            }
            if (numberToConvert.charAt(i) == ')') {
                numberToConvertList.add("48");
            }
            if (numberToConvert.charAt(i) == '_') {
                numberToConvertList.add("49");
            }
            if (numberToConvert.charAt(i) == '-') {
                numberToConvertList.add("50");
            }
            if (numberToConvert.charAt(i) == '=') {
                numberToConvertList.add("51");
            }
            if (numberToConvert.charAt(i) == '[') {
                numberToConvertList.add("52");
            }
            if (numberToConvert.charAt(i) == ']') {
                numberToConvertList.add("53");
            }
            if (numberToConvert.charAt(i) == '{') {
                numberToConvertList.add("54");
            }
            if (numberToConvert.charAt(i) == '}') {
                numberToConvertList.add("55");
            }
            if (numberToConvert.charAt(i) == '|') {
                numberToConvertList.add("56");
            }
            if (numberToConvert.charAt(i) == ';') {
                numberToConvertList.add("57");
            }
            if (numberToConvert.charAt(i) == ':') {
                numberToConvertList.add("58");
            }
            if (numberToConvert.charAt(i) == '/') {
                numberToConvertList.add("59");
            }
            if (numberToConvert.charAt(i) == '?') {
                numberToConvertList.add("60");
            }
            if (numberToConvert.charAt(i) == '>') {
                numberToConvertList.add("61");
            }
            if (numberToConvert.charAt(i) == '<') {
                numberToConvertList.add("62");
            }
            if (numberToConvert.charAt(i) == ',') {
                numberToConvertList.add("63");
            }
            if (numberToConvert.charAt(i) == '.') {
                numberToConvertList.add("64");
            }
            if (numberToConvert.charAt(i) == '+') {
                numberToConvertList.add("65");
            }

        }


        int sizeOfListToConvert = numberToConvertList.size();
        double decimalValue = 0;
        double decrementator = 1;


        for (int i = 0; i < sizeOfListToConvert; i++) {
            Integer numberToConvertListCharAti = Integer.parseInt(String.valueOf(numberToConvertList.get(i)));
            double valueToAdd = numberToConvertListCharAti * (Math.pow(systemStart, (sizeOfListToConvert - decrementator)));
            decimalValue += valueToAdd;
            decrementator++;
        }

        if (decimalValue >= Double.MAX_VALUE) {
            System.out.println("Liczba w systemie dziesiętnym ma ponad 308 cyfr. Nie mogę jej wyświetlić.");
            exit.exit();
        } else {
            System.out.println("");
            System.out.println("Liczba w systemie dziesiętnym: " + new DecimalFormat("###,###,###").format(decimalValue));
        }

        decimalValue = Double.parseDouble(new DecimalFormat("#").format(decimalValue));

        List<Integer> convertedNumberList = new ArrayList<>();


        int decimalValueLength = String.valueOf(decimalValue).length();

        int decimalValueLengthCopy = decimalValueLength;

        for (int i = 0; i < 3; i++) {

            if (decimalValueLengthCopy % 4 == 0) {
                decimalValueLength = decimalValueLengthCopy / 4 * 3;
            }
            else if (decimalValueLengthCopy % 4 != 0) {
                decimalValueLength -= 1;
            }

        }



        List<Long> finalNumberList = new ArrayList<>();

        double decimalValueCopy = decimalValue;
        double sumOfPowering;
        double sumOfAll;
        int multiplier;
        int intValueOfSystemEnd = systemEnd;

        for (int i = 309; i >= 0; i--) {

            for (multiplier = (intValueOfSystemEnd - 1); multiplier > 0; multiplier--) {

                sumOfPowering = Math.pow(systemEnd, i);
                sumOfAll = multiplier * sumOfPowering;


                if (decimalValueCopy < systemEnd) {
                    finalNumberList.add ((long)decimalValueCopy);
                    decimalValueCopy -= decimalValueCopy;
                    break;
                } else {

                    if (sumOfAll <= decimalValueCopy) {
                        finalNumberList.add((long) multiplier);
                        decimalValueCopy -= sumOfAll;
                        break;

                    }

                    if (finalNumberList.size() != 0 && multiplier == 1 && sumOfAll > decimalValueCopy) {
                        finalNumberList.add(0L);
                        break;
                    }

                }
            }

        }


        Integer finalNumberListSize = finalNumberList.size();
        Long[] newFinalNumberList = new Long[finalNumberList.size()];

        for (int i = 0; i < finalNumberListSize; i++) {
            long j = finalNumberList.get(i);
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
            case "17":
                valueOfSystemEnd = "septadecynalnym(siedemnastkowym [17]): ";
                break;
            case "18":
                valueOfSystemEnd = "oktadecynalnym(ośiemnastkowym [18]): ";
                break;
            case "19":
                valueOfSystemEnd = "nanodecynalnym(dziewiętnastkowym [19]): ";
                break;
            case "20":
                valueOfSystemEnd = "wigintalnym(dwudziestkowym [20]): ";
                break;
            case "21":
                valueOfSystemEnd = "unwigintalnym(dwudziestojedynkowym [21]): ";
                break;
            case "22":
                valueOfSystemEnd = "duowigintalnym(dwudziestodwójkowym [22]): ";
                break;
            case "23":
                valueOfSystemEnd = "triwigintalnym(dwudziestotrójkowym [23]): ";
                break;
            case "24":
                valueOfSystemEnd = "tetrawigintalnynm(dwudziestoczwórkowym [24]): ";
                break;
            case "25":
                valueOfSystemEnd = "pentawigintalnym(dwudziestopiątkowym [25]): ";
                break;
            case "26":
                valueOfSystemEnd = "hexawigintalnym(dwudziestoszótkowym [26]): ";
                break;
            case "27":
                valueOfSystemEnd = "septawigintalnym(dwudziestosiódemkowym [27]): ";
                break;
            case "28":
                valueOfSystemEnd = "oktawigintalnym(dwudziestoośmiowym [28]): ";
                break;
            case "29":
                valueOfSystemEnd = "nanowigintalnym(dwudziestodziewiątkowym [29]): ";
                break;
            case "30":
                valueOfSystemEnd = "trigintalnym(trzydziestkowym [30]): ";
                break;
            case "31":
                valueOfSystemEnd = "untrigintalnym(trzydziestojedynkowym [31]): ";
                break;
            case "32":
                valueOfSystemEnd = "duotrigintalnym(trzydziestodwójkowym [32]): ";
                break;
            case "33":
                valueOfSystemEnd = "tritrigintalnym(trzydziestotrójkowym [33]): ";
                break;
            case "34":
                valueOfSystemEnd = "tetratrigintalnym(trzydziesto-czwórkowym [34]): ";
                break;
            case "35":
                valueOfSystemEnd = "pentatrigintalnym(trzydziesto-piątkowym [35]): ";
                break;
            case "36":
                valueOfSystemEnd = "hexatrigintalnym(trzydziesto-szóstkowym [36]): ";
                break;
            case "37":
                valueOfSystemEnd = "septatrigintalnym(trzydziesto-siódemkowym [37]): ";
                break;
            case "38":
                valueOfSystemEnd = "oktaatrigintalnym(trzydziesto-ósemkowym [38]): ";
                break;
            case "39":
                valueOfSystemEnd = "nanotrigintalnym(trzydziesto-dziewiątkowym [39]): ";
                break;
            case "40":
                valueOfSystemEnd = "tetragintalnym(czterdziestkowym [40]): ";
                break;
            case "41":
                valueOfSystemEnd = "untetragintalnym(czterdziesto-jedynkowym [41]): ";
                break;
            case "42":
                valueOfSystemEnd = "duotetragintalnym(czterdziesto-dwójkowym [42]): ";
                break;
            case "43":
                valueOfSystemEnd = "tritetragintalnym(czterdziesto-trójkowym [43]): ";
                break;
            case "44":
                valueOfSystemEnd = "tetratetragintalnym(czterdziesto-czwórkowym [44]): ";
                break;
            case "45":
                valueOfSystemEnd = "pentatetragintalnym(czterdziesto-piątkowym [45]): ";
                break;
            case "46":
                valueOfSystemEnd = "hexatetragintalnym(czterdziesto-szóstkowym [46]): ";
                break;
            case "47":
                valueOfSystemEnd = "septatetragintalnym(czterdziesto-siódemkowym [47]): ";
                break;
            case "48":
                valueOfSystemEnd = "oktatetragintalnym(czterdziesto-ósemkowym [48]): ";
                break;
            case "49":
                valueOfSystemEnd = "nanotetragintalnym(czterdziesto-dziewiątkowym [49]): ";
                break;
            case "50":
                valueOfSystemEnd = "pentagintalnym(pięćdziesiątkowym [50]): ";
                break;
            case "51":
                valueOfSystemEnd = "unpentagintalnym(pięćdziesięcio-jedynkowym [51]): ";
                break;
            case "52":
                valueOfSystemEnd = "duopentagintalnym(pięćdziesięcio-dwójkowym [52]): ";
                break;
            case "53":
                valueOfSystemEnd = "tripentagintalnym(pięćdziesięcio-trójkowym [53]): ";
                break;
            case "54":
                valueOfSystemEnd = "tetrapentagintalnym(pięćdziesięcio-czwórkowym [54]): ";
                break;
            case "55":
                valueOfSystemEnd = "pentapentagintalnym(pięćdziesięcio-piątkowym [55]): ";
                break;
            case "56":
                valueOfSystemEnd = "hexapentagintalnym(pięćdziesięcio-szóstkowym [56]): ";
                break;
            case "57":
                valueOfSystemEnd = "septapentagintalnym(pięćdziesięcio-siódemkowym [57]): ";
                break;
            case "58":
                valueOfSystemEnd = "oktapentagintalnym(pięćdziesięcio-ósemkowym [58]): ";
                break;
            case "59":
                valueOfSystemEnd = "nanopentagintalnym(pięćdziesięcio-dziewiątkowym [59]): ";
                break;
            case "60":
                valueOfSystemEnd = "hexagintalnym(sześćdziesiątkowym [60]): ";
                break;
            case "61":
                valueOfSystemEnd = "unhexagintalnym(sześćdziesięcio-jedynkowym [61]): ";
                break;
            case "62":
                valueOfSystemEnd = "duohexagintalnym(sześćdziesięcio-dwójkowym [62]): ";
                break;
            case "63":
                valueOfSystemEnd = "trihexagintalnym(sześćdziesięcio-trójkowym [63]): ";
                break;
            case "64":
                valueOfSystemEnd = "tetrahexagintalnym(sześćdziesięcio-czwórkowym [64]): ";
                break;
            case "65":
                valueOfSystemEnd = "pentahexagintalnym(sześćdziesięcio-piątkowym [65]): ";
                break;
            case "66":
                valueOfSystemEnd = "hexahexagintalnym(sześćdziesięcio-szóstkowym [66]): ";
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
            } else if (newFinalNumberList[i] == 16) {
                makingCharacterList.add("G");
            } else if (newFinalNumberList[i] == 17) {
                makingCharacterList.add("H");
            } else if (newFinalNumberList[i] == 18) {
                makingCharacterList.add("I");
            } else if (newFinalNumberList[i] == 19) {
                makingCharacterList.add("J");
            } else if (newFinalNumberList[i] == 20) {
                makingCharacterList.add("K");
            } else if (newFinalNumberList[i] == 21) {
                makingCharacterList.add("L");
            } else if (newFinalNumberList[i] == 22) {
                makingCharacterList.add("M");
            } else if (newFinalNumberList[i] == 23) {
                makingCharacterList.add("N");
            } else if (newFinalNumberList[i] == 24) {
                makingCharacterList.add("O");
            } else if (newFinalNumberList[i] == 25) {
                makingCharacterList.add("P");
            } else if (newFinalNumberList[i] == 26) {
                makingCharacterList.add("Q");
            } else if (newFinalNumberList[i] == 27) {
                makingCharacterList.add("R");
            } else if (newFinalNumberList[i] == 28) {
                makingCharacterList.add("S");
            } else if (newFinalNumberList[i] == 29) {
                makingCharacterList.add("T");
            } else if (newFinalNumberList[i] == 30) {
                makingCharacterList.add("U");
            } else if (newFinalNumberList[i] == 31) {
                makingCharacterList.add("V");
            } else if (newFinalNumberList[i] == 32) {
                makingCharacterList.add("W");
            } else if (newFinalNumberList[i] == 33) {
                makingCharacterList.add("X");
            } else if (newFinalNumberList[i] == 34) {
                makingCharacterList.add("Y");
            } else if (newFinalNumberList[i] == 35) {
                makingCharacterList.add("Z");
            } else if (newFinalNumberList[i] == 36) {
                makingCharacterList.add("€");
            } else if (newFinalNumberList[i] == 37) {
                makingCharacterList.add("~");
            } else if (newFinalNumberList[i] == 38) {
                makingCharacterList.add("`");
            } else if (newFinalNumberList[i] == 39) {
                makingCharacterList.add("!");
            } else if (newFinalNumberList[i] == 40) {
                makingCharacterList.add("@");
            } else if (newFinalNumberList[i] == 41) {
                makingCharacterList.add("#");
            } else if (newFinalNumberList[i] == 42) {
                makingCharacterList.add("$");
            } else if (newFinalNumberList[i] == 43) {
                makingCharacterList.add("%");
            } else if (newFinalNumberList[i] == 44) {
                makingCharacterList.add("^");
            } else if (newFinalNumberList[i] == 45) {
                makingCharacterList.add("&");
            } else if (newFinalNumberList[i] == 46) {
                makingCharacterList.add("*");
            } else if (newFinalNumberList[i] == 47) {
                makingCharacterList.add("(");
            } else if (newFinalNumberList[i] == 48) {
                makingCharacterList.add(")");
            } else if (newFinalNumberList[i] == 49) {
                makingCharacterList.add("_");
            } else if (newFinalNumberList[i] == 50) {
                makingCharacterList.add("-");
            } else if (newFinalNumberList[i] == 51) {
                makingCharacterList.add("=");
            } else if (newFinalNumberList[i] == 52) {
                makingCharacterList.add("[");
            } else if (newFinalNumberList[i] == 53) {
                makingCharacterList.add("]");
            } else if (newFinalNumberList[i] == 54) {
                makingCharacterList.add("{");
            } else if (newFinalNumberList[i] == 55) {
                makingCharacterList.add("}");
            } else if (newFinalNumberList[i] == 56) {
                makingCharacterList.add("|");
            } else if (newFinalNumberList[i] == 57) {
                makingCharacterList.add(";");
            } else if (newFinalNumberList[i] == 58) {
                makingCharacterList.add(":");
            } else if (newFinalNumberList[i] == 59) {
                makingCharacterList.add("/");
            } else if (newFinalNumberList[i] == 60) {
                makingCharacterList.add("?");
            } else if (newFinalNumberList[i] == 61) {
                makingCharacterList.add(">");
            } else if (newFinalNumberList[i] == 62) {
                makingCharacterList.add("<");
            } else if (newFinalNumberList[i] == 63) {
                makingCharacterList.add(",");
            } else if (newFinalNumberList[i] == 64) {
                makingCharacterList.add(".");
            }else if (newFinalNumberList[i] == 65) {
                makingCharacterList.add("+");
            } else {
                makingCharacterList.add(newFinalNumberList[i].toString());
            }
        }
        for (int i = 0; i < (makingCharacterList.size()); i++) {
            System.out.print(makingCharacterList.get(i));
        }
        exit.exit();
    }


}