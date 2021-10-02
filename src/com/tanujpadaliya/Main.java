package com.tanujpadaliya;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner mainInput = new Scanner(System.in);
        while (true) {
            System.out.print("> ");
            String userCommand = mainInput.nextLine();
            if (Objects.equals(userCommand, "quit")) {
                break;
            } else if (Objects.equals(userCommand, "help")) {
                System.out.println("""
                        > quit -> quit the program
                        > start -> Start the game
                        > help -> bring up the help panel
                        """);
            } else if (Objects.equals(userCommand, "start")) {
                situations.situation1();
            }
        }
    }
}

