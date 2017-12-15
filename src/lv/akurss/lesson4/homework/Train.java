package lv.akurss.lesson4.homework;

public class Train extends PublicTransport{

    public Train(int passengerCount, int carriageCount) {
        super(passengerCount);
        this.carriageCount = carriageCount;
    }

    public int getCarriageCount() {
        return carriageCount;
    }

    public void setCarriageCount(int carriageCount) {
        this.carriageCount = carriageCount;
    }

    private int carriageCount;
    public Train(int passengerCount) {
        super(passengerCount);
    }
    @Override
    public int getPassengerCount(){
        return (super.getPassengerCount() * carriageCount);
    }
}
