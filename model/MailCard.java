/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Michael
 */
public class MailCard implements Card  {
    
    /**
     *
     */
    public MailCard(){
        
    }
    /**
     * Depending on the dice and what kind of Mail card it is,another action is performed.
     * @param p Player
     * @param diceNumber Number of Dice
     */
    @Override
    public void performAction(Player p, int diceNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
