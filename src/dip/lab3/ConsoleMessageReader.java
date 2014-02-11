/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3;
import java.util.Scanner;

/**
 *
 * @author khalloway
 */
public class ConsoleMessageReader implements MessageReader{
    public String message;
    
    public String getMessage(){
        Scanner scan = new Scanner(System.in);
        message = scan.nextLine();
        return message;
    }
    
    
}
