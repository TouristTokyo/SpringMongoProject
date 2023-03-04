package com.example.springmongoproject.services;

import com.example.springmongoproject.models.Place;
import com.example.springmongoproject.repositories.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class PlaceService {
    private final PlaceRepository placeRepository;

    @Autowired
    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public List<Place> getPlacesByName(String name) {
        return placeRepository.findByName(name);
    }

    @Transactional
    public void save(Place place) {
        placeRepository.save(place);
    }

    @Transactional
    public void savePersons(List<Place> places) {
        placeRepository.saveAll(places);
    }

    public List<Place> getPlaces() {
        return placeRepository.findAll();
    }

    @Transactional
    public void deleteByName(String name) {
        placeRepository.deleteByName(name);
    }
}
