package com.publicis.sapient.otb.model;

import java.sql.Timestamp;
import java.util.List;

public class Screen {
    String id;
    String movieName;
    String theaterId;
    Timestamp showStartTime;
    Timestamp showFinishTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }


    public String getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(String theaterId) {
        this.theaterId = theaterId;
    }

    public Timestamp getShowStartTime() {
        return showStartTime;
    }

    public void setShowStartTime(Timestamp showStartTime) {
        this.showStartTime = showStartTime;
    }

    public Timestamp getShowFinishTime() {
        return showFinishTime;
    }

    public void setShowFinishTime(Timestamp showFinishTime) {
        this.showFinishTime = showFinishTime;
    }
}
