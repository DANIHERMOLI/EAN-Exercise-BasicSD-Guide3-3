package com.company;

public class Dog {
    private String dogName;
    private String dogRace;
    private String dogLocation;
    private String ownersID;
    private String ownersName;
    private String contactNumber;
    private String assistanceDay;

    public Dog() {
        this("default name", "no race", "no location",
                "no owner", "no owner name", "no contact number", "no day");
    }

    public Dog(String dogName, String dogRace, String dogLocation, String ownersID,
               String ownersName, String contactNumber, String assistanceDay) {
        this.dogName = dogName;
        this.dogRace = dogRace;
        this.dogLocation = dogLocation;
        this.ownersID = ownersID;
        this.ownersName = ownersName;
        this.contactNumber = contactNumber;
        this.assistanceDay = assistanceDay;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogRace() {
        return dogRace;
    }

    public void setDogRace(String dogRace) {
        this.dogRace = dogRace;
    }

    public String getDogLocation() {
        return dogLocation;
    }

    public void setDogLocation(String dogLocation) {
        this.dogLocation = dogLocation;
    }

    public String getOwnersID() {
        return ownersID;
    }

    public void setOwnersID(String ownersID) {
        this.ownersID = ownersID;
    }

    public String getOwnersName() {
        return ownersName;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAssistanceDay() {
        return assistanceDay;
    }

    public void setAssistanceDay(String assistanceDay) {
        this.assistanceDay = assistanceDay;
    }

    @Override
    public String toString() {
        return ("Dog's Name: " + this.dogName + "\n" +
        "Dog's Race: " + this.dogRace + "\n" +
        "Dog's Location: " + this.dogLocation + "\n" +
        "Owner's ID: " + this.ownersID + "\n" +
        "Owner's Name: " + this.ownersName + "\n" +
        "Contact Number: " + this.contactNumber + "\n" +
        "Day of Assistance: " + this.assistanceDay);
    }
}
