package lessons.lesson13.interfaceExample;

public interface IParts {

    int selectPart(int number);

    default double partsPrice(int number){
        return 33.33 * Math.random()* 0.5;
    }
}
