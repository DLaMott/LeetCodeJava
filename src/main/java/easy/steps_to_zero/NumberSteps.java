package easy.steps_to_zero;

public class NumberSteps {



    /***
     * Example 1:
     *
     * Input: num = 14
     * Output: 6
     * Explanation:
     * Step 1) 14 is even; divide by 2 and obtain 7.
     * Step 2) 7 is odd; subtract 1 and obtain 6.
     * Step 3) 6 is even; divide by 2 and obtain 3.
     * Step 4) 3 is odd; subtract 1 and obtain 2.
     * Step 5) 2 is even; divide by 2 and obtain 1.
     * Step 6) 1 is odd; subtract 1 and obtain 0.
     * ***/
    public int numberOfSteps(int num) {

        int steps = 0;
        int even = 0;
        int odd = 0;

        if(num == 0){
            return steps;
        }

        while (num != 0){

            if (num % 2 == 0){
                even = num / 2;
                num = even;
                steps++;
            }else {
                odd = num - 1;
                num = odd;
                steps++;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        NumberSteps numberSteps = new NumberSteps();

        System.out.println(numberSteps.numberOfSteps(14));
        System.out.println(numberSteps.numberOfSteps(123));
    }
}
