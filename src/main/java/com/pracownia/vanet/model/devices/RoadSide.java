package com.pracownia.vanet.model.devices;

import com.pracownia.vanet.model.Point;
import com.pracownia.vanet.model.event.Event;
import com.pracownia.vanet.model.network.Network;

public class RoadSide extends Device {

    /*------------------------ FIELDS REGION ------------------------*/
    private final static double TRUST_LEVEL_INCREASE = 0.1;
    private final static double TRUST_LEVEL_DECREASE = 0.4;

    /*------------------------ METHODS REGION ------------------------*/
    public RoadSide(int id, Point currentLocation, double range) {
        super(id, currentLocation, range);
    }

    @Override
    public void move() {
        //EMPTY
    }

    @Override
    public void send(Network dynamicNetwork) {

    }

    @Override
    public Event transfer(Event event, Device receivedFrom) {
        return null;
    }

    @Override
    public void receive(Event event) {

    }
}
    