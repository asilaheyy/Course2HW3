public abstract class Transport {
    private String brand;
    private String model;
    private int year;
    private String country;
    private String colour;
    private int maxSpeed;

    public Transport(String brand,
                     String model,
                     int year,
                     String country,
                     int maxSpeed) {
        setBrand(brand);
        setModel(model);
        setYear(year);
        setCountry(country);
        setMaxSpeed(maxSpeed);
    }
    public abstract void refill();

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year <=0){
            this.year = 0;
        }else{
            this.year = year;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(country == null || country.isBlank()){
            this.country = "default";
        }else{
            this.country = country;
        }
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        if (colour == null || colour.isBlank()) {
            this.colour = "default";
        } else {
            this.colour = colour;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed <=0){
            this.maxSpeed = 0;
        }else{
            this.maxSpeed = maxSpeed;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }
}
