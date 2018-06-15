package com.rest.model;

import java.util.List;

public class PromotionalUpgrade  {


    private OperatingFlightInfo operatingFlightInfo;

    private String requestIdentifier;
    private String newClass;
    private PassengerDetails passengerDetails;




    public PassengerDetails getPassengerDetails() {
        return passengerDetails;
    }

    public void setPassengerDetails(PassengerDetails passengerDetails) {
        this.passengerDetails = passengerDetails;
    }

    public OperatingFlightInfo getOperatingFlightInfo() {
        return operatingFlightInfo;
    }

    public void setOperatingFlightInfo(OperatingFlightInfo operatingFlightInfo) {
        this.operatingFlightInfo = operatingFlightInfo;
    }


    public String getRequestIdentifier() {
        return requestIdentifier;
    }

    public void setRequestIdentifier(String requestIdentifier) {
        this.requestIdentifier = requestIdentifier;
    }

    public String getNewClass() {
        return newClass;
    }

    public void setNewClass(String newClass) {
        this.newClass = newClass;
    }
}
