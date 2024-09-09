package easy.majority_element;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> occurrences = new HashMap<>();

        for(int num: nums){
            occurrences.put(num, occurrences.getOrDefault(num, 0 ) +1);
        }

        return Collections.max(occurrences.entrySet(), Map.Entry.comparingByValue()).getKey();
    }


    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();

        int[] test = {1,1,2,2,3,1};

        majorityElement.majorityElement(test);
    }
}
