package javaInEasyStepsExamples;

/**
 * Created by robert.chisholm on 27/04/2015.
 */
public class While {
    public static void main(String[] args) {
//        int i = 1;
//        while (i < 4) {
//            System.out.println("Outer Loop i=" + i);
//            i++;
//        }

        int num = 100;
        while (num > 0)

        {
            System.out.println("While Countdown: " + num);
            num -= 10;
        }

    }
}