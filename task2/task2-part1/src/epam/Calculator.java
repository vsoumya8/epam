/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epam;

/**
 *
 * @author Dell
 */
public class Calculator {
    public static int addition(int number1,int number2)
    {
        return number1+number2;
    }
    public static int substraction(int number1, int number2)
    {
        return number1-number2;
    }
    public static int multiplication(int number1,int number2)
    {
        return number1*number2;
    }
    public static int division(int number1,int number2)
    {
        if(number2 == 0){
            throw new IllegalArgumentException("division by 0 not possible");
        }
        return number1/number2;
    }
}
