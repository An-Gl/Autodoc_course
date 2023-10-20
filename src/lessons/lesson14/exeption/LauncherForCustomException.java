package lessons.lesson14.exeption;

public class LauncherForCustomException {
    public static void main(String[] args) throws CustomException {
       // compute(12);
        try {
            compute2(15);
        } catch (CustomException e) {
            System.err.println(e);
        }
    }

    public static void compute(int num) throws CustomException {
        System.out.println("Вызван метод compute");

        if( num > 10) {
            throw new CustomException(num, "Some message about exception");
        }
        System.out.println("Нормальное завершение метода");
    }

    public static void compute2(int num) throws CustomException {
        System.out.println("Вызван метод compute");

        if( num > 10) {
            throw new CustomException(num, "Some message about exception");
        }
        System.out.println("Нормальное завершение метода");
    }
}
