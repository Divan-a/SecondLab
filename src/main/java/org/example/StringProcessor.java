package org.example;

public class StringProcessor {
    public static String stringCopy(String str, int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Число n < 0");
        }
        return str.repeat(n);
    }

    public static int substringOccurence(String str1, String str2) throws ArithmeticException {
        if (str2 == null) {
            throw new ArithmeticException("Нет второго параметра");
        }
        return (str1.length() - str1.replace(str2, "").length()) / str2.length();

    }

    public static String changeNumInString(String str) {
        return str.replaceAll("1", "один").replaceAll("2", "два").replaceAll("3", "три");
    }

    public static StringBuilder deleteEverSecondElem(StringBuilder str) {
        int n = str.length();
        for (int i = 1; i <= n / 2; i++) {
            str.deleteCharAt(i);
        }
        return str;
    }
}
