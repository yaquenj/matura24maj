/*

Zadanie 4 Liczby

3000 liczb z przedzialu [2, 2000]
20 liczb całkowitych z przedziału [2, 1 000 000 000] (10^10)
rozdzielone w wierszach spacjami


4.1
Ile liczb z pierwszego wiersza jest dzielnikiem jakiejkolwiek liczby spośród liczb z drugiego wiersza

199, tylko liczba 31 wystepujaca raz nie jest dzielnikiem zadnej z liczb w 2 wierszu

4.2
Z 1 wiersza podaj liczbe ktora jest 101 liczbą w kolejności licząc od największej po ich uporządkowaniu

wśród liczb 2, 4, 2, 3, 3, 4 drugą w kolejności, licząc od największej, jest liczba 4.

4.3
Dla każdej z liczb z 2 wiersza rozstrzygnij czy da się ją przedstawić jako iloczyn jedynie liczb z pierwszego wiersza. Przy tym liczba wystąpień danego czynnika w iloczynie nie może być większa niż liczba wystąpień tego czynnika w pierwszym wierszy. Znajdź wszystkie które można tak przedstawić.

10 12 14 15 18 20 21 25 27 28

 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static String readFile(String path) {
        try {
            return Files.readString(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
            return "Error!";
        }
    }
    public static ArrayList<Integer> getContents(int x) {
        String file_content = readFile("./dane/liczby_przyklad.txt");

        String[] lines = file_content.split("\n");

        int[] line = Arrays.stream(lines[x].trim().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> list = new ArrayList<>();

        for (int n : line)
            list.add(n);

        return list;
    }
    public static void main(String[] args) {
        zadanie41();
        zadanie42();
        zadanie43();
        zadanie44();
    }
    public static void zadanie41() {

        int n = 0;

        ArrayList<Integer> list_1 = getContents(0);
        ArrayList<Integer> list_2 = getContents(1);

        for (int s_a : list_1) {
            for (int s_b: list_2) {
                if (s_b % s_a == 0) {
                    n++;
                    break;
                }
            }
        }

        System.out.println("Zadanie 1\n" + n);

    }
    public static void zadanie42() {

        ArrayList<Integer> list_1 = getContents(0);

        Collections.sort(list_1);
        Collections.reverse(list_1);

        System.out.println("Zadanie 2\n" + list_1.get(102));

    }
    public static void zadanie43() {

    }
    public static void zadanie44() {

    }
}