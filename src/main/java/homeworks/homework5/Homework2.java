package homeworks.homework5;

public class Homework2 {
    public static void main(String[] args) {
        char[][] charArray = new char[3][5];
        printCharArray(charArray, '*');
    }
    public static void printCharArray(char[][] charArray, char symbol) {
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray[i].length; j++) {
                charArray[i][j] = symbol;
                System.out.print(" " + charArray[i][j] + " ");
            }
            System.out.println();
        }
    }

//    public static void charArray2(int rows, int columns, char symbol) {
//        char[][] charArray = new char[rows][columns];
//        for (char[] row : charArray) {
//            for (char element : row) {
//                element = symbol;
//                System.out.print(" " + element + " ");
//            }
//            System.out.println();
//        }
//    }
}
