package lessons.lesson19.testSuiteExample;

import org.testng.annotations.Test;

public class Second {

    @Test
    public void testFromSecondClass() {
        System.out.println("first test from second class. Test running in thread " + Thread.currentThread().getId());
    }
}
