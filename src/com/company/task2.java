package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class task2 {

    public static void main(String[] args) throws IOException {
        List<String> employees = new ArrayList<>();
        try(BufferedReader tj = new BufferedReader(new FileReader("src/data.txt"))){

            String line;
            while ((line = tj.readLine()) !=null){
                employees.add(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        //print size of collection

        System.out.println("The size of the collection is: " + employees.size());
        //FOR EACH LOOP
        System.out.println("\n");
        System.out.println("FOR EACH LOOP : ");
        for
        (
                String employee:employees
        )
        {
            System.out.println(employee);
        }
        //Hash set to stop repetition
        HashSet<String> set = new HashSet<String>(employees);
        //with no repetition
        List<String> newlist = new ArrayList<>(set);
        System.out.println("\n");
        System.out.println("List after removing duplicated elements: ");
        for (Object ob:newlist)
            System.out.println(ob);

    }
}