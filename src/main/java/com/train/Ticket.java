package com.train;

public class Ticket {
    int TicketNum;
    int RoundNum;
    float total;

    public Ticket(int TicketNum, int RoundNum) {
        this.TicketNum = TicketNum;
        this.RoundNum = RoundNum;
    }
    public float amount(){
        total = 1000*(TicketNum-RoundNum) + 2000*RoundNum*0.9f;
        return total;
    }
}
