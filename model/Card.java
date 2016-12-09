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
public interface Card {
    
    /**
     * Depending on what dice number and which player's turn is actions are performed
     * @param p Player
     * @param diceNumber Number of Dice
     */
    public void performAction(Player p, int diceNumber,Player enemy);
}
