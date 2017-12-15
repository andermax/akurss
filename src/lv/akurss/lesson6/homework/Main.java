package lv.akurss.lesson6.homework;

public class Main {
    public static void main(String[] args) {

        Bus bus = new Bus(50);

        Trolleybus trolleybus = new Trolleybus(70);

        Train train = new Train(200, 5);


        RoutePlanner routePlanner = new KengaragsRoutePlanner("Riga", "Kengarags");
        routePlanner.addToRoute(bus);
        routePlanner.addToRoute(trolleybus);
        routePlanner.addToRoute(train);

        routePlanner.printTotal();

    }
}


//8. В методе `main` создать 1 `Bus` с 50 пассажирами,
// 1 `Trolleybus` с 70 пассажирами и
// один `Train` с 100 пассажирами
// 9. В методе `main` создать RoutePlanner для маршрута
// `from`: Riga,
// `to`: Salaspils и
// добавить к маршруту (`addToRoute`) ранее созданные автобус, троллейбус и поезд
// 10. Распечатать (`printTotal`) информацию о маршруте