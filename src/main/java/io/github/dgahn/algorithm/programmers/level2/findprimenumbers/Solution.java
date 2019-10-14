package io.github.dgahn.algorithm.programmers.level2.findprimenumbers;

import java.util.Arrays;


public class Solution {

  public int solution(String numbers) {
    int[] nums = new int[numbers.length()];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = Character.getNumericValue(numbers.charAt(i));
    }

    System.out.println(Arrays.toString(nums));

    return 0;
  }

}
