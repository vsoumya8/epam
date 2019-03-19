/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intrest;

/**
 *
 * @author Dell
 */
public class Simple_Compound_Intrest {
    private final double principle;
    private final double rate;
    private final double period;
    private final int n;
    Simple_Compound_Intrest(double principle,double rate,double period,int n)
    {
        this.principle=principle;
        this.rate=rate/100;
        this.period=period;
        this.n=n;
    }
    public double simple_intrest()
    {
        return principle*rate*period;
    }
    public double compound_intrest()
    {
        return principle*Math.pow((1+rate/(n*1.0)),(n*period));
    }
   }

