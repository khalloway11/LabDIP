/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2;

/**
 *
 * @author khalloway
 */
public interface TipCalculator {
    public static final double GOOD_RATE = 0.20;
    public static final double FAIR_RATE = 0.15;
    public static final double POOR_RATE = 0.10;
    public static final double MIN_BILL = 0.00;
    public static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    
    public double getTip();
    public void setServiceRating(ServiceQuality q);
    public ServiceQuality getServiceQuality();
    
}
