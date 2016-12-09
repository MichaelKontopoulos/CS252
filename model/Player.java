/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.DealCard;
import model.MailCard;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Michael
 */
public class Player {
    private String name;
    private int money;
    private int debts;
    private int positionAtBoard;
    private int monthsCompleted;
    private int restMonths;
    private int loans;
    private boolean finishedTurn,finishedGame;
    ArrayList <DealCard> dealCards;
    ArrayList <MailCard> mailCards;
    
    /**
     *Every player's got a name,and initial money total,every player has a turn to finish and its possible to finish the Game as he
     * moves through it.
     * @param name Name of Player
     */
    public Player(String name){
        this.name=name;
        this.money=2500;   
        this.finishedTurn=false;
        this.finishedGame=false;
        //prepei na exei kai kartes sthn katoxh tou
        
    }
    
    /**
     *Every player throws a random dice
     * @return random number between 1 and 6
     */
    public int playDice(){
        Random rand = new Random();
        return rand.nextInt(5)+1;
    }
    /**
     * Method in which a player takes a loan and then its added to his current money and loans.
     * @return the new amount of money he got
     */
    public int takeLoan(){
        return 0;
    }
    /**
     * Method to get player's loans.
     * @return the current loans
     */
    public int getLoan(){
        return this.loans;
    }
    
    public void setMoney(int Money){
        this.money=Money;
    }
    
    public int getMoney(){
        return this.money;
    }
    
    public int getDebts(){
        return this.debts;
    }
    
    public void setDebts(int Debts){
        this.debts=Debts;
    }
    public void setPosition(int Position){
        this.positionAtBoard=Position;
    }
    public int getPosition(){
        return this.positionAtBoard;
    }
    /**
     * Set a name to player 
     * @param newName Player Name
     */
    public void setName(String newName)
    {
        this.name=newName;
    }
    
    /**
     * Method to get the player's name.
     * @return name
     */
    public String getName()
    {
        return name;
    }
  
   /**
     * if player finished his turn then 
     * @return TRUE if yes,FALSE if he didn't.
     */
    public boolean has_finished()
    {
        return this.finishedTurn;
    }
    /**
     * Method in which we know if a player has got no months left.
     *  
     * @return true if he finished,false if not.
     */
    public boolean Get_has_finished()
    {
         return this.finishedGame;
    }
    /**
     * Method to get player's deal cards.
     * @return his hand of deal cards
     */
    public ArrayList <DealCard> getDealCards(){
        return this.dealCards;
    }
    /**
     * Method to get player's mail cards.
     * @return his hand of mail cards.
     */
    public ArrayList <MailCard> getMailCards(){
        return this.mailCards;
    }
}
