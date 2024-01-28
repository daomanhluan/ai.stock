package com.example.ai.stock.common.utils;

import java.util.Objects;

public class StringUtils {

  public static String removeLastCharacter(String str) {
    if (Objects.isNull(str) || str.length() == 0) return "";
    return str.substring(0, str.length() - 1);
  }
}
