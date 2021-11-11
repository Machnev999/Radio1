package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private final int minRadioStation = 0;
    private final int maxRadioStation = 9;
    private int currentVolume;
    private final int minVolume = 0;
    private final int maxVolume = 10;


    public int getCurrentRadioStation() { 
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {

        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void increaseRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void reduceRadioStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }


    public void increaseVolume(){
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        else {
            currentVolume = maxVolume;
        }
    }


    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}

