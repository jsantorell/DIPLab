package dip.lab1;

/**
 * A simple implementation sub-class of Employee. These are low-level classes in
 * the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class SalariedEmployee implements Employee {

    private final double annualSalary;
    private double annualBonus;
    private final String type;

    public SalariedEmployee(double annualSalary, double annualBonus) {
        this.annualSalary = annualSalary;
        this.annualBonus = annualBonus;
        this.type = "Salaried";
    }

    @Override
    public double getAnnualWages() {

        return annualSalary;
    }

    @Override
    public double getHourlyRate() {

        return annualSalary / 365 / 8;

    }

    @Override
    public void setHourlyRate(double hourlyRate) {
    }

    @Override
    public double getTotalHrsForYear() {

        return 8 * 260;
    }

    @Override
    public void setTotalHrsForYear(double totalHrsForYear) {
    }

    @Override
    public double getAnnualBonus() {
        return annualBonus;
    }

    @Override
    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    @Override
    public String getEmployeeType() {
        return type;
    }

}
