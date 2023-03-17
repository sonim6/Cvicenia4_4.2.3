package org.example;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int size;
        System.out.println("Kolko prvkov chcete zadat ?");
        size=input.nextInt();
        ArrayList<String> arr= new ArrayList<String>(size);
        System.out.println("Mozte zadat "+size+" prvkov:");
        for(int i=0; i<size; i++)
            arr.add(input.next());
        System.out.println("Vami zadane prvky: ");
        Iterator<String> it= arr.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }

}