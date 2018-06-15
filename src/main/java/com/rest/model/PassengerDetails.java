package com.rest.model;

import java.util.List;

public class PassengerDetails {

        private List<PassengerIdentification> passengerIdentification;

    public List<PassengerIdentification> getPassengerIdentification() {
        return passengerIdentification;
    }

    public void setPassengerIdentification(List<PassengerIdentification> passengerIdentification) {
        this.passengerIdentification = passengerIdentification;
    }
}
