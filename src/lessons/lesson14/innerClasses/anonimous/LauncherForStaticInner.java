package lessons.lesson14.innerClasses.anonimous;

public class LauncherForStaticInner {
    public static void main(String[] args) {
        OuterCarStatic.InnerClassElectric innerClassElectric = new OuterCarStatic.InnerClassElectric();
        innerClassElectric.turnOnIgnition();

        OuterCarStatic.InnerClassEngine innerClassEngine = new OuterCarStatic.InnerClassEngine();
        innerClassEngine.startEngine();
    }
}
