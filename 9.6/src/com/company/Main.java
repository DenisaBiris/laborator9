package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] argv) {
        List<Integer> list;
        System.out.println(list = JOSEPHUS(10, 5));
        System.out.println("Ultimul copil ramas are numarul "+list.get(list.size() - 1));


    }


   public static List<Integer> JOSEPHUS(int N, int M) {

        List<Integer> p = new LinkedList<>();
        for (int i = 0; i < N; i++)
            p.add(i + 1);

        List<Integer> list = new LinkedList<>();
        int i = -1;
        for (int j = N; j >0 ; j--) {
            i = (i + M) % N;
            list.add(p.remove(i));
            N--;
            i--;
        }

        return list;
    }

}

