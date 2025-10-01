package com.pluralsight;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //all variables
        String first;
        String last;
        String middle = "";
        String suffix = "";
        String fullname;
        String choice;

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Which format would you like to use? 
                1) First Last
                2) First Middle Last Suffix 
                """);
        choice = scanner.nextLine().trim();
        //Format selection
        if (choice.charAt(0) == '1' ){
            //First Way
            System.out.println("Enter your full name: ");
            fullname = scanner.nextLine().trim();
            String[] tokens = fullname.split("\\s+"); //split only on one whitespace and words not on tabs or extra whitespaces
            if(tokens.length != 2){ //if the length of tokens is not 2 that means we do not have enough info
                System.out.println("Invalid Input: Program will quit now...");
                System.exit(1); //quit
            }//if this does not run it means we have all the info we need

            //assign
            first = tokens[0].trim();
            last = tokens[1].trim();

            //print
            System.out.println("First Name: "+ first);
            System.out.println("Last Name: "+ last);
        }else{
            //Second way
            System.out.println("Enter your full name: ");
            fullname = scanner.nextLine().trim();
            String[] tokens = fullname.split("\\s+");
            if (tokens.length != 4){
                System.out.println("Invalid Input: Program will quit now...");
                System.exit(1);
            }
            //assign
            first = tokens[0].trim();
            middle = tokens[1].trim();
            last = tokens[2].trim();
            suffix = tokens[3].strip();

            //print
            System.out.println("First Name: "+ first);
            System.out.println("Last Name: "+ last);
            System.out.println("Middle Name: "+ middle);
            System.out.println("Suffix: " + suffix);
        }
    }
}