package web.model;

public class Car {

    String model;
    String Driver;
    int number;


    public Car(String model, String driver, int number) {
        this.model = model;
        Driver = driver;
        this.number = number;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String driver) {
        Driver = driver;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
