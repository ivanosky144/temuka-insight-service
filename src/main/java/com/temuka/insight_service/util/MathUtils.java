package com.temuka.insight_service.util;

public class MathUtils {

    private MathUtils() {}

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException("Decimal places must be non-negative");

        double factor = Math.pow(10, places);
        return Math.round(value * factor) / factor;
    }

    public static double average(double... values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Values array must not be null or empty");
        }

        double sum = 0.0;
        for (double value: values) {
            sum += value;
        }
        return sum / values.length;
    }
}
