package lessons.lesson9.override;

public class Kitten extends Cat{

    @Override
    public void voice() {
        System.out.println("mew mew mew");
        super.voice();
    }
}
