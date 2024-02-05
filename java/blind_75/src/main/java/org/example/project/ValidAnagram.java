package org.example.project;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
  public Boolean check(String s1, String s2) {
    Map<Character, Integer> charCount = new HashMap<>();
    for (Character c : s1.toCharArray()) {
      if (charCount.containsKey(c)) {
        charCount.put(c, charCount.get(c) + 1);
      } else {
        charCount.put(c, 1);
      }
    }

    for (Character c : s2.toCharArray()) {
      if (!charCount.containsKey(c) || charCount.get(c) == 0) {
        return false;
      } else {
        charCount.put(c, charCount.get(c) - 1);
      }
    }

    return true;
  }
}
