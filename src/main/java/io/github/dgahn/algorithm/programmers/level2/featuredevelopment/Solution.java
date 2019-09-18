package io.github.dgahn.algorithm.programmers.level2.featuredevelopment;

import java.util.Arrays;


class Solution {

  public int[] solution(int[] progresses, int[] speeds) {
    int[] answer = new int[100];

    int j = 0;
    for (int i = 1; ; i++) {
      if (100 - progresses[j] < i * speeds[j]) {
        j++;
        answer[i--]++;
        if (j >= progresses.length) {
          break;
        }
      }
    }

    return Arrays.stream(answer).filter(i -> i!=0).toArray();
  }

}
