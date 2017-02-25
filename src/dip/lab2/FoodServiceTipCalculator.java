package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP? If
 * not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public final class FoodServiceTipCalculator extends TipCalculator {

    private double tip;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt, int numberOfPplToSplit) {
        this.setBagCountOrPplSplit(numberOfPplToSplit);
        this.setServiceRating(q);
        this.setTip(billAmt, numberOfPplToSplit);
    }

    @Override
    public String BILL_ENTRY_ERR() {
        return "Error: bill must be greater than or equal to " + MIN_BILL;
    }

    @Override
    public void setTip(double baseTipOrBill, int pplToSplit) {

        if (baseTipOrBill > MIN_BILL) {

            switch (getServiceQuality()) {
                case GOOD:
                    tip = (baseTipOrBill * getGOOD_RATE()) / pplToSplit;
                    setBaseTipOrBill(tip);
                    break;
                case FAIR:
                    tip = (baseTipOrBill * getFAIR_RATE()) / pplToSplit;
                    setBaseTipOrBill(tip);
                    break;
                case POOR:
                    tip = (baseTipOrBill * getPOOR_RATE()) / pplToSplit;
                    setBaseTipOrBill(tip);
                    break;
            }
        }
        else{BILL_ENTRY_ERR();}

    }

    @Override
    public double getTip() {
        return tip;
    }

}
