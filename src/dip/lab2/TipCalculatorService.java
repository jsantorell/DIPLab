/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author jerem
 */
public interface TipCalculatorService {

    public abstract double getCalculatedTip();

    public abstract TipCalculator getTipCalculator();

    public abstract void setTipCalculator(TipCalculator tipCalculator);


}
