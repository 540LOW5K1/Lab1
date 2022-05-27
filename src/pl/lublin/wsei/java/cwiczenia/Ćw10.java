package pl.lublin.wsei.java.cwiczenia;

import java.util.Locale;
import java.util.Scanner;

public class Ćw10 {

    private static Integer integer;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x;
        System.out.print("Podaj liczbę: ");
        x = input.nextInt();
        String bin = leftPad(integer.toBinaryString(x).toUpperCase(Locale.ROOT), '0', 8);
        String hex = leftPad(integer.toHexString(x).toUpperCase(Locale.ROOT), '0', 4);
        System.out.printf("DEC = %d, BIN = %s, HEX =%s", x, bin, hex);
    }

    public static String leftPad(String aText, char aChar, int aWidth) {
        String res = aText;
        for (int i = 0; i < aWidth - aText.length(); i++)
            res = aChar + res;

        return res;
    }
}

