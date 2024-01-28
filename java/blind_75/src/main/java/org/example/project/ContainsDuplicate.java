package org.example.project;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContainsDuplicate {

  public Boolean check(List<Integer> numList) {
    Set<Integer> numSet = new HashSet<Integer>();
    for (Integer n : numList) {
      if (numSet.contains(n)) {
        return true;
      }
      numSet.add((n));
    }
    return false;
  }

}