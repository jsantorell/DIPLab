package dip.lab1;

/**
 * A high-level class that delegates to employee objects to do the work. Does
 * this class design follow the DIP? If not, fix it.
 *
 * @author your name goes here
 */
public class HRService {

    public double getAnnualCompensationForEmployee(Employee e) {
        double annualCompensation = 0;

        // One example of using fragile if logic to determine employee type.
        // If only we could use polymorphism instead!
        if (e.getEmployeeType().isEmpty()) {// might need more validation

            ErrorManager.errorSender();
        } else {
            annualCompensation = e.getAnnualWages();
        }

        return annualCompensation;
    }

}
