package homeworks.homework13;

public class LuckyNumberV2 {

//    Необходимо написать программу «Счастливое число».
//    Давайте представим, что у нас есть промежуток из 10 чисел, счастливым числом будет являться 3!
//    Нужно написать программу, которая ищет счастливое число!
//    Программа перебирает числа по одному, и когда доходит до 3-го числа — напишет "Вот счастливое число!" и выходит из цикла.
//    При разработке необходимо использовать цикл и условный оператор!

    public static void main(String[] args) {

        getLuckyNumber(new int[]{5, 10, 12, 9, 3, 6});
    }
   public static void getLuckyNumber(int[] array) {
       for(int i = 0; i < array.length; i++) {
           if (array[i] == 3) {
               System.out.println("\n" + "Вот счастливое число: " + array[i]);
               break;
           }
       }
   }
}
