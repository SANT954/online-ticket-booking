package com.publicis.sapient.otb.service;

import com.publicis.sapient.otb.TheaterInfoDao;
import com.publicis.sapient.otb.model.Theater;

import java.util.List;


public class MovieBookingService {
    private TheaterInfoDao dao;
    public List<Theater> getTheatersWithTimeSlots(String movieName) {

        dao.queryTheaterByMovie(movieName);
    return null;
    }
}
