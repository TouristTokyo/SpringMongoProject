package com.example.springmongoproject.services;

import com.example.springmongoproject.models.InPlace;
import com.example.springmongoproject.repositories.InPlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class InPlaceService {
    private final InPlaceRepository inPlaceRepository;

    @Autowired

    public InPlaceService(InPlaceRepository inPlaceRepository) {
        this.inPlaceRepository = inPlaceRepository;
    }

    public List<InPlace> getAllInPlace(){
        return inPlaceRepository.findAll();
    }

    @Transactional
    public void save(InPlace inPlace){
        inPlaceRepository.save(inPlace);
    }

}
