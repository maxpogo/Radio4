public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    //Станции
    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void stationNumber() {
        if (currentStation >= 9) {
            currentStation++;

        }

    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void pastStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }

    }

    public void volume() {
        if (currentVolume > 0) {
            currentVolume++;
        }
    }

    public void pastVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }


}
