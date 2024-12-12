package org.example.algorithm;

public class SelectionSort extends Algorithm {

    public SelectionSort(int[] nums) {
        super(nums);
    }

    @Override
    protected void initialize() {
        System.out.println("Initializing selection sort");
    }

    @Override
    protected void sorting() {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(i, minIndex);
            }
        }
    }

    @Override
    protected void showResult() {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] +" ");
        }
    }
}
