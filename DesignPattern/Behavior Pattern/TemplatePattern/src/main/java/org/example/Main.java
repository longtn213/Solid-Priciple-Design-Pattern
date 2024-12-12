package org.example;

import org.example.sport.Football;
import org.example.sport.Sport;

public class Main {
    public static void main(String[] args) {
//        int [] nums = {1,-2,3,4,5,11,14,6,9};
//
//        Algorithm sorting = new SelectionSort(nums);
//        sorting.sort();

        Sport sport = new Football();
        sport.sort();
    }
}