package com.example.ai.stock.service.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeUtils {
  public static LocalDate toLocalDate(String str) {
    try {
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      LocalDate localDate = LocalDate.parse(str, formatter);
      return localDate;
    } catch (Exception e) {
    }
    return null;
  }
}
