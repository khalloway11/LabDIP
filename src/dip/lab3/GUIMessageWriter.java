/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab3;

/**
 *
 * @author khalloway
 */
public class GUIMessageWriter implements MessageWriter{
    public void writeMessage(MessageReader in){
        System.out.println(in.getMessage());
    }
}
