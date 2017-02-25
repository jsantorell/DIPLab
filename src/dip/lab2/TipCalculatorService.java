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
public abstract class TipCalculatorService {

    private TipCalculator tipCalculator1;

    public double getCalculatedTip() {

        return tipCalculator1.getTip();
    }

    public TipCalculatorService(TipCalculator tipCalculator) {
        this.tipCalculator1 = tipCalculator;
    }

    public TipCalculator getTipCalculator() {
        return tipCalculator1;
    }

    public void setTipCalculator(TipCalculator tipCalculator) {
        this.tipCalculator1 = tipCalculator;
    }


}
