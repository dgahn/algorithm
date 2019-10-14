package io.github.dgahn.algorithm.backjoon.stack.flipword;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;


public class Solution {

  public static void main(String[] args) {
    final Solution solution = new Solution();
    final Scanner sc = new Scanner(System.in);
    final String input = sc.nextLine();

    solution.solution(input);
  }

  public void solution(final String input) {
    StringBuilder result = new StringBuilder();
    Stack<String> stack = new Stack<>();
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == ' ') {
        result.append(" ");
      } else if (input.charAt(i) == '<') {
        for (int j = i + 1; j < input.length(); j++) {
          if (input.charAt(j) == '>') {
            result.append(input, i, j + 1);
            i = j;
            break;
          }
        }
      } else {
        for (int j = i; j <= input.length(); j++) {
          if (j > input.length() - 1 || input.charAt(j) == ' ' || input.charAt(j) == '<') {
            while (!stack.empty()) {
              result.append(stack.pop());
            }
            i = j - 1;
            break;
          } else {
            stack.push(Character.toString(input.charAt(j)));
          }
        }

      }
    }
    System.out.println(result);
  }

  public void bestSolution(final String input) {
    Stack<Character> stack = new Stack<>();
    boolean isStartedTag = false;

    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      if (c == '<') {
        print(stack);
        System.out.print(c);
        isStartedTag = true;
      } else if (c == '>') {
        System.out.print(c);
        isStartedTag = false;
      } else if (isStartedTag) {
        System.out.print(c);
      } else {
        if (c == ' ') {
          print(stack);
          System.out.print(c);
        } else {
          stack.push(c);
        }
      }
    }
    print(stack);

  }

  public void print(final Stack<Character> stack) {
    while (!stack.isEmpty()) {
      System.out.print(stack.pop());
    }
  }

}
