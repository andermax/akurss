package lv.akurss.lesson5.homework.homework;

public class KengaragsRoutePlanner implements RoutePlanner {
    private String from;
    private String to;
    //private int totalPassengers;

    public KengaragsRoutePlanner(String from, String to) {
        this.from = from;
        this.to = to;
        this.totalPassengers = totalPassengers;
    }

    private int totalPassengers;

    @Override
    public void addToRoute(PublicTransport publicTransport) {
        this.totalPassengers = this.totalPassengers + publicTransport.getPassengerCount();
    }

    @Override
    public void printTotal() {
        System.out.println("from: "+this.from);
        System.out.println("to: "+this.to);
        System.out.println("Total passengers: "+this.totalPassengers * 1.2);
    }
}
