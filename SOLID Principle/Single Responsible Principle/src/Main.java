import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final int THRESHOLD = 5;
    public static void main(String[] args) {

        System.out.println("Welcome to the Application!");


        List<Integer> nums =getInput();

        sort(nums);

        show(nums);
    }
    private static void show(List<Integer> nums) {
        for(int num : nums)
            System.out.print(num+" ");
    }

    private static void sort(List<Integer> nums) {
        Collections.sort(nums);
    }

    private static List<Integer> getInput() {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        while(nums.size() < THRESHOLD) {

            String s = scanner.nextLine();

            if(isValid(s)){
                nums.add(Integer.parseInt(s));
            }

        }
        scanner.close();
        return nums;
    }
    private static boolean isValid(String input){
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return false;
        }

        int num = Integer.parseInt(input);

        if(num<0 || num > 10) {
            System.out.println("Invalid range! Try again!");
            return false;
        }
        return true;
    }

}