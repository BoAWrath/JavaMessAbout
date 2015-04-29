package javaInEasyStepsExamples;

/**
 * Created by robert.chisholm on 27/04/2015.
 */
public class DoWhile {
    public static void main(String[] args) {
        int num = 100;
        do {
            System.out.println("DoWhile Countup: " + num );
        }
        while ( num < 0 );
           num = num+10  ;
        System.out.println("DoWhile Countup: " + num );
    }
}
