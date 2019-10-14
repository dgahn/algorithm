package io.github.dgahn.algorithm.programmers.level2.findprimenumbers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SolutionTest {

  @Test
  @DisplayName("caseOne")
  void caseOne() {
    final String numbers = "17";
    Solution solution = new Solution();
    solution.solution(numbers);
  }

}
