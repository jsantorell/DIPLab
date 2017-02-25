package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP? If
 * not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public final class BaggageServiceTipCalculator extends TipCalculator {

    double tip;

    public BaggageServiceTipCalculator(ServiceQuality q, double amtPerBag, int bags) {
        this.setBaseTipOrBill(amtPerBag);
        this.setBagCountOrPplSplit(bags);
        this.setServiceRating(q); // perform validation
        this.setTip(amtPerBag, bags);

    }

    @Override
    public String BILL_ENTRY_ERR() {
        return "Error: bill must be between " + MIN_BILL + " and "
                + MAX_BILL;
    }

    @Override
    public void setTip(double baseTipOrBill, int bags) {

        if(baseTipOrBill > MIN_BILL && baseTipOrBill < MAX_BILL){
        
        switch (serviceQuality) {
            case GOOD:
                tip = baseTipOrBill * bags * (1 + getGOOD_RATE());
                setBaseTipOrBill(tip);
                break;
            case FAIR:
                tip = baseTipOrBill * bags * (1 + getFAIR_RATE());
                setBaseTipOrBill(tip);
                break;
            case POOR:
                tip = baseTipOrBill * bags * (1 + getPOOR_RATE());
                setBaseTipOrBill(tip);
                break;
        }
        }
        else {BILL_ENTRY_ERR();}

    }

    @Override
    public double getTip() {
        return tip;
    }

}
