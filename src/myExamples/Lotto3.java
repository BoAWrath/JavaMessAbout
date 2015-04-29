package myExamples;

import java.util.*;

/**
 * Created by robert.chisholm on 27/04/2015.
 */
public class Lotto3 {
    public static void main ( String[] args) {

        Lotto3 lotto3 = new Lotto3();
        ArrayList<Integer> numbers = lotto3.calculateNumbers();
        System.out.print(numbers);

    }

    private int generateNumber(){
        int lottonumber = (int)(Math.round(Math.random()*48)+1);
        return lottonumber;
    }

    public ArrayList<Integer> calculateNumbers(){

        ArrayList<Integer> lottoResults = new ArrayList<Integer>();
        while (lottoResults.size() < 6){
            int number = generateNumber();
            //System.out.println(number + " This is a lotto number");
            if (!lottoResults.contains(number)){
                lottoResults.add(number);
            }
        }
        Collections.sort(lottoResults);

        return lottoResults;
    }
}
