package lessons.lesson17.queue.sorting.comparator;

import java.util.Comparator;

public class CarComparatorByYear implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return Integer.compare(o1.getYear(), o2.getYear());
    }
}

