package edu.cnm.deepdive;

import java.util.LinkedList;

public class Main {

  public static void main(String[] args) {
    // should return true
    System.out.println(checkForPalindrome("abccba"));
    // should return true
    System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
    // should return true
    System.out.println(checkForPalindrome("I did, did I?"));
    // should return false
    System.out.println(checkForPalindrome("hello"));
    // should return true
    System.out.println(checkForPalindrome("Don't nod"));
  }

  public static boolean checkForPalindrome(String string) {
// we can use stack (LIFO) and queue (FIFO) and compare them since popping from a stack gives us the
// last item and queue gives us the first one. Perfect to check palindromes.

    LinkedList<Character> stack = new LinkedList<>();
    LinkedList<Character> queue = new LinkedList<>();
    String lowerCase = string.toLowerCase();

    for (int i = 0;i < lowerCase.length(); i++) {
      char c = lowerCase.charAt(i);
      if (c >= 'a' && c <= 'z') {
        queue.addLast(c);
        stack.push(c);
      }

    }

    while (!stack.isEmpty()) {
      if (!stack.pop().equals(queue.removeFirst())) {
        return false;
      }
    }

    return true;
  }

}
