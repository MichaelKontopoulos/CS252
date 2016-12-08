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
public class Turn {
 private Player currentPlayer;
 private Player last_player;
 
 
     /**
     * Constructor of a turn in which we got a current player and the last one.
     */
 public Turn()
 {
     
 }
 
     /**
     * Sets a turn for the player
     * 
     * @param p player
     */
 public void setName(Player p){
    
 }
     /**
     * Gets current player
     * @return current player
     * 
     */
 public Player getName()
 {
     return this.currentPlayer;
 }
  /**
     * Checks if player has finished
     * @param p player
     * @return false if not,true if he did.
     * 
     */
 public boolean checkIfFinished(Player p)
 {
        return false;
 }
  /**
     * Sets last player.
     * @param p Last Player
     */
 public void Set_last_player(Player p)
 {
        
 }
 /**
  *Get the most recent player.
  * @return the Most recent player
  */
  public Player Get_last_player()
  {
     return this.last_player;
  }
}
