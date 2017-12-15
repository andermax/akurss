package lv.akurss.lesson6.homework;

public class PublicTransport {
    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    private int passengerCount;


    public PublicTransport(int passengerCount) {
        this.passengerCount = passengerCount;
    }
}
