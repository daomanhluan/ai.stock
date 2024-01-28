package com.example.ai.stock.common.utils;

import java.text.DecimalFormat;

public class NumberUtils {
    public static Float round(Float value){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setRoundingMode(java.math.RoundingMode.HALF_UP);
        return Float.parseFloat(decimalFormat.format(value));
    }

    public static Double round(Double value){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setRoundingMode(java.math.RoundingMode.HALF_UP);
        return Double.parseDouble(decimalFormat.format(value));
    }
}
