package com.company;

import java.util.Scanner;

public class Cities {

    public static void main(String[] args) {

        String city1;
        String city2;
        String city3;
        String temp = "";
        Scanner input = new Scanner(System.in);

        System.out.println("\t\t\tCities in Alphabetical Order");
        System.out.println();

        System.out.print("Enter the first city: " );
        city1 = input.nextLine();

        System.out.print("Enter the second city: ");
        city2 = input.nextLine();

        System.out.print("Enter the third city: ");
        city3 = input.nextLine();
        System.out.println();


        if (city1.compareTo(city2)>0){
            temp = city1;
            city1 = city2;
            city2 = temp;
        }
        if (city2.compareTo(city3)>0){
            temp = city2;
            city2 = city3;
            city3 = temp;
        }
        if (city1.compareTo(city2)>0){
            temp = city1;
            city1 = city2;
            city2 = temp;
        }
        System.out.println("The three cities in alphabetical order are: " + city1 +",  "+ city2 +",  "+ city3);

    }
}
