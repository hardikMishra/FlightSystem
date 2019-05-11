package com.example.demo10;

import java.sql.Time;
import java.util.Date;

public class flight {

    int flightNo;
    Date date = new Date();
    Time time;
    String source1;
    String destination;
    int noOfAdults = 0;
    int noOfChildten = 0;

    public flight(int flightNo, Date date, Time time, String source, String destination, int countAdult, int countChild){
        this.date = date;
        this.time = time;
        this.flightNo = flightNo;
        this.source1 = source;
        this.destination = destination;
        noOfAdults = countAdult;
        noOfChildten = countChild;

    }

    public int getFlightNo() {
        return flightNo;
    }

    public Date getDate() {
        return date;
    }

    public int getNoOfAdults() {
        return noOfAdults;
    }

    public int getNoOfChildten() {
        return noOfChildten;
    }

    public String getDestination() {
        return destination;
    }

    public String getSource1() {
        return source1;
    }

    public Time getTime() {
        return time;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightNo(int flightNo) {
        this.flightNo = flightNo;
    }

    public void setNoOfAdults(int noOfAdults) {
        this.noOfAdults = noOfAdults;
    }

    public void setNoOfChildten(int noOfChildten) {
        this.noOfChildten = noOfChildten;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String setSource1(String source1) {
        return source1;
    }
}
