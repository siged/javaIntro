package junit;


import com.sun.jdi.IntegerValue;

import javax.management.InvalidAttributeValueException;
import javax.naming.directory.InvalidAttributeIdentifierException;
import java.security.InvalidParameterException;

public class OperationWithTwoNumbers {

    public int sumTwoNumbers(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public int devideTwoNumbers(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }

    public int multiplyTwoNumbers(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public int substractionTwoNumbers(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    /**
     * Write a method wich from given float and average float number
     * print all java primitive numbers
     * byte, short, int ....
     *
     * @param num
     * @param pointNumber
     * @return
     */
    public String printJavaPrimitiveNumbers(float num, String pointNumber) {
        String floatNumber = String.valueOf(num);
        int floatLegth = 0;
        double number = 0;

        try {
            number = Double.parseDouble(floatNumber);
            floatLegth = Integer.parseInt(pointNumber);
        } catch (InvalidParameterException ex) {
            System.out.println("This is not allowed");
        }

        String[] primitiveWholeNumber = floatNumber.split(".");
        String afterPointNumber;
        long wholeNumber = Long.parseLong(primitiveWholeNumber[0]);
        String[] outputPrimitives = new String[5];

        if (floatLegth > 10) {
            floatNumber = "Float number can't be longer than 10";
        } else if (floatLegth < 0) {
            floatNumber = "Float number can't be lower than zero";
        } else {

            afterPointNumber = primitiveWholeNumber[1].substring(0, floatLegth);

            if (wholeNumber < Byte.MAX_VALUE || wholeNumber > Byte.MIN_VALUE) {
                outputPrimitives[0] = "Byte: overflow";
            } else {
                outputPrimitives[0] = primitiveWholeNumber[0];
            }
            if (wholeNumber < Short.MAX_VALUE || wholeNumber > Short.MIN_VALUE) {
                outputPrimitives[1] = "Shot: overflow";
            } else {
                outputPrimitives[1] = primitiveWholeNumber[0];
            }
            if (wholeNumber < Integer.MAX_VALUE || wholeNumber > Integer.MIN_VALUE) {
                outputPrimitives[2] = "Integer: overflow";
            } else {
                outputPrimitives[2] = primitiveWholeNumber[0];
            }
            if (wholeNumber < Long.MAX_VALUE || wholeNumber > Long.MIN_VALUE) {
                outputPrimitives[3] = "Long: overflow";
            } else {
                outputPrimitives[3] = primitiveWholeNumber[0];
            }
            if (number < Float.MAX_VALUE || number > Float.MIN_VALUE) {
                outputPrimitives[4] = "Float: overflow";
            } else {
                outputPrimitives[4] = String.join(".", primitiveWholeNumber[0], afterPointNumber);
            }
            outputPrimitives[5] = String.join(".", primitiveWholeNumber[0], afterPointNumber);
        }

        floatNumber = "Byte " + outputPrimitives[0] +
                "\n Short " + outputPrimitives[1] +
                "\n Integer " + outputPrimitives[2] +
                "\n Long " + outputPrimitives[3] +
                "\n Float " + outputPrimitives[4] +
                "\n Double " + outputPrimitives[5];

        return floatNumber;
    }

}

