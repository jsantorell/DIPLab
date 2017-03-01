package dip.lab1;

/**
 * An implementation sub-class of an Employee. These are low-level classes in
 * the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee implements Employee {

    private double hourlyRate;
    private double totalHrsForYear;
    private double annualBonus;
    private final String type;

    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        this.hourlyRate = hourlyRate;
        this.totalHrsForYear = totalHrsForYear;
        this.type = "Hourly  ";
    }

    @Override
    public double getAnnualWages() {
        return hourlyRate * totalHrsForYear;
    }

    @Override
    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate < 15.00){
            System.out.println("Minumum Hourly rate is $15.00.");
        } else {
            this.hourlyRate = hourlyRate;
        }
    }

    @Override
    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    @Override
    public void setTotalHrsForYear(double totalHrsForYear) {
        
        if(totalHrsForYear < 1){
        
            System.out.println("This person either did not work this year or was never added.");
        }
        else{
        this.totalHrsForYear = totalHrsForYear;
        }
    }

    @Override
    public double getAnnualBonus() {
        return annualBonus;
    }

    @Override
    public void setAnnualBonus(double annualBonus) {
        
        if(type.equals("Hourly  ") || annualBonus == 0){
        
            this.annualBonus = 0.00;
        }
        else{
        this.annualBonus = annualBonus;
        }
    }

    @Override
    public String getEmployeeType() {
        return type;
    }

}
