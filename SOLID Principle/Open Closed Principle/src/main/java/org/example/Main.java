package org.example;

import org.example.sort.InsertionSort;
import org.example.sort.SorterProcessor;

public class Main {
    public static void main(String[] args) {

//        InterviewQuestionProcessor.process(new ComputerScienceInterviewQuestion());
        SorterProcessor.process(new InsertionSort());
    }
}