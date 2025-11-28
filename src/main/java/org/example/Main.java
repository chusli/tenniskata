package org.example;

import java.util.Scanner;

public class Main {
    static void main() {

        System.out.println("Tennis");
        Set set = new Set(Player.ONE);
        do {
            Scanner input = new Scanner(System.in);
            int i = input.nextInt();
            set.addPoint(i == 1 ? Player.ONE : Player.TWO);
            String score = set.printScore();
            System.out.println(score);
        } while (true);
    }
}
