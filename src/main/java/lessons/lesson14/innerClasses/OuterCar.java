package lessons.lesson14.innerClasses;

public class OuterCar {
   public void beginOfTravel() {
       InnerClassElectric innerClassElectric = new InnerClassElectric();
       innerClassElectric.turnOnIgnition();

       InnerClassEngine innerClassEngine = new InnerClassEngine();
       innerClassEngine.startEngine();
   }
   private class InnerClassEngine {
        public  void startEngine() {
            System.out.println("Starting engine");
        }
    }
    private class InnerClassElectric {
       public void turnOnIgnition(){
           System.out.println("Turning on ignition");
       }
    }
}
