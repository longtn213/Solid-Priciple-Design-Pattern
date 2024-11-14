package org.example.interview;

public class InterviewQuestionProcessor {

//    This is a typical implementation of the loosely coupled system
//    This class knows nothing about the question and its type
//    THIS IS PURE ABSTRACTION
    public static void process(InterviewQuestions questions) {
        questions.execute();
    }
}
