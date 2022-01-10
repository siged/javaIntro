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

    @Description("Low number test")
    @org.junit.jupiter.api.Test
    public void lowFloatNumber (){
    OperationWithTwoNumbers operationLow = new OperationWithTwoNumbers();

    float longNumber = -50_000_000;
    String floatLeght = "5";
    String test = operationLow.printJavaPrimitiveNumbers(longNumber,floatLeght);
    assertAll(test);

    }
}

