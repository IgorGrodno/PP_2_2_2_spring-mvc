package web.models;

public class Car {
    private  int year;
    private String brand;
    private String model;

    public Car(){}

    public Car(int year,String brand,String model){
        this.setYear(year);
        this.setBrand(brand);
        this.setModel(model);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
