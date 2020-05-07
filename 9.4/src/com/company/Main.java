package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti prima fraza:");
        String phrase1 = scanner.nextLine();
        System.out.println("Introduceti a doua fraza:");
        String phrase2 = scanner.nextLine();
        list.add(phrase1);
        list.add(phrase2);

        System.out.println("Lista cu cele 2 fraze: "+list);
        String[] string1  = phrase1.split("[\\s\\xA0]+");
        String[] string2 = phrase2.split("[\\s\\xA0]+");

        int count=0;
        for (String i : string1) {
            for (String j : string2) {
                if (i.compareTo(j) == 0)
                    count++;
            }
        }
        System.out.println("\nApar "+count+" cuvinte comune.");










    }
}
