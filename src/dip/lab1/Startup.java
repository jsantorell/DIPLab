package dip.lab1;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Just a start and test class for this program. You may modify this class in
 * any way you see fit.
 *
 * @author jlombardo
 */
public class Startup {

    public static void main(String[] args) {
        /*
         * We'll just use this class for testing our ccde.
         * We'll provide input and get some output...
         */
        int count = 1;
        //Low-level modules
        Employee emp1 = new HourlyEmployee(10.50, 2020);
        Employee emp2 = new SalariedEmployee(45000, 1250);
        Employee emp3 = new SalariedEmployee(90000, 0);

        ArrayList<Employee> employeeList = new ArrayList<>();

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        // High-level module
        HRService hr = new HRService();

        // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        for (Employee emp : employeeList) {

            System.out.println("Employee " + count + " annual compensation: "
                    + nf.format(hr.getAnnualCompensationForEmployee(emp)) + " Type: " + emp.getEmployeeType());
            count++;
        }

    }

}
