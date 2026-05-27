package org.example;

import java.util.List;

/**
 * Main exercise class.
 */
public class Main {

    private static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    public static double safeDivision(double a, double b) {

        try {
            return divide(a, b);
        } catch (ArithmeticException e) {
            return 0;
        }
    }
        public static String getSecondLetter (String s, List < String > logMessages){

            try {
                return s.substring(1, 2);
            } catch (StringIndexOutOfBoundsException e) {
                return "";
            } finally {
                logMessages.add("Exiting method");
            }
        }

        public static double safeDivideWithCustomException ( double a, double b) throws CustomDivideByZeroException {
            if (b == 0) {
                throw new CustomDivideByZeroException(a, b);
            }
            return divide(a, b);
        }
    }
