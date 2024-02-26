package org.example.project;

import java.util.*;
import java.util.logging.Logger;
public class GroupAnagram {
  private static final Logger LOGGER = Logger.getLogger( GroupAnagram.class.getName() );
  public ArrayList<ArrayList<String>> execute(ArrayList<String> stringList) {
    HashMap<String, ArrayList> countMap = new HashMap();
    stringList.stream().forEach(str -> {
      ArrayList<Integer> charCountList = new ArrayList<Integer>(Collections.nCopies(26, 0));
      ArrayList<Character> charList = new ArrayList<>();

      for (char c : str.toCharArray()) {
        charList.add(c);
      }

      charList.stream().forEach((c) -> {
        int charIndex = (int) c - "a".codePointAt(0);
        charCountList.set(charIndex, charCountList.get(charIndex) + 1);
      });
      String charCountString = charCountList.toString();
      if (countMap.get(charCountString) == null) {
        countMap.put(charCountString, new ArrayList(List.of(str)));
      } else {
        ArrayList arr = countMap.get(charCountString);
        arr.add(str);
        countMap.put(charCountString, arr);
      }
    });

    LOGGER.info(countMap.toString());

    return new ArrayList(countMap.values());
  }
}
