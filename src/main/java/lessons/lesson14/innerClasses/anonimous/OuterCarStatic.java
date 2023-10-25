package lessons.lesson14.innerClasses.anonimous;

public class OuterCarStatic {

    static class InnerClassEngine {
        public  void startEngine() {
            System.out.println("Starting engine");
        }
    }
    static class InnerClassElectric {
        public void turnOnIgnition(){
            System.out.println("Turning on ignition");
        }
    }
}
