package com.example.ai.stock.service;

import java.util.ArrayList;
import java.util.List;

public class BollingerBands {
  public static void main(String[] args) {
    // Sample price data
    List<Double> prices = new ArrayList<>();
    prices.add(32d);
    prices.add(33.6d);
    prices.add(33.3);
    prices.add(33.6);
    prices.add(32.85);
    prices.add(32.6);

    int period = 3; // Number of periods for the moving average
    double standardDeviations = 2.0; // Number of standard deviations for the bands

    List<Double> middleBands = calculateSMA(prices, period);
    List<Double> upperBands = calculateUpperBand(prices, period, standardDeviations);
    List<Double> lowerBands = calculateLowerBand(prices, period, standardDeviations);

    // Print the calculated Bollinger Bands
    //    for (int i = 0; i < prices.size(); i++) {
    //      System.out.println("Price: " + prices.get(i) +
    //              ", Middle Band: " + middleBands.get(i) +
    //              ", Upper Band: " + upperBands.get(i) +
    //              ", Lower Band: " + lowerBands.get(i));
    //    }
    System.out.println(lowerBands);
    System.out.println(middleBands);
    System.out.println(upperBands);
  }

  // Calculate the Simple Moving Average (SMA)
  private static List<Double> calculateSMA(List<Double> prices, int period) {
    List<Double> smaValues = new ArrayList<>();
    for (int i = period - 1; i < prices.size(); i++) {
      double sum = 0.0;
      for (int j = i - period + 1; j <= i; j++) {
        sum += prices.get(j);
      }
      double sma = sum / period;
      smaValues.add(sma);
    }
    return smaValues;
  }

  // Calculate the Upper Bollinger Band
  private static List<Double> calculateUpperBand(List<Double> prices, int period, double standardDeviations) {
    List<Double> upperBandValues = new ArrayList<>();
    List<Double> smaValues = calculateSMA(prices, period);
    for (int i = period - 1; i < prices.size(); i++) {
      double sumSquaredDeviations = 0.0d;
      for (int j = i - period + 1; j <= i; j++) {
        double deviation = prices.get(j) - smaValues.get(i - period + 1);
        sumSquaredDeviations += deviation * deviation;
      }
      double standardDeviation = Math.sqrt(sumSquaredDeviations / period);
      double upperBand = smaValues.get(i - period + 1) + (standardDeviations * standardDeviation);
      upperBandValues.add(upperBand);
    }
    return upperBandValues;
  }

  // Calculate the Lower Bollinger Band
  private static List<Double> calculateLowerBand(List<Double> prices, int period, double standardDeviations) {
    List<Double> lowerBandValues = new ArrayList<>();
    List<Double> smaValues = calculateSMA(prices, period);
    for (int i = period - 1; i < prices.size(); i++) {
      double sumSquaredDeviations = 0.0;
      for (int j = i - period + 1; j <= i; j++) {
        double deviation = prices.get(j) - smaValues.get(i - period + 1);
        sumSquaredDeviations += deviation * deviation;
      }
      double standardDeviation = Math.sqrt(sumSquaredDeviations / period);
      double lowerBand = smaValues.get(i - period + 1) - (standardDeviations * standardDeviation);
      lowerBandValues.add(lowerBand);
    }
    return lowerBandValues;
  }
}