package dip.lab1;

/**
 * The concrete super class of all employee types. What's wrong with this class?
 * Find and fix all encapsulation, DIP and best practice problems learned so
 * far.
 *
 * @author your name goes here
 */
public interface Employee {

    public abstract String getEmployeeType();

    public abstract double getAnnualWages();

    public abstract double getAnnualBonus();

    public abstract void setAnnualBonus(double annualBonus);

    public abstract double getHourlyRate();

    public abstract void setHourlyRate(double hourlyRate);

    public abstract double getTotalHrsForYear();

    public abstract void setTotalHrsForYear(double totalHrsForYear);

}
