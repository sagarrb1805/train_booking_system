package com.example.train.Services;

import com.example.train.Models.Ticket;
import com.example.train.Repository.ITicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class TicketService {
    @Autowired
    private ITicketRepo ticketRepo;

    public Ticket bookTicket(Ticket ticket){
        ticketRepo.save(ticket);
        return ticket;
    }

    public List<Ticket> getTickets(){
        return (List<Ticket>) ticketRepo.findAll();
    }

}
