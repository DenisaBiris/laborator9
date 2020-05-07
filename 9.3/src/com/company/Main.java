package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static LinkedList<String> L = new LinkedList<>();
    public static List<Long> P = new ArrayList<>();
    public static int n,k;
    public static String element;


    public static void main(String[] args) {
        getL(L);
        getP(P);
        printL(L);
        printP(P);
        delete(L,P);
        printL(L);
    }
    public static void getL(LinkedList L) {
        System.out.println("Cate elemente doriti sa aiba lista de cuvinte?  ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti elementele listei:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elementul #" + (i + 1) + " : ");
            element = scanner.nextLine();
            L.add(element.toUpperCase());
        }
    }
    public static void getP(List P) {
        System.out.println("Cate elemente doriti sa aiba lista de numere? (k < n )  ");
        Scanner scanner = new Scanner(System.in);
        k = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti elementele listei:");
        for (int i = 0; i < k; i++) {
            System.out.print("Elementul #" + (i + 1) + " : ");
            element = scanner.nextLine();
            P.add(element.toUpperCase());
        }}
    public static void printL(LinkedList L) {
        System.out.print("\nElementele listei sunt:\n");
        for (int i = 0; i < n; i++)
            System.out.print(L.get(i) + " ");
    }
    public static void printP(List P) {
        System.out.print("\nElementele listei sunt:\n");
        for (int i = 0; i < k; i++)
            System.out.print(Integer.parseInt((String) P.get(i)) + " ");
    }
    public static void delete(LinkedList<String> L, List P){
        for(int i=k-1;i>=0;i--)
        {
            L.remove(Integer.parseInt((String) P.get(i)));
            n--;
        }
    }}