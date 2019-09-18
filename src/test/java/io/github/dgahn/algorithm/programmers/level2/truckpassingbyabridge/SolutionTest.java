package io.github.dgahn.algorithm.programmers.level2.truckpassingbyabridge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SolutionTest {

  @Test
  @DisplayName("case one")
  void caseOne() {
    int bridge_length = 2;
    int weight = 10;
    int[] truck_weights = {7,4,5,6};
    int expect = 8;

    Solution solution = new Solution();
    int actual = solution.solution(bridge_length, weight, truck_weights);

    assertThat(actual).isEqualTo(expect);
  }

}
