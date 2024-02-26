package org.example.project;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagramTests {
  @Test
  @DisplayName("check should return true if any value appears at least twice in the array")
  void returnGroupedAnagrams() {
    GroupAnagram groupAnagram = new GroupAnagram();
    assertEquals(new ArrayList<ArrayList>(List.of(new ArrayList(List.of("eat","tea","ate")), new ArrayList(List.of("bat")), new ArrayList(List.of("tan","nat")))), groupAnagram.execute(new ArrayList(List.of("eat","tea","tan","ate","nat","bat"))), "number list [2,7,11,15] and target 9 should return [0, 1]");
    assertEquals(new ArrayList<ArrayList>(List.of(new ArrayList(List.of("")))), groupAnagram.execute(new ArrayList(List.of(""))), "empty string list should return a list of a list with empty string");
    assertEquals(new ArrayList<ArrayList>(List.of(new ArrayList(List.of("a")))), groupAnagram.execute(new ArrayList(List.of("a"))), "single string list should return a list of a list with single string");
  }
}
