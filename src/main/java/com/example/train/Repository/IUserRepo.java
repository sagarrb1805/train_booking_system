package com.example.train.Repository;

import com.example.train.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepo extends CrudRepository<User, Integer> {
}
