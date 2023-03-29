package com.publicis.sapient.otb.controller;

import com.google.gson.Gson;
import com.publicis.sapient.otb.model.Theater;
import com.publicis.sapient.otb.service.MovieBookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieBookingController {

    public static Gson gson = new Gson();
    MovieBookingService bookingService;
    @GetMapping("/")
    public ResponseEntity<String>  getTheatersByMovieName(@RequestParam String movieName){
        List<Theater> theaterList = bookingService.getTheatersWithTimeSlots(movieName);
        return ResponseEntity.ok(gson.toJson("This is a String"));

    }

    @GetMapping("/")
    public ResponseEntity<String>  getSlotsByTheater(@RequestParam String theaterId,@RequestParam String time){
      //  List<Theater> theaterList = bookingService.getTheaters();
        return ResponseEntity.ok(gson.toJson("This is a String"));

    }
}
