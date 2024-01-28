package com.example.ai.stock.common.utils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Objects;

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

  public static boolean isBeforeOrEqual(LocalDate from, LocalDate to) {
    return from.isBefore(to) || Objects.equals(from, to);
  }

  public static boolean isWeekend(final LocalDate ld) {
    DayOfWeek day = DayOfWeek.of(ld.get(ChronoField.DAY_OF_WEEK));
    return day == DayOfWeek.SUNDAY || day == DayOfWeek.SATURDAY;
  }

  public static boolean isFriday(final LocalDate ld) {
    DayOfWeek day = DayOfWeek.of(ld.get(ChronoField.DAY_OF_WEEK));
    return day == DayOfWeek.FRIDAY;
  }
}
