package io.github.dgahn.algorithm.programmers.level2.top;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class SolutionTest {

  @Test
  @DisplayName("caseOne")
  void caseOne() {
    int[] heights = {6, 9, 5, 7, 4};
    int[] expect = {0,0,2,2,4};

    Solution solution = new Solution();
    int[] answer = solution.solution(heights);

    assertThat(answer).isEqualTo(expect);
  }

}
