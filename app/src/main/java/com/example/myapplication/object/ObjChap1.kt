package com.example.myapplication.`object`

import java.time.LocalDate
import java.time.LocalDateTime

/**
 * Created by Namget on 2020.03.16.
 */
class Invitation {
    private val whens: LocalDateTime
}

class Ticket(val fee: Long)

class Bag(
    val amount: Long,
    val invitation: Invitation? = null,
    val ticket: Ticket?
) {
    fun hasInvitation(): Boolean = invitation != null
}

class Audience(val bag : Bag)

class TicketOffice(
    var amount:Long,
    val tickets : MutableList<Ticket> = arrayListOf()
){
    fun getTicket() = tickets.removeAt(0)
    fun minusAmount() = amount--
    fun plusAmount() = amount++
}

class TicketSeller(val ticketOffice: TicketOffice)

class Theater(private val ticketSeller: TicketSeller){
    fun enter(audience: Audience){
        val ticket = ticketSeller.ticketOffice.tickets
        val audience.bag.ticket = ticket[0]
    } else{
        val ticket = ticketSeller.ticketOffice.getTicket()
            ...
    }
}