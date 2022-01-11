package ru.nethology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldAcceptRadioStationNumber() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(5);
        assertEquals(5, radio.getRadioStationNumber());

    }

    @Test
    public void shouldNotAcceptRadioStationNumber() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(10);
        assertEquals(0, radio.getRadioStationNumber());

    }

    @Test
    public void shouldNoAcceptRadioStationNumber() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(0);
        assertEquals(0, radio.getRadioStationNumber());

    }

    @Test
    public void shouldSwitchToNextStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(8);
        radio.nextStation();
        assertEquals(9, radio.getRadioStationNumber());

    }

    @Test
    public void shouldSwitchToNextStation1() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(1);
        radio.nextStation();
        assertEquals(2, radio.getRadioStationNumber());

    }

    @Test
    public void shouldSwitchToZeroStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);
        radio.nextStation();
        assertEquals(0, radio.getRadioStationNumber());

    }

    @Test
    public void shouldIncreaseTheVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());

    }

    @Test
    public void shouldLeadsNowhere() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());

    }

    @Test
    public void shouldDownVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void shouldNothingToHappen() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void shouldGoToThePreviousStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(1);
        radio.previousStation();
        assertEquals(0, radio.getRadioStationNumber());

    }

    @Test
    public void shouldGoToTheLastStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(0);
        radio.previousStation();
        assertEquals(9, radio.getRadioStationNumber());

    }


}