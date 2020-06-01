package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Please enter number of tickets:")
    var ticketNum = scanner.nextInt()

    print("How many round-trip tickets:")
    var roundNum = scanner.nextInt()

    var total = Total(ticketNum,roundNum)
    print("Total:"+total.amount())
}

class Total(var ticketNum:Int, var roundNum:Int){
    fun amount():Float{
        var total = 1000*(ticketNum - roundNum)+2000*roundNum*0.9f
        return total
    }
}