package io.github.dgahn.algorithm.programmers.level2.printer;

import java.util.LinkedList;
import java.util.Queue;


class Solution {

  public int solution(int[] priorities, int location) {
    int answer = 0;

    Queue<Priority> priorityQ = new LinkedList<>();
    for (int i = 0; i < priorities.length; i++) {
      priorityQ.offer(new Priority(i, priorities[i]));
    }

    while (!priorityQ.isEmpty()) {
      int temp = priorityQ.peek().index;
      for (final Priority priority : priorityQ) {
        if (priorityQ.peek().priority < priority.priority) {
          priorityQ.offer(priorityQ.poll());
          break;
        }
      }
      if (temp == priorityQ.peek().index) {
        answer++;
        if(priorityQ.poll().index == location) {
          break;
        }
      }
    }

    return answer;
  }

  static class Priority {

    int index;
    int priority;

    Priority(final int index, final int priority) {
      this.index = index;
      this.priority = priority;
    }

  }

}
