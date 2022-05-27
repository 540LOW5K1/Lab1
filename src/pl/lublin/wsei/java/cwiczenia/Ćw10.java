package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Ćw10 {

    private static Integer integer;

    public static void main(String[]  args) {

            Scanner input = new Scanner(System.in);
            int x;
                System.out.print("Podaj liczbę: ");
                x = input.nextInt();
                String bin = integer.toBinaryString(x);
                String hex = integer.toHexString(x);
                System.out.printf("DEC = %d, BIN = %s, HEX =%s", x,bin, hex);
            }
        }
