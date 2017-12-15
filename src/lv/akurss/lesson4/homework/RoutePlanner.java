package lv.akurss.lesson4.homework;

public class RoutePlanner {
    private String from;
    private String to;
    private int totalPassengers;


// get set --------------------------------
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }

    public void setTotalPassengers(int totalPassengers) {
        this.totalPassengers = totalPassengers;
    }


// constructor -----------------------------------------------------------
    public RoutePlanner(String from, String to) {
        this.from = from;
        this.to = to;
        this.totalPassengers = totalPassengers;

    }
//--------------------------------------------------------------------------
//5. В класс `RoutePlanner` добавить метод `addToRoute`,
// куда можно будет подавать экземпляры `PublicTransport`
// и внутри этого метода к полю `totalPassengers`
// будет прибавляться значение `passengerCount` класса `PublicTransport`

    public void addToRoute(PublicTransport publicTransport){ // куда можно будет подавать экземпляры `PublicTransport`
        this.totalPassengers = this.totalPassengers + publicTransport.getPassengerCount();
    }

  //7. В класс `RoutePlanner` добавить метод `printTotal`,
    // который будет распечатывать информация о маршруте (`from`, `to`)
    // и количество пассажиров (`totalPassengers`),
    // которое может проехать по этому маршруту

    public void printTotal(){
        System.out.println("from: "+this.from);
        System.out.println("to: "+this.to);
        System.out.println("Total passengers: "+this.totalPassengers);
    }
}


