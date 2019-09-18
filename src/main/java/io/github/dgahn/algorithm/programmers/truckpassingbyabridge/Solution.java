package io.github.dgahn.algorithm.programmers.truckpassingbyabridge;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


class Solution {

  class Truck {

    int move;
    int weight;

    Truck(final int weight) {
      this.weight = weight;
      this.move = 1;
    }

    void moving() {
      this.move++;
    }

  }

  public int solution(int bridge_length, int weight, int[] truck_weights) {
    int answer = 0;

    Queue<Truck> waitQ = new LinkedList<>();
    Queue<Truck> moveQ = new LinkedList<>();

    for (int w : truck_weights) {
      waitQ.offer(new Truck(w));
    }

    int currentWeight = 0;

    while (!waitQ.isEmpty() || !moveQ.isEmpty()) {
      answer++;



      if (moveQ.isEmpty()) {
        Truck t = waitQ.poll();
        currentWeight += t.weight;
        moveQ.offer(t);
        continue;
      }

      for (Truck t : moveQ) {
        t.moving();
      }

      if (moveQ.peek().move > bridge_length) {
        Truck t = moveQ.poll();
        currentWeight -= t.weight;
      }

      if (!waitQ.isEmpty() && currentWeight + waitQ.peek().weight <= weight) {
        Truck t = waitQ.poll();
        currentWeight += t.weight;
        moveQ.offer(t);
      }

    }

    return answer;
  }

}
