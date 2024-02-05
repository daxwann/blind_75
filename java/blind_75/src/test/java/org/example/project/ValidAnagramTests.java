package org.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

class ValidAnagramTests {

  @Test
  @DisplayName("check should return true if two strings are anagrams")
  void returnTrueIfAnagram() {
    ValidAnagram validAnagram = new ValidAnagram();
    assertEquals(true, validAnagram.check("anagram", "nagaram"), "anagram and nagaram should return true");
  }

  @Test
  @DisplayName("check should return false if two strings are not anagrams")
  void returnFalseIfNotAnagram() {
    ValidAnagram validAnagram = new ValidAnagram();
    assertEquals(false, validAnagram.check("rat", "car"), "rat and car should return false");
  }
}