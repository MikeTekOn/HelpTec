/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opensoftware.helptec.util;

/**
 *
 * @author Hugo
 * @date 12/fev/2018
 */
public class ConvertTypeData {

    /**
     * Validat if string is good status to convert
     *
     * @param s string to convert
     * @return true if string good status
     */
    private static boolean checkString(String s) {

        if (s == null) {
            return false;
        }

        return !s.equals("");
    }

    /**
     * Convert to int
     *
     * @param s string to convert
     * @return return -1 if can not convert
     */
    public static int convertToInt(String s) {

        if (!checkString(s)) {
            return -1;
        }

        return Integer.parseInt(s);
    }

    /**
     * Convert to double
     *
     * @param s string to convert
     * @return return -1 if can not convert
     */
    public static double convertToDouble(String s) {

        if (!checkString(s)) {
            return -1;
        }

        return Double.parseDouble(s);
    }

    /**
     * Convert to float
     *
     * @param s string to convert
     * @return return -1 if can not convert
     */
    public static float convertToFloat(String s) {

        if (!checkString(s)) {
            return -1;
        }
        return Float.parseFloat(s);
    }

    /**
     * Convert to long
     *
     * @param s string to convert
     * @return return -1 if can not convert
     */
    public static long convertToLong(String s) {

        if (!checkString(s)) {
            return -1;
        }
        return Long.parseLong(s);
    }

    /**
     * Convert int to string
     *
     * @param i data to convert
     * @return String
     */
    public static String convertToString(int i) {
        return String.valueOf(i);
    }

    /**
     * Convert double to string
     *
     * @param d data to convert
     * @return String
     */
    public static String convertToString(double d) {
        return String.valueOf(d);
    }

    /**
     * Convert String to array
     *
     * @param s data to convert
     * @return array of chars
     */
    public static char[] convertToArrayChar(String s) {

        if (!checkString(s)) {
            return null;
        }
        return s.toCharArray();
    }

    /**
     * Convert array to string
     *
     * @param arr data to convert
     * @return String
     */
    public static String convertToString(char[] arr) {
        if (arr.length == 0) {
            return null;
        }
        if (arr == null) {
            return null;
        }

        return String.valueOf(arr);

    }

}
