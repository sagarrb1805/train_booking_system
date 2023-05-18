package com.example.train.Services;

import com.example.train.Models.Train;
import com.example.train.Repository.ITrainRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TrainService {
    @Autowired
    private ITrainRepo trainRepo;

    public Train addTrain(Train train){
        trainRepo.save(train);
        return train;
    }
    public Optional<Train> getTrainById(int id){
        return trainRepo.findById(id);

    }
}
