package pl.lublin.wsei.java.cwiczenia.mylib;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Scanner;

public class Cw {

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName("Eryk Sadłowski");
        System.out.println(acc.getName());
    }
}
