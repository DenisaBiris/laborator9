package com.company;
import java.util.LinkedList;
import java.util.Scanner;

public class Lists {
    public LinkedList<String> lista = new LinkedList<>();
    public int n;
    public String element;
    public void main()
    {
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
       print(n,lista);
    }


    public void print(int n, LinkedList lista)
    {
        System.out.print("\nElementele listei sunt:\n");
        for(int i=0;i<n;i++)
            System.out.print(lista.get(i)+" ");
    }
}