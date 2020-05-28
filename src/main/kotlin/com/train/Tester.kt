package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`);

    print("Please enter number of tickets:");
    var TicketNum = scanner.nextInt();

    print("How many round-trip tickets:");
    var RoundNum = scanner.nextInt();

    var total = Total(TicketNum,RoundNum);
    print("Total:"+total.amount());
}

class Total(var TicketNum:Int, var RoundNum:Int){
    fun amount():Float{
        var total = 1000*(TicketNum - RoundNum)+2000*RoundNum*0.9f;
        return total;
    }
}