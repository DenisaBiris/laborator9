package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static  LinkedList<String> lista = new LinkedList<>();
    public static  int n;
    public static  String element;

    public static void main(String[] args) {

        getList();
        print();
    }
    public static void getList(){
        System.out.println("Cate elemente doriti sa aiba lista?  ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti elementele listei:");
        for (int i = 0; i <n ; i++) {
            System.out.print("Elementul #"+ (i+1) +" : ");
            element = scanner.nextLine();
            lista.add(element.toUpperCase());
        }


    }

    public static  void print()
    {
        System.out.print("\nElementele listei sunt:\n");
        for(int i=0;i<n;i++)
            System.out.print(lista.get(i)+" ");
    }
    }



