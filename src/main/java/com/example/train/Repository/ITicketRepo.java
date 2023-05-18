package com.example.train.Repository;

import com.example.train.Models.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface ITicketRepo extends CrudRepository<Ticket, Integer> {
}
