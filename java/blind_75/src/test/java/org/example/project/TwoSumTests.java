package org.example.project;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TwoSumTests {
  @Test
  @DisplayName("check should return true if any value appears at least twice in the array")
  void returnIndicesOfTwoAdditives() {
    TwoSum twoSum = new TwoSum();
    assertEquals(new ArrayList<Integer>(List.of(0, 1)), twoSum.check(new ArrayList<Integer>(List.of(2, 7, 11, 15)), 9), "number list [2,7,11,15] and target 9 should return [0, 1]");
    assertEquals(new ArrayList<Integer>(List.of(1, 2)), twoSum.check(new ArrayList<Integer>(List.of(3, 2, 4)), 6), "number list [3, 2, 4] and target 6 should return [1, 2]");
    assertEquals(new ArrayList<Integer>(List.of(0, 1)), twoSum.check(new ArrayList<Integer>(List.of(3, 3)), 6), "number list [3, 3] and target 6 should return [0, 1]");
  }
}
