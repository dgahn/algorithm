package io.github.dgahn.algorithm.programmers.level2.stockprices;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SolutionTest {

  @Test
  @DisplayName("case one")
  void caseOne() {
    int[] prices = {1, 2, 3, 2, 3};
    int[] expected = {4, 3, 1, 1, 0};

    Solution solution = new Solution();

    int[] actual = solution.solution(prices);

    assertThat(actual).isEqualTo(expected);
  }

}
