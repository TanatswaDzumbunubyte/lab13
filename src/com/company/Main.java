package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<String> employeeslist= new ArrayList<>();


        try
        {
            Scanner scanner=
                    new Scanner(new File("src/com/company/names.txt"));
            String line;
            while
            (


                    ((line = scanner.toString()) !=null))
            employeeslist.add(line);
            {
                System.out.println(scanner.nextLine());}
            scanner.close();
            }

        catch(FileNotFoundException e){e.printStackTrace();

        }

      System.out.println("Size of collection is:  " + employeeslist.size() );

        System.out.println("");
        System.out.println("For loop : ");
        for (int i =0 ;i< employeeslist.size();i++){
            System.out.println(employeeslist.get(i));
        }
        System.out.println("");
        System.out.println("For each loop : ");
        for (String employee:employeeslist)
        {
            System.out.println((employee));
        }

        System.out.println("");
        System.out.println("Iteration : ");
        Iterator<String> it = employeeslist.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }


    }
}
