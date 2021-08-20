package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);              //b
        System.out.println("enter 5 lines into list A");
        String answer1 = scanner.nextLine();
        String answer2 = scanner.nextLine();
        String answer3 = scanner.nextLine();
        String answer4 = scanner.nextLine();
        String answer5 = scanner.nextLine();


        ArrayList<String>List_A = new ArrayList<>();     //c
        List_A.add(answer1);
        List_A.add(answer2);
        List_A.add(answer3);
        List_A.add(answer4);
        List_A.add(answer5);
        System.out.println("список A"+List_A);


        Scanner scanner1 = new Scanner(System.in);              //d
        System.out.println("enter 5 lines into list B");
        String answer1B = scanner1.nextLine();
        String answer2B = scanner1.nextLine();
        String answer3B = scanner1.nextLine();
        String answer4B = scanner1.nextLine();
        String answer5B = scanner1.nextLine();


        ArrayList<String>List_B = new ArrayList<>();     //c
        List_B.add(answer1B);
        List_B.add(answer2B);
        List_B.add(answer3B);
        List_B.add(answer4B);
        List_B.add(answer5B);
        System.out.println("список B"+List_B);



        ArrayList<String>List_C = new ArrayList<>();       //e

        //{A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
        List_A.clear();
        List_B.clear();
        List_A.add(0,answer1);
        List_A.add(1,answer5B);
        List_A.add(2,answer2);
        List_A.add(3,answer4B);
        List_A.add(4,answer3);

        List_B.add(0,answer3B);
        List_B.add(1,answer4);
        List_B.add(2,answer2B);
        List_B.add(3,answer5);
        List_B.add(4,answer1B);


        List_C.addAll(List_A);              //f
        List_C.addAll(List_B);
        System.out.println("список C"+List_C);

        List_C.sort(Comparator.comparing(String::length));      //g
        System.out.println("отсортированный список"+List_C);


    }
}
