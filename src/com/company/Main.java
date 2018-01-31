package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("iveskite betkoki zodi");

        String zodis = "";
        while (!zodis.equals("pabaiga")) {
            zodis = sc.next();
            System.out.println(zodis);
        }
        // write your code here
    }
}
