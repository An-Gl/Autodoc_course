package lessons.lesson9.incapsulation.cars;

public class Opel {
    private String fuel;
    private String model;

    public void setFuel(String fuel){
        this.fuel = fuel;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public String getModel() {
        return model;
    }

    private void showModel(){
        System.out.println("Our model" + this.model);
    }
    public void showAllInfo() {
        System.out.println("Fuel of Skoda " + fuel);
        showModel();
    }
}

