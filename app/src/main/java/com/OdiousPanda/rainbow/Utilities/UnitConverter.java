package com.OdiousPanda.rainbow.Utilities;

import android.content.Context;

import com.OdiousPanda.rainbow.R;

import java.nio.charset.StandardCharsets;
import java.util.Random;

public class UnitConverter {

    private final static String DEGREE = "\u00b0";

    private static String banana() {
        byte[] bananaByte = {(byte) 0xF0, (byte) 0x9F, (byte) 0x8D, (byte) 0x8C};
        return new String(bananaByte, StandardCharsets.UTF_8);
    }

    public static float toCelsius(float temp) {
        return (temp - 32) * 5 / 9;
    }

    private static float toFahrenheit(float temp) {
        return temp;
    }

    private static String toCelsiusPretty(float temp) {
        return Math.round(toCelsius(temp)) + DEGREE + "C";
    }

    private static String toFahrenheitPretty(float temp) {
        return Math.round(toFahrenheit(temp)) + DEGREE + "F";
    }

    private static float toKelvin(float temp) {
        return toCelsius(temp) + 273;
    }

    private static String toKelvinPretty(float temp) {
        return Math.round(toKelvin(temp)) + DEGREE + "K";
    }

    public static String convertToTemperatureUnit(float temp, String unit) {
        if (unit.equals(DEGREE + "C")) {
            return toCelsiusPretty(temp);
        } else if (unit.equals(DEGREE + "F")) {
            return toFahrenheitPretty(temp);
        }
        return toKelvinPretty(temp);
    }

    public static String convertToTemperatureUnitClean(float temp, String unit) {
        if (unit.equals(DEGREE + "C")) {
            return Math.round(toCelsius(temp)) + DEGREE;
        } else if (unit.equals(DEGREE + "F")) {
            return Math.round(toFahrenheit(temp)) + DEGREE;
        }
        return Math.round(toKelvin(temp)) + DEGREE + "K";
    }

    public static String convertToDistanceUnit(float distance, String unit) {
        if (unit.equals("km")) {
            return Math.round(distance * 1.609) + " km";
        } else if (unit.equals("mile")) {
            return Math.round(distance) + " mi";
        }
        return Math.round(distance * 9041.254) + " " + banana();
    }

    public static String convertToSpeedUnit(float speed, String unit) {
        if (unit.equals("kmph")) {
            return Math.round(speed * 1.609) + " km/h";
        } else if (unit.equals("mph")) {
            return Math.round(speed) + " mph";
        }
        return Math.round(speed * 9041.254) + " " + banana() + "/h";
    }

    public static float toMeterPerSecond(float speed) {
        return (float) (speed * 0.447);
    }

    public static String convertToPressureUnit(Context context, float pressure, String unit) {
        if (unit.equals("psi")) {
            return Math.round(pressure / 68.948) + " psi";
        } else if (unit.equals("mmHg")) {
            return Math.round(pressure / 1.333) + " mmHg";
        } else {
            String[] depressLevels = context.getResources().getStringArray(R.array.depression_levels);
            return depressLevels[new Random().nextInt(depressLevels.length)];
        }
    }
}
