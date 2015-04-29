package myExamples;

import java.util.Random;

/**
 * Created by robert.chisholm on 28/04/2015.
 */
public class Lotto4 {
    private int lottoBalls;
    private int lottoBallsToDraw;
    int [] numbers;

    public Lotto4(int lottoBalls, int lottoBallsToDraw) {
      this.lottoBallsToDraw=lottoBallsToDraw;
      this.lottoBalls=lottoBalls;
      this.numbers = new int[lottoBallsToDraw];
    }

    public static void main (String[] args ){
        Lotto4 lotto4 = new Lotto4(48,6);
        Lotto4 bonusBalls = new Lotto4(10,2);
        lotto4.generateNumbers();
        bonusBalls.generateNumbers();
        System.out.println("Lottery Results:");
        lotto4.printLottoNumbers();
        System.out.println("Bonus Balls:");
        bonusBalls.printLottoNumbers();
    }

    private int randomNumber(){
        Random random = new Random();
        int randomNumber = random.nextInt(lottoBalls-1)+1;
        return randomNumber;
    }

    private int [] generateNumbers(){
        int currentNumber = 0;

        while (currentNumber < lottoBallsToDraw){
            int randomNumber = randomNumber();
            if (checkUniqueNumber(randomNumber, numbers)) {
                numbers[currentNumber] = randomNumber;
                currentNumber++;
            }
        }
        return numbers;
    }

    private boolean checkUniqueNumber(int randomNumber, int [] numbersPicked ){
        for (int i = 0; i < lottoBallsToDraw; i++) {
            if (randomNumber == numbersPicked[i]){
                return false;
            }
        }
       return true;

    }
    private void printLottoNumbers() {
        for (int i = 0; i < lottoBallsToDraw; i++) {
            if (i == lottoBallsToDraw-1) {
                System.out.println("(" + (numbers[i] + ")"));
            } else

                System.out.print("(" + numbers[i] + ") ,");
        }
    }


}