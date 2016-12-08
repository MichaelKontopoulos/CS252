/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Player;
import model.Position;
import model.Turn;

/**
 *
 * 
 * @author Michael
 */
public class controller {
    int months;
    Player P1,P2;
    Turn turn=new Turn();
    Position [] array1month; // for the 1st month
    Position [] array2month; //for the 2nd  month if decided
    Position [] array3month; //for the 3rd  month if decided
    private int jackpot; // money AT the jackpot

    /**
     * constructor: Constructs a new controller and sets the game as 
     * eligible to start .
     * postcondition: constructs a new Controller,with new 2 players,decides 
     * which player's turn is,how many months the game will be played,the jackpot and initialize
     * some int variables.So,is responsible for creating a new game and 
     * initializing it.
     * @param months months to be decided
     */
    public controller(int months){
        P1=new Player("p1");
        P2=new Player("p2");
        this.months=months;
    }
    /**INITIALIZES 31 POSITIONS RANDOMLY AND 1 JACKPOT,LAST POSITION IS PAYDAY,INITIALIZES 4 1-MAIL POSITIONS,4 2-MAIL POSITIONS
    * 5 DEAL POSITIONS,2 SWEEPSTAKES,3 LOTTERY,2 RADIO,6 BUYER,2 FAMILY CASINO NIGHT,2 YARD SALE.
    */
    public void initialize_Board()
    {
       
    }
    /**INITIALIZES 48 MAIL CARDS AND 20 DEAL CARDS
     */
    public void initialize_Cards()
    {
       
    }
    /**RANDOMLY SETS FIRST PLAYER
     * @param p1 Player one
     * @param p2 Player two
     * @return player
    */
    public Player setFirstPlayer(Player p1,Player p2){
     return p1;
    }
    
    /**SHUFFLE DEAL CARDS,CHECK IF THEY'RE FINISHED IF YES THEN INITIALIZE AND SHUFFLE AGAIN
    */
    public void shuffle_deal_cards()
    {
       
    }
    /**SHUFFLE MAIL CARDS,CHECK IF THEY'RE FINISHED IF YES THEN INITIALIZE AND SHUFFLE AGAIN
    */
    public void shuffle_Mail_cards()
    {
       
    }
    /**RETURN TRUE IF PLAYER WENT TO PAYDAY POSITION,FALSE OTHERWISE
     * @return boolean if finished
    */
    public boolean month_has_finished()
    {
       
        return false;
    }
    /**RETURN TRUE IF BOTH PLAYERS GOT NO MONTHS LEFT,FALSE OTHERWISE
     * @return boolean if game is finished
    */
    public boolean game_has_finished()
    {
       
        return false;
    }
    /**MOVES PLAYERS
    */
    public void move_Player(){
    }
    /**SET TURN TO OTHER PLAYER
    */
    public void set_Turn()
    {
       
    }
     
}
