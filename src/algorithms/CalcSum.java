package algorithms;

import java.util.HashMap;

/**
 *  Given a target number and list of numbers return true if at least
 *  there is one combination of numbers whose sums is equal to target number
 */
public class CalcSum {

    boolean found;
    HashMap<Integer, Boolean> memoization;

    public CalcSum(int targetSum, int[] nums) {

        memoization = new HashMap<>();
        this.found = check(targetSum, nums);
    }

    private boolean check(int targetSum, int[] nums) {

        if(targetSum == 0) return true;
        if(targetSum < 0) return false;
        if(memoization.get(targetSum) != null) return memoization.get(targetSum);
        for(int num : nums) {

            if(check(targetSum - num, nums)) {

                memoization.put(targetSum - num, true);
                return true;
            }
        }

        memoization.put(targetSum, false);
        return false;
    }

    public boolean isFound() {

        return found;
    }
}
