package io.github.dgahn.algorithm.backjoon.stack.flipword;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class SolutionTest {

  @Test
  @DisplayName("caseOne")
  void caseOne() {
    final String input = "<bae> onl <ju>";
    Solution solution = new Solution();
    solution.bestSolution(input);
  }

  @Test
  @DisplayName("caseTwo")
  void caseTwo() {
    final String input = "baekjoon online judge";
    Solution solution = new Solution();
    solution.bestSolution(input);
  }

  @Test
  @DisplayName("caseThree")
  void caseThree() {
    final String input = "<open>gat<close>";
    Solution solution = new Solution();
    solution.bestSolution(input);
  }

}
