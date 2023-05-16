import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldNumStat() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.stationNumber();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    //станция
    @Test
    public void shouldNumbStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.stationNumber();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    // номер станции
    @Test
    public void shouldNumberStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.stationNumber();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    // номер станции граничный
    @Test
    public void shouldStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.stationNumber();
        int expected = 10;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    // следущая станция
    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    // станция с 9-0
    @Test
    public void shouldNextStat() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    // предыдущая станция
    @Test
    public void shouldPastStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.pastStation();
        int expected = 4;
        int actuale = radio.getCurrentStation();
        assertEquals(expected, actuale);
    }

    // станция с 0-9
    @Test
    public void shouldPastStat() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.pastStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    // звук следущая станция
    @Test
    public void shouldVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.volume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    // граничная мах звука
    @Test
    public void shouldVol() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.volume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    // граничная мин звук
    @Test
    public void shouldVolumee() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.volume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldPastVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.pastVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldPastVolum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.pastVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}





