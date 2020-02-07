package com.mindera.school;

import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;
import java.util.List;
import com.mindera.school.Run;
/**
 * Used to calculate the Fibonacci sequence
 *
 * https://en.wikipedia.org/wiki/Fibonacci_number
 */
public class FibonacciCalculator{
    public String fibonacciSequence(final Integer n) {
         StringBuilder sequence = new StringBuilder();
         Integer number1 = 0;
         Integer number2 = 1;

         for(int i = 1; i < n; i++) {
             if(sequence.length() == 0) {
                 sequence.append(number1);
             }
                 if (sequence.length() >= 1) {
                    Integer tt = number2 + number1;
                    sequence.append(",").append(number2);
                    number1 = number2;
                    number2 = tt;
                 }
         }
         return sequence.toString();
    }

    public List<String> sequences(List<Integer> entries) throws InterruptedException {
        List<Run> listRun = new LinkedList<Run>();

        for(int i = 0; i < entries.size(); i++){
            listRun.add(new Run(entries.get(i)));
        }

        for (Run run : listRun) {
            run.run();
        }

        for (int i = 0; i < listRun.size() ; i++) {
            listRun.get(i).join(i);
        }


        return List.of(listRun.get(0).getSequence(),
                listRun.get(1).getSequence(),
                listRun.get(2).getSequence()) ;
    }


}
