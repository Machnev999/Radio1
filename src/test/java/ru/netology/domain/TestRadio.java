package ru.netology.domain;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRadio {

    Radio rad = new Radio();


    @Test
    public void increaseRadioStation() {

        rad.setCurrentRadioStation(7);
        rad.increaseRadioStation();
        assertEquals(8, rad.getCurrentRadioStation());
    }

    @Test
    public void overIncreaseMaxRadioStation() {

        rad.setCurrentRadioStation(9);
        rad.increaseRadioStation();
        assertEquals(0, rad.getCurrentRadioStation());
    }


    
    @Test
    public void reduceRadioStation() {
        rad.setCurrentRadioStation(7);
        rad.reduceRadioStation();
        assertEquals(6, rad.getCurrentRadioStation());
    }

    @Test
    public void overReduceMinRadioStation() {
        rad.setCurrentRadioStation(0);
        rad.reduceRadioStation();
        assertEquals(9, rad.getCurrentRadioStation());
    }





    
    @Test
    public void increaseVolume() {

        rad.setCurrentVolume(5);
        rad.increaseVolume();
        assertEquals(6, rad.getCurrentVolume());
    }

    @Test
    public void increaseMaxVolume() {

        rad.setCurrentVolume(10);
        rad.increaseVolume();
        assertEquals(10, rad.getCurrentVolume());
    }




    
    @Test
    public void reduceVolume() {

        rad.setCurrentVolume(6);
        rad.reduceVolume();
        assertEquals(5, rad.getCurrentVolume());
    }

    @Test
    public void reduceMinVolume() {

        rad.setCurrentVolume(0);
        rad.reduceVolume();
        assertEquals(0, rad.getCurrentVolume());
    }




}
