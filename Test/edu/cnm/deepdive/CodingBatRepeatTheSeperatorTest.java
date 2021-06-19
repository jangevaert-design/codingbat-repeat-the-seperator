package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatRepeatTheSeperatorTest {

  private String[][] stringParams = {
      {"Word", "X"},
      {"This", "And"},
      {"This", "And"},
      {"Hi", "-n-"},
      {"AAA", ""},
      {"AAA", ""},
      {"A", "B"},
      {"abc", "XX"},
      {"abc", "XX"},
      {"abc", "XX"},
      {"XYZ", "a"}
  };

  private int[] countParams = {3, 2, 1, 2, 1, 0, 5, 3, 2, 1, 2};


  private String stringExpexted[] = {
      "WordXWordXWord",
      "ThisAndThis",
      "This",
      "Hi-n-Hi",
      "AAA",
      "",
      "ABABABABA",
      "abcXXabcXXabc",
      "abcXXabc",
      "abc",
      "XYZaXYZ"
  };


  @Test
  void test() {
    for (int i = 0; i < stringParams.length ; i++) {
      String actual = CodingBatRepeatTheSeperator.repeatSeparator(stringParams[i][0],
          stringParams[i][1], countParams[i]);
      Assertions.assertEquals(actual, stringExpexted[i]);
    }
  }

}