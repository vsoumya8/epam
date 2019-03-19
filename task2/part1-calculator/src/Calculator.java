/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author soumya 
 */
public class Calculator {
    public static double addition(String s)
    {
        StringTokenizer st = new StringTokenizer(s," ");
        double sum=0 ;
        while(st.hasMoreTokens())
        {
           sum = sum + Double.parseDouble(st.nextToken());
        }
        return sum;
    }
    public static double multiplication(String s)
    {
        StringTokenizer st = new StringTokenizer(s," ");
        double product =1 ;
        while(st.hasMoreTokens())
        {
           product = product * Double.parseDouble(st.nextToken());
        }
        return product;
    }
    public static double division (int dividend,int divisor)
    {
        if(divisor == 0)
        {
            throw new IllegalArgumentException("cant be divided by zero");
        }
        double result = 0;
        result=dividend/(divisor*1.0);
        return result;
    }
}
