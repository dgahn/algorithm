package io.github.dgahn.algorithm.getcentercharacter;

class Solution {

  public String solution(String s) {
    String answer = "";

    int centerIndex = s.length() / 2;
    if (s.length() % 2 == 0) {
      answer = s.substring(centerIndex - 1, centerIndex + 1);
    } else {
      answer = s.substring(centerIndex, centerIndex + 1);
    }

    return answer;
  }

  public String bestAnswer(String s) {
    return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
  }

}
