package easy;


import easy.merge_sorted_array.MergeSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class EasyTestCases {


@Test
 void testMergeSortedArray(){

    int[] nums1 = {1,2,3,0,0,0};
    int m = 3;
    int[] nums2 = {2,5,6};
    int n = 3;
    int[] result = {1,2,2,3,5,6};
    MergeSortedArray mergeSortedArray = new MergeSortedArray();

    mergeSortedArray.merge(nums1, m, nums2, n);
    assertArrayEquals(nums1, result);

 }






}
