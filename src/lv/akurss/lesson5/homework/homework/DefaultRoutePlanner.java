package lv.akurss.lesson5.homework.homework;

import lv.akurss.lesson5.lecture.interface_use_case.ActionListener;

public class DefaultRoutePlanner implements RoutePlanner{
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
    public DefaultRoutePlanner(String from, String to) {
        this.from = from;
        this.to = to;
        this.totalPassengers = totalPassengers;

    }
//--------------------------------------------------------------------------

@Override
    public void addToRoute(PublicTransport publicTransport){ // куда можно будет подавать экземпляры `PublicTransport`
        this.totalPassengers = this.totalPassengers + publicTransport.getPassengerCount();
    }


@Override
    public void printTotal(){
        System.out.println("from: "+this.from);
        System.out.println("to: "+this.to);
        System.out.println("Total passengers: "+this.totalPassengers);
    }
}


//2. Переименовать `RoutePlanner` в `DefaultRoutePlanner` (помним, что имя класса должно совпадать с именем файла)