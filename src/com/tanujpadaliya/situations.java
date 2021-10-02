package com.tanujpadaliya;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class situations {
    public static void subSituation1() {
        Scanner sit2 = new Scanner(System.in);
        System.out.print("> He sees you, are you still going to attack him? ");
        String userCommand = sit2.nextLine();
        if (Objects.equals(userCommand, "no")){
            System.out.print("You run away but he chases after you! You see a sewer and hide");
            System.out.print("....");
            System.out.println("Do you want to go back up and fight him? ");
            if (Objects.equals(userCommand, "yes")) {
                System.out.println("you punch him in the face and he punched you back");
            }
        }
    }
    public static void situation1() {
        Scanner sit1 = new Scanner(System.in);
        System.out.print("> You enter a bank and there are 2 hallways, would you like to go left or right? ");
        String userCommand = sit1.nextLine();
        if (Objects.equals(userCommand.toLowerCase(Locale.ROOT), "right")) {
            System.out.print("> Oh no you have faced a guard. Will you kill him? ");
            userCommand = sit1.nextLine();
            if (Objects.equals(userCommand, "yes")) {
                subSituation1();
            } else if (Objects.equals(userCommand.toLowerCase(Locale.ROOT), "no")) {
//                TODO: Add the other events from this event
                System.out.print("You quietly sneak behind him and knock him out");
//                TODO: Create a sub situation for situation 1
            }
        }
        if (Objects.equals(userCommand.toLowerCase(Locale.ROOT), "left")) {
            System.out.print("> You find 2 more hallways, left or right? ");
            userCommand = sit1.nextLine();
            if (Objects.equals(userCommand, "right")) {
//                TODO: Add the other events from this event
                System.out.print("You have found a gun!!");
            } else if (Objects.equals(userCommand.toLowerCase(Locale.ROOT), "left")) {
//                TODO: Add the other events from this event
                System.out.print("You found a guard, what will you do? ");
            }
        }
    }
}




