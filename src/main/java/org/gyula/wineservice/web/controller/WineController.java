package org.gyula.wineservice.web.controller;

import org.gyula.wineservice.web.model.WineDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/wine/")
public class WineController {

    @GetMapping("/{wineId}")
    public ResponseEntity<WineDTO> getWineById(@PathVariable("wineId") UUID wineId) {

        //todo impl
        return new ResponseEntity<>(WineDTO.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewWine( WineDTO wineDTO) {
        //todo impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{wineId}")
    public ResponseEntity updateById(@PathVariable("wineId") UUID wineId, @RequestBody WineDTO wineDTO) {

        //todo impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
