package myExamples;

import java.util.*;
/**
 * Created by robert.chisholm on 27/04/2015.
 */
public class Lotto2 {

    public static void main(String[] args) {

        int [] arr = new int[6];

//        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48};
        for (int i = 0; i < 6; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(48);

            arr[i] = randomNumber;
//            System.out.println("i= "+i);

//            if (i==5){
//            System.out.println(randomNumber+"");
//            }
//            else
//            System.out.println(randomNumber+" , ");
        }
        for (int i = 0; i < 6; i++) {

            System.out.println(arr[i]+"Array");
        }

    }

}

