package lessons.lesson9.incapsulation.cars;

public class Skoda {
    private String fuel = "petrol A95";
    private String model = "Octavia";

    private void aboutCar() {
        System.out.println("It's SKODA");
        showModel();
    }

    private void showModel(){
        System.out.println("Our model" + this.model);
    }
    public void showAllInfo() {
        System.out.println("Fuel of Skoda " + fuel);
        aboutCar();
    }
}

