package edu.cnm.deepdive;

/*

Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
separated by the separator string.

repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
 */

public class CodingBatRepeatTheSeperator {

  public static void main(String[] args) {
    System.out.printf("with the Strings %s and %s and the count set to %d, the outcome will be "
    + repeatSeparator("Word", "X", 3) + ".\n", "Word", "X", 3);
    System.out.printf("with the Strings %s and %s and the count set to %d, the outcome will be "
        + repeatSeparator("This", "And", 2) + ".\n", "This", "And", 2);
    System.out.printf("with the Strings %s and %s and the count set to %d, the outcome will be "
        + repeatSeparator("This", "And", 1) + ".\n", "This", "And", 1);
  }

  public static String repeatSeparator(String word, String sep, int count) {
    String result = "";

    if (count == 0) {
      return "";
    }

    for (int i = 0; i < count - 1; i++) {
      result += word + sep;

    }
    result += word;
    return result;
  }

}
