package io.github.dgahn.algorithm.programmers.level2.printer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SolutionTest {

  @Test
  @DisplayName("caseOne")
  void caseOne() {
    int[] priorities = {2, 1, 3, 2};
    int location = 2;
    int expected = 1;

    Solution solution = new Solution();
    int actual = solution.solution(priorities, location);

    assertThat(actual).isEqualTo(expected);
  }

  @Test
  @DisplayName("caseTwo")
  void caseTwo() {
    int[] priorities = {1, 1, 9, 1, 1, 1};
    int location = 0;
    int expected = 5;

    Solution solution = new Solution();
    int actual = solution.solution(priorities, location);

    assertThat(actual).isEqualTo(expected);
  }

}
