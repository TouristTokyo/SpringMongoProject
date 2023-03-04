package com.example.springmongoproject.controllers;

import com.example.springmongoproject.models.Place;
import com.example.springmongoproject.services.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/places")
public class PlaceController {
    private final PlaceService placeService;

    @Autowired
    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }

    @GetMapping
    public List<Place> getPlaces() {
        return placeService.getPlaces();
    }

    @GetMapping("/{name}")
    public List<Place> getPerson(@PathVariable("name") String name) {
        return placeService.getPlacesByName(name);
    }

    @PostMapping("/create")
    public ResponseEntity<HttpStatus> create(@RequestBody Place place) {
        placeService.save(place);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<HttpStatus> delete(@RequestBody Place place) {
        placeService.deleteByName(place.getName());
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
