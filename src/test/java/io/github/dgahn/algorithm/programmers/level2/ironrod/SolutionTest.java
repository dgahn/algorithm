package io.github.dgahn.algorithm.programmers.level2.ironrod;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class SolutionTest {

  @Test
  @DisplayName("case one")
  void caseOne() {
    String arrangement = "()(((()())(())()))(())";
    int expect = 17;

    Solution solution = new Solution();
    int actual = solution.solution(arrangement);

    assertThat(actual).isEqualTo(expect);
  }

}
