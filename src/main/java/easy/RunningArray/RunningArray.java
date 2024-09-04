package easy.RunningArray;

public class RunningArray {

    public int[] runningSum(int[] nums) {

        // Grab the first int and add to the next store in an array. Add the sum to the nesxt and store
        //same lngth array
        int[] runningSum = nums.clone();

        for(int i = 0; i < nums.length; i++){

            if(i != 0){
                runningSum[i] = runningSum[i-1] + nums[i];

            }

        }
        return runningSum;
    }
}
