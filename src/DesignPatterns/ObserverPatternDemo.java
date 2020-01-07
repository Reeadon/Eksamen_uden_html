package DesignPatterns;

import java.util.Scanner;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject sub = new Subject();

        new HexObserver(sub);
        new OctObserver(sub);
        new BinObserver(sub);
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            sub.setState((scan.nextInt()));
        }
    }
}
