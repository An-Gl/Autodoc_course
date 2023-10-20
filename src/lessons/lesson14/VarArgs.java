package lessons.lesson14;

public class VarArgs {
    public static void main(String[] args) {
        int result = addAll(5, 5, 5);
        System.out.println(result);
        int result2 = addAllVarArgs(3, 4, 5, 7, 9);
        System.out.println(result2);

    }
    public static int addAll(int firstNum, int secondNum, int thirdNum) {
        return firstNum + secondNum + thirdNum;
    }

    public static int addAllVarArgs(int ... numbers){
        int returnedSum = 0;
        for (int num: numbers) {
            returnedSum += num;
        }

        return returnedSum;
    }
}


