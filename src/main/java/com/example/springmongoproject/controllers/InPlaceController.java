package com.example.springmongoproject.controllers;

import com.example.springmongoproject.models.InPlace;
import com.example.springmongoproject.services.InPlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/in_places")
public class InPlaceController {
    private final InPlaceService inPlaceService;

    @Autowired
    public InPlaceController(InPlaceService inPlaceService) {
        this.inPlaceService = inPlaceService;
    }

    @GetMapping()
    public List<InPlace> getInPlaces() {
        return inPlaceService.getAllInPlace();
    }

    @PostMapping("/create")
    public ResponseEntity<HttpStatus> create(@RequestBody InPlace inPlace) {
        inPlaceService.save(inPlace);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
