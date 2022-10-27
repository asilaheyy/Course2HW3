public class Main {
    public static void main(String[] args) {
        Train lastochka = new Train("Ласточка",
                "B-901",
                2011,
                "Россия",
                301,
                3500,
                0f,
                "Белорусский вокзал",
                "Минск-Пассажирский",
                11);
        Train leningrad = new Train("Ленинград",
                "D-125",
                2019,
                "Россия",
                270,
                1700,
                0f,
                "Ленинградский вокзал",
                "Ленинград-пассажирский",
                8);
        System.out.println(lastochka);
        System.out.println(leningrad);

        Bus bus1 = new Bus("Mercedes",
                "AA",
                2017,
                "Germany",
                140);
        System.out.println(bus1);

        Bus bus2 = new Bus("Opel",
                "BB",
                2012,
                "Germany",
                130);
        System.out.println(bus2);

        Bus bus3 = new Bus("Toyota",
                "CC",
                2015,
                "Japan",
                130);
        System.out.println(bus3);

        lastochka.refill();
        bus2.refill();
    }
}