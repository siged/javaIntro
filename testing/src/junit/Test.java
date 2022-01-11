package junit;



import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

import jdk.jfr.Description;

public class Test {

    @Description("What will do the test")
    @org.junit.jupiter.api.Test
    public void testSumTwoNumbersMethod(){
        OperationWithTwoNumbers operationSum = new OperationWithTwoNumbers();

        //1. sum two numbers
        int firstNumber = 100;
        int seconfNumber = 20;
        int testNumber  = operationSum.sumTwoNumbers(firstNumber, seconfNumber);
        assertTrue(testNumber == firstNumber+seconfNumber);
    }


    @Description("What will do the test if we provide infinity number")
    @org.junit.jupiter.api.Test
    public void testSumTwoNumbersMethodWithInfinityIntegers(){
        OperationWithTwoNumbers operationSum = new OperationWithTwoNumbers();

        //1. sum two numbers
        long firstNumber = 50;
        long seconfNumber = -200_000;
        long testNumber  = operationSum.sumTwoNumbers((int)firstNumber, (int)seconfNumber);
        assertTrue(testNumber == firstNumber+seconfNumber);
    }

    @Description("Negative float")
    @org.junit.jupiter.api.Test
    public void negativeFloatNumber (){
    OperationWithTwoNumbers operationLow = new OperationWithTwoNumbers();

    float longNumber = (float) -50000.36582;
    String floatLeght = "5";
    String test = operationLow.printJavaPrimitiveNumbers(longNumber,floatLeght);
    assertAll(test);

    }

    @Description("Out of range after point number")
    @org.junit.jupiter.api.Test
    public  void outOfRangeNumber (){
        OperationWithTwoNumbers operationLow = new OperationWithTwoNumbers();
        float longNumber = 100;
        String floatLeght = "25";
        String test = operationLow.printJavaPrimitiveNumbers(longNumber,floatLeght);
        assertAll(test);
    }

    @Description("Negative after point number")
    @org.junit.jupiter.api.Test
    public  void negativeAfterPointNumber (){
        OperationWithTwoNumbers operationLow = new OperationWithTwoNumbers();
        float longNumber = 100;
        String floatLeght = "-5";
        String test = operationLow.printJavaPrimitiveNumbers(longNumber,floatLeght);
        assertAll(test);
    }

    @Description("Negative after point number")
    @org.junit.jupiter.api.Test
    public  void wholeFloatNumber (){
        OperationWithTwoNumbers operationLow = new OperationWithTwoNumbers();
        float longNumber = 125;
        String floatLeght = "3";
        String test = operationLow.printJavaPrimitiveNumbers(longNumber,floatLeght);
        assertAll(test);
    }

    @Description("After point difference")
    @org.junit.jupiter.api.Test
    public  void differenceAfterPoing (){
        OperationWithTwoNumbers operationLow = new OperationWithTwoNumbers();
        float longNumber = (float) 100.278;
        String floatLeght = "5";
        String test = operationLow.printJavaPrimitiveNumbers(longNumber,floatLeght);
        assertAll(test);
    }
}

// test all threads