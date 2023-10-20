package lessons.lesson6;

public class ArrayReverse {
    public static void main(String[] args) {
    arrRev();
    }
    public static void arrRev(){
        String[] arr = {"каждый", "охотник", "желает", "занать", "где", "сидит", "фазан"};
        int arrLength = arr.length;
        String temp;
        //length/2; первый этап
        //a - i - 1; второй этап
        for (int i = 0; i < arrLength / 2;i++) { // три итерации
            temp = arr[arrLength - i - 1]; // temp = arr[6] = фазан
            arr[arrLength - i - 1] = arr[i];
            arr[i] = temp;
        }
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
