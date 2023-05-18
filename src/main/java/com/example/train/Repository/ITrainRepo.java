package com.example.train.Repository;

import com.example.train.Models.Train;
import org.springframework.data.repository.CrudRepository;

public interface ITrainRepo extends CrudRepository<Train, Integer> {
}
