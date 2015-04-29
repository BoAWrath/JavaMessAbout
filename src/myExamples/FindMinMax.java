package myExamples;

public class FindMinMax {

    public static void main(String[] args) {
        int[] numbers = {5, 3, 1, 6, 10, 3, 2};

        int minNumber = findMin(numbers);
        int maxNumber = findMax(numbers);

        if (minNumber == 1) {
            System.out.println("correct");
        } else {
            System.out.println("Try again");
        }

        if (maxNumber == 10) {
            System.out.println("correct");
        } else {
            System.out.println("Try again");
        }
    }

    private static int findMin(int[] numbersInArray) {
        int minNumber = numbersInArray[0];
        for (int i = 1; i < numbersInArray.length; i++) {
            if (numbersInArray[i] < minNumber) {
                minNumber = numbersInArray[i];
                System.out.println(minNumber);
            }
        }
        return minNumber;
    }

    public static int findMax(int[] numbersInArray) {
        int maxNumber = numbersInArray[0];
        for (int i = 1; i < numbersInArray.length ; i++) {
            if (numbersInArray[i] > maxNumber) {
                maxNumber = numbersInArray[i];
               // System.out.println(maxNumber);
            }
        }
            return maxNumber;

    }

}