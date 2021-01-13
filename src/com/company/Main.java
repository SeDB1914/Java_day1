package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	    System.out.println("Hello Java");

        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = input.nextLine();
        System.out.printf("Hello %s!\n", firstName);
        System.out.println("What is your last name?");
        String lastName = input.nextLine();
        System.out.printf("Hi, %s %s. How are you?\n", firstName, lastName);

        System.out.println("Type in an adverb: ");
        String adverb = input.nextLine();
        System.out.println("Now type an adjective: ");
        String adjective = input.nextLine();
        System.out.println("Give me a noun: ");
        String noun = input.nextLine();
        System.out.println("Give me another noun: ");
        String nounTwo = input.nextLine();
        System.out.println("Give me a number: ");
        String number = input.nextLine();
        System.out.println("Give me a friend's name: ");
        String friendName = input.nextLine();

        System.out.printf("Here is your story: \n");
        System.out.printf("\n Dear %s,", friendName);
        System.out.printf("\n You are %s %s and I want to be your %s!", adverb, adjective, noun);
        System.out.printf("\n I want to go to the %s with you in %s days.", nounTwo, number);
        System.out.printf("\n Sincerely, %s \n", firstName);
    }
}




