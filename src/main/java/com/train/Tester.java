package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        System.out.print("Please enter number of tickets:");
        Scanner scanner = new Scanner(System.in);
        int TicketNum = scanner.nextInt();

        System.out.print("How many round-trip tickets:");
        int RoundNum = scanner.nextInt();

        Ticket t = new Ticket(TicketNum,RoundNum);
        System.out.print("Total:"+ t.amount());
    }
}
