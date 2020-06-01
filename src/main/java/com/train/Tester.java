package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        System.out.print("Please enter number of tickets:");
        Scanner scanner = new Scanner(System.in);
        int ticketNum = scanner.nextInt();

        System.out.print("How many round-trip tickets:");
        int roundNum = scanner.nextInt();

        Ticket t = new Ticket(ticketNum,roundNum);
        System.out.print("Total:"+ t.amount());
    }
}
