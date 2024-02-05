package org.example.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.

You can return the answer in any order.
 */

public class TwoSum {
  private static final Logger LOGGER = Logger.getLogger( TwoSum.class.getName() );
  public ArrayList<Integer> check(ArrayList<Integer> numList, Integer target) {
    HashMap<Integer, Integer> matches = new HashMap<>();
    Integer index = 0;
    for (Integer num : numList) {
      Integer matchingNum = target - num;
      LOGGER.info(String.valueOf(matches.containsKey(num)));
      if (matches.containsKey(num)) {
        return new ArrayList<>(List.of(matches.get(num), index));
      } else {
        matches.put(matchingNum, index);
      }
      index++;
    }
    return new ArrayList<>();
  }
}
