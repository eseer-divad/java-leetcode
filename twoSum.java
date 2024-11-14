import java.util.HashMap;

class twoSum {
    // mine
    public int[] patheticSolution(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[j] == (target - nums[i])) {
                    // return a new array
                    return new int[] {j, i};
                }
            }
        }
        // in java, all paths of non-void method must return value
        throw new IllegalArgumentException("No solution.");
    }

    // chatGPT 4o
        public int[] chadSolution(int[] nums, int target) {
        // Create a HashMap to store the numbers and their indices
        HashMap<Integer, Integer> numToIndex = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (numToIndex.containsKey(complement)) {
                // If found, return the indices
                return new int[] {numToIndex.get(complement), i};
            }

            // Otherwise, store the current number with its index in the map
            numToIndex.put(nums[i], i);
        }

        // If no solution is found, throw an exception
        throw new IllegalArgumentException("No solution.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of the twoSum class
        twoSum solver = new twoSum();

        // Test input
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Use patheticSolution
        try {
            int[] result1 = solver.patheticSolution(nums, target);
            System.out.println("Pathetic Solution Indices: [" + result1[0] + ", " + result1[1] + "]");
        } catch (IllegalArgumentException e) {
            System.out.println("Pathetic Solution: " + e.getMessage());
        }

        // Use chadSolution
        try {
            int[] result2 = solver.chadSolution(nums, target);
            System.out.println("Chad Solution Indices: [" + result2[0] + ", " + result2[1] + "]");
        } catch (IllegalArgumentException e) {
            System.out.println("Chad Solution: " + e.getMessage());
        }
    }
}