package org.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

class ContainsDuplicateTests {

  @Test
  @DisplayName("check should return true if any value appears at least twice in the array")
  void returnTrueWithDuplicate() {
    ContainsDuplicate containsDuplicate = new ContainsDuplicate();
    assertEquals(true, containsDuplicate.check(new ArrayList<Integer>(List.of(1, 2, 3, 5, 3))), "[1, 2, 3, 5, 3] should return true");
  }

  @Test
  @DisplayName("check should return true if any value appears at least twice in the array")
  void returnFalseWithoutDuplicate() {
    ContainsDuplicate containsDuplicate = new ContainsDuplicate();
    assertEquals(false, containsDuplicate.check(new ArrayList<Integer>(List.of(1, 2, 3, 5, 8))), "[1, 2, 3, 5, 8] should return false");
  }
}