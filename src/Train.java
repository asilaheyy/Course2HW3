public class Train extends Transport {
    private int ticketCost;
    private float journeyTime;
    private String departureStation;
    private String arrivalStation;
    private int vagons;

    public Train(String brand,
                 String model,
                 int year,
                 String country,
                 int maxSpeed,
                 int ticketCost,
                 float journeyTime,
                 String departureStation,
                 String arrivalStation,
                 int vagons){
        super(brand,model,year,country,maxSpeed);
        setTicketCost(ticketCost);
        setJourneyTime(journeyTime);
        setDepartureStation(departureStation);
        setArrivalStation(arrivalStation);
        setVagons(vagons);

    }

    public int getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(int ticketCost) {
        if (ticketCost < 0) {
            this.ticketCost = 0;
        } else {
            this.ticketCost = ticketCost;
        }
    }

    public float getJourneyTime() {
        return journeyTime;
    }

    public void setJourneyTime(float journeyTime) {
        if (journeyTime <= 0) {
            this.journeyTime = 0;
        } else {
            this.journeyTime = journeyTime;
        }
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        if (departureStation == null || departureStation.isBlank()) {
            this.departureStation = "default";
        } else {
            this.departureStation = departureStation;
        }
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        if (arrivalStation == null || arrivalStation.isBlank()) {
            this.arrivalStation = "default";
        } else {
            this.arrivalStation = arrivalStation;
        }
    }

    public int getVagons() {
        return vagons;
    }

    public void setVagons(int vagons) {
        if (vagons <= 0) {
            this.vagons = 0;
        } else {
            this.vagons = vagons;
        }
    }
    public String toString(){
        return "Поезд "+getBrand()+", " +
                "модель "+getModel()+", "+getYear() +
                " год выпуска. Страна производства "+getCountry()+
                ", максимальная скорость передвижения — "+getMaxSpeed()+" км/ч."+
                " Отходит от станции "+getDepartureStation()+
                " и следует до станции "+getArrivalStation()+
                ". Время пути "+getJourneyTime()+
                ". Цена поездки — "+getTicketCost()+
                " рублей, в поезде "+getVagons()+
                " вагонов.";
    }

    @Override
    public void refill() {
        System.out.println("Заправиться дизелем.");
    }
}
