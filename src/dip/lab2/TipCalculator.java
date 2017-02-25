/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

import java.text.DecimalFormat;

/**
 *
 * @author jerem
 */
public class TipCalculator {

    static final double MIN_BILL = 0.00;
    static final double MAX_BILL = 100.00;

    private final static double GOOD_RATE = 0.20;
    private final static double FAIR_RATE = 0.15;
    private final static double POOR_RATE = 0.10;

    //Unchanged Variables ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    private double baseTipOrBill;
    private int bagCountOrPplSplit;

    //Changable Variables ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    DecimalFormat df = new DecimalFormat("#.##");

    //Format Double ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    public void setTip(double baseTipOrBill, int bagOrSplit){};

    public double getTip(){return 0;
};

    public String BILL_ENTRY_ERR(){return null;
};

    //Abstract methods ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^


    //Getters and Setters
    public int getBagCountOrPplSplit() {
        return bagCountOrPplSplit;
    }

    public void setBagCountOrPplSplit(int bagCountOrPplSplit) {
        this.bagCountOrPplSplit = bagCountOrPplSplit;
    }

    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }

    ServiceQuality serviceQuality;

    public final void setServiceRating(ServiceQuality q) {
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public static double getGOOD_RATE() {
        return GOOD_RATE;
    }

    public static double getFAIR_RATE() {
        return FAIR_RATE;
    }

    public static double getPOOR_RATE() {
        return POOR_RATE;
    }

    public double getBaseTipOrBill() {//Formats and outputs tips
        double gt = baseTipOrBill;

        String gtb = df.format(gt);

        gt = Double.parseDouble(gtb);

        return gt;
    }

    public void setBaseTipOrBill(double baseTipOrBill) {
        this.baseTipOrBill = baseTipOrBill;
    }

}
