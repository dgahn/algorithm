package io.github.dgahn.algorithm.getcentercharacter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SolutionTest {

  @Test
  @DisplayName("s의 길이가 짝수일 경우 리턴 값의 길이가 2가 되는지 테스트")
  void givenEvenStringThenReturnLengthTwo() {
    Solution solution = new Solution();
    String answer = solution.solution("qwer");

    assertThat(answer.length()).isEqualTo(2);
    assertThat(answer).isEqualTo("we");
  }

  @Test
  @DisplayName("s의 길이가 홀수일 경우 리턴 값의 길이가 1가 되는지 테스트")
  void givenOddStringThenReturnLengthOne() {
    Solution solution = new Solution();
    String answer = solution.solution("abcde");

    assertThat(answer.length()).isOne();
    assertThat(answer).isEqualTo("c");
  }

}
