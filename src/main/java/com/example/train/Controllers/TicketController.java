package com.example.train.Controllers;


import com.example.train.Models.Ticket;
import com.example.train.Services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @PostMapping("/bookTicket")
    public Ticket bookTicket(@RequestBody Ticket ticket){
        return ticketService.bookTicket(ticket);
    }

    @GetMapping("/getTickets")
    public List<Ticket> getTickets(){
        return ticketService.getTickets();
    }
}
