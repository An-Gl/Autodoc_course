package homeworks.homework12;
public class ArrayWithAddedNum {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int num = 9;
        int[] newArr = addingNumberToArray(arr, num);
        for (int i : newArr) {
            System.out.print(i + " ");
        } //проверка, вывести в консоль все значения нового массива
    }
    public static int[] addingNumberToArray(int[] arr, int num){
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = num;
        return newArr;
    }
}
