package br.com.study.utils;

import br.com.study.exception.UnsupportedMathOperationException;

public class NumberConverter {

  public static Double convertToDouble(String strNumber) {

    if (strNumber == null || strNumber.isEmpty())
      throw new UnsupportedMathOperationException("Please set a numeric values!");

    String number = strNumber.replace(",", ".");

    return Double.parseDouble(number);
  }

  public static boolean isNumeric(String strNumber) {

    if (strNumber == null || strNumber.isEmpty()) return false;

    String number = strNumber.replace(",", ".");

    return number.matches("[-+]?[0-9]*\\.?[0-9]+");
  }
}
