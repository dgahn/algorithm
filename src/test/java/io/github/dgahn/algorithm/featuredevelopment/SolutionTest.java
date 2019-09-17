package io.github.dgahn.algorithm.featuredevelopment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SolutionTest {

  @Test
  @DisplayName("Test Case One")
  void caseOne() {
    int[] progresses = {93, 30, 55};
    int[] speeds = {1, 30, 5};
    int[] expect = {2, 1};

    Solution solution = new Solution();
    int[] answer = solution.solution(progresses, speeds);

    assertThat(answer.length).isEqualTo(2);
    assertThat(answer).isEqualTo(expect);
  }

}
