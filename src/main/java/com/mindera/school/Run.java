package com.mindera.school;

public class Run extends Thread {
    private String sequence;
    private Integer sequenceLength;

    public Run(Integer sequenceLength) {
        this.sequenceLength = sequenceLength;
    }

    @Override
    public void run() {
        FibonacciCalculator fCalc = new FibonacciCalculator();
        sequence = fCalc.fibonacciSequence(sequenceLength);
    }

    public String getSequence() {
        return sequence;
    }
}
