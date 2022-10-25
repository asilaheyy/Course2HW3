public class Bus extends Transport {


    public Bus(String brand, String model, int year, String country, int maxSpeed) {
        super(brand, model, year, country, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Заправиться бензином или дизелем на заправке.");
    }

    public String toString(){
        return "Автобус "+getBrand()+", " +
                "модель "+getModel()+", "+getYear() +
                " год выпуска. Страна производства "+getCountry()+
                ", максимальная скорость передвижения — "+getMaxSpeed()+" км/ч.";
    }
}
