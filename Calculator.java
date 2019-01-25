

/**
 * @author Nana Kwabena Ofori Parker, Karen Kukua Nkansah
 * @version 1.0.0
 */

import java.lang.Math.*;


/**
 *       This class has the functions of an everyday calculator i.e add, subtract, divide, multiply and some others
 */

public class Calculator {
    private int power;
    private double endGame;
    private String tryAgain = "Try Again";
    private String goAhead = "Continue";


    /**
     *   This constructor 'Calculator' when used would equate power to 1 would in this case would turn on the Calculator
     */
    public Calculator(){
        power = 1;
    }

    /**
     * This constructor when used would give the user the opportunity to input a figure however the user must put in '1' to turn on the calculator
     * @param number
     */
    public Calculator(int number){
        if (number == 1) {
            this.power = number;
            powerChecker();
        }
        else if (number != 1){
            powerChecker();
        }
    }


    /**
     * This represents the getter function for the variable "power"
     * @return    the variable power is returned
     */
    public int getPower(){
        return power;
    }


    /**
     * This represents the setter function for the variable "power"
     * @param number
     */
    public void setPower(int number){
        this.power = number;
    }

    /**
     * This function checks to ensure that the Calculator has been turned on else the program will not run
     * @return
     */
    public String powerChecker(){
        if (power != 1){
            System.out.println("Calculator is off and so turn it on");
            System.exit(1);
        }
         return goAhead;
    }

    /**
     * This adds the two numbers provided as parameters
     * @param numOne
     * @param numTwo
     * @return
     */
    public double addNumbers (double numOne, double numTwo){
        powerChecker();
        endGame = numOne + numTwo;
        System.out.println(endGame); 
        return endGame;
    }


    /**
     * This subtracts the two numbers given as parameters as they are arranged in the function
     * @param numOne
     * @param numTwo
     * @return
     */
    public double subtractNumbers(double numOne, double numTwo){
         powerChecker();
         endGame = numOne - numTwo;
         System.out.println(endGame);
         return endGame;
    }


    /**
     * This multiplies the two numbers given in the parameter field
     * @param numOne
     * @param numTwo
     * @return
     */
    public double multiplyNumbers(double numOne, double numTwo){
        powerChecker();
        endGame = numOne * numTwo;
        System.out.println(endGame);
        return endGame;
    }


    /**
     * This divides the two numbers provided in the field
     * @param numOne
     * @param numTwo
     * @return
     * @throws ArithmeticException
     */
    public double divideNumbers(double numOne, double numTwo)throws ArithmeticException{
        powerChecker();
        if (numTwo == 0){
            throw new ArithmeticException("This is undefined");
        }
        endGame = numOne / numTwo;
        System.out.println(endGame);
        return endGame;
    }


    /**
     * This squares the number provided as a function parameter
     * @param numOne
     * @return
     */
    public double squareNumber(double numOne){
        powerChecker();
        endGame = Math.pow(numOne,2);
        System.out.println(endGame);
        return endGame;
    }


    /**
     * Provides the square root of the number provided
     * @param numTwo
     * @return
     * @throws ArithmeticException
     */
    public double rootOfNumber(double numTwo)throws ArithmeticException{
        powerChecker();
        if (numTwo < 0){
               throw new ArithmeticException("You cannot find the square root of negative numbers");
        }
        endGame = Math.sqrt(numTwo);
        System.out.println(endGame);
        return endGame;
    }

    public static void main(String[] args) {
        Calculator myCalc = new Calculator(0);
        myCalc.addNumbers(1,5);
        myCalc.subtractNumbers(1,5);
        myCalc.divideNumbers(1,5);
        myCalc.rootOfNumber(4);
        myCalc.squareNumber(4);
    }

}
