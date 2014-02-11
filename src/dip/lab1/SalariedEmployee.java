package dip.lab1;

/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class SalariedEmployee extends Employee {
    private double annualSalary;
    private double annualBonus;
    
    /**
     * Convenience constructor. Is this the best way to go?
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     */
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }
    
    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        if(annualBonus < 0){
            throw new IllegalArgumentException();
        } else {
            this.annualBonus = annualBonus;
        }
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        if(annualSalary < 0){
            throw new IllegalArgumentException();
        } else {
            this.annualSalary = annualSalary;
        }
    }
    

    
    @Override
    public double getAnnualWages(){
        return annualSalary + annualBonus;
    }

    
}
