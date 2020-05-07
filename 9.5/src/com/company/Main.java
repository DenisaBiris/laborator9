package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

   public static  List<Character> list = new ArrayList<>();
   public static List<Character> listcopy = new ArrayList<>();



    public static void main(String[] args) { String string;
        String stringcopy;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti sirul din L1: ");
        string = scanner.next();
        System.out.println("Introduceti sirul din L2: ");
        stringcopy=scanner.next();
        char[] chars = string.toCharArray();
        for(int i=0;i<string.length();i++)
        list.add(chars[i]);
        System.out.println("L1 initial: ");
        System.out.println(list);
        char[] charscopy=stringcopy.toCharArray();
        for(int i=0;i<stringcopy.length();i++)
            listcopy.add(charscopy[i]);
        System.out.println("L2 initial:");
        System.out.println(listcopy);

        //de exemplu
         cutAndPaste(0,2,1);
        System.out.println("Dupa operatia CUT AND PASTE:");
        System.out.println(list);
        System.out.println(listcopy);
    }



    public static void cutAndPaste(int start, int end, int pos)
     {
         List<Character> listtemp = new ArrayList<>(list);
         Collections.reverse(listtemp);
        int q=listtemp.size();
        for(int i=end;i>=start;i--)
        {

            listcopy.add(pos, listtemp.get(q-1));
             q--;
             pos++;
            list.remove(i);

        }


}}
