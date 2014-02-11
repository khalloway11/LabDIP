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
public class MessageService {
    private MessageReader messageInput;
    private MessageWriter messageOutput;
    
    public MessageService(MessageReader read, MessageWriter write){
        setMessageInput(read);
        setMessageOutput(write);
    }

    public MessageReader getMessageInput() {
        return messageInput;
    }

    public void setMessageInput(MessageReader messageInput) {
        this.messageInput = messageInput;
    }

    public MessageWriter getMessageOutput() {
        return messageOutput;
    }

    public void setMessageOutput(MessageWriter messageOutput) {
        this.messageOutput = messageOutput;
    }
    
    public void transmitMessage(){
        messageOutput.writeMessage(messageInput);
    }
}
