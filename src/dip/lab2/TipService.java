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
public class TipService {
    private TipCalculator tipCalculator;
    
    public TipService(TipCalculator tc){
        tipCalculator = tc;
    }
    
    public double calculateTip(){
        return tipCalculator.getTip();
    }
}
