package com.company;
import java.util.LinkedList;
import java.util.Scanner;

public class Lists {
    public LinkedList<String> lista = new LinkedList<>();
    public int n;
    public String[] str;
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
        String[] itemsArray = new String[lista.size()];
        itemsArray = lista.toArray(itemsArray);
        sort(itemsArray,0,n-1);
        System.out.println("Elementele sortate print tehnica QuickSort sunt:\n");
        for(int i=0; i<n;i++)
            System.out.println(itemsArray[i]+" ");

    }

   public int partition(String[] itemArray, int low, int high)
    {
        String pivot = itemArray[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (itemArray[j].compareTo(pivot)<0)
            {
                i++;

                String temp = itemArray[i];
                itemArray[i] = itemArray[j];
                itemArray[j] = temp;
            }
        }

        String temp = itemArray[i+1];
        itemArray[i+1] = itemArray[high];
        itemArray[high] = temp;

        return i+1;
    }


   public void sort(String[] itemArray, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(itemArray, low, high);


            sort(itemArray, low, pi-1);
            sort(itemArray, pi+1, high);
        }
    }


    public void print(int n, LinkedList lista)
    {
        System.out.print("\nElementele listei sunt:\n");
        for(int i=0;i<n;i++)
            System.out.print(lista.get(i)+" ");
        System.out.println();
    }

}