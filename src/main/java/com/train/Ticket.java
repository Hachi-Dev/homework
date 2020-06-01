package com.train;

public class Ticket {
    int ticketNum;
    int roundNum;
    float total;

    public Ticket(int ticketNum, int roundNum) {
        this.ticketNum = ticketNum;
        this.roundNum = roundNum;
    }
    public float amount(){
        total = 1000*(ticketNum-roundNum) + 2000*roundNum*0.9f;
        return total;
    }
}
