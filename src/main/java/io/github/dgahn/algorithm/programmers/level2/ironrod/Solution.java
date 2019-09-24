package io.github.dgahn.algorithm.programmers.level2.ironrod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;


class Solution {

  public int solution(String arrangement) {
    int answer = 0;
    List<Integer> laserIndex = new ArrayList<>();

    while (arrangement.contains("()")) {
      laserIndex.add(arrangement.indexOf("()"));
      arrangement = arrangement.replaceFirst("\\(\\)", "  ");
    }

    Map<Integer, Integer> map = new HashMap<>();
    int start = arrangement.length();
    int end = arrangement.length();
    for (int i = start - 1; i >= 0; i--) {
      if (arrangement.charAt(i) == '(') {
        start = i;
        for (int j = end - 1; j >= 0; j--) {
          if (arrangement.charAt(j) == ')') {
            end = j;
            break;
          }
        }
        map.put(start, end);
      }
    }

    for (int e : map.keySet()) {
      int num = 0;
      for (int a : laserIndex) {
        if (e < a && map.get(e) > a) {
          num++;
        }
      }
      if (num != 0) {
        answer = answer + num + 1;
      }

    }
    return answer;
  }
  public int bestAnswer(String arrangement) {
    int answer = 0;
    Stack<Integer> st = new Stack<>();
    for (int i = 0; i < arrangement.length(); i++) {
      if (arrangement.charAt(i) == '(') {
        st.push(i);
      } else if (arrangement.charAt(i) == ')') {
        if (st.peek() + 1 == i) {
          st.pop();
          answer += st.size();
        } else {
          st.pop();
          answer += 1;
        }
      }
    }
    return answer;
  }

}
