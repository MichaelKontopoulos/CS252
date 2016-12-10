/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import model.DealCard;
import model.MailCard;
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
    Position [] array1month;// for the 1st month
    Position [] array2month; //for the 2nd  month if decided
    Position [] array3month; //for the 3rd  month if decided
    private int jackpot; // money AT the jackpot
    ArrayList <DealCard> dealCards;
    ArrayList <MailCard> mailCards;
    ArrayList <DealCard> dealCardsOFFStack;
    ArrayList <MailCard> mailCardsOFFStack;
    
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
       // P1=new Player("p1");
       // P2=new Player("p2");
        this.months=months;
        this.dealCards=new ArrayList <DealCard>();
        this.mailCards=new ArrayList <MailCard>();
        this.array1month=new Position[31];
        this.dealCardsOFFStack=new ArrayList <DealCard>();
        this.mailCardsOFFStack=new ArrayList <MailCard>();
        
    }
    /**INITIALIZES 31 POSITIONS RANDOMLY AND 1 JACKPOT,LAST POSITION IS PAYDAY,INITIALIZES 4 1-MAIL POSITIONS,4 2-MAIL POSITIONS
    * 5 DEAL POSITIONS,2 SWEEPSTAKES,3 LOTTERY,2 RADIO,6 BUYER,2 FAMILY CASINO NIGHT,2 YARD SALE.
    */
    public void initialize_Board()
    {
       for (int i=0;i<4;i++){
           Position newPosition=new Position("MailPositionDraw1");

            this.array1month[i]=newPosition;
       }
       for (int i=4;i<8;i++){
           Position newPosition=new Position("MailPositionDraw2");
           
            this.array1month[i]=newPosition;
       }
       for (int i=8;i<13;i++){
            Position newPosition=new Position("DealPosition");
           
            this.array1month[i]=newPosition;
       }
       for (int i=13;i<15;i++){
            Position newPosition=new Position("SWEEPSTAKES");
            
            this.array1month[i]=newPosition;
       }
       for (int i=15;i<18;i++){
            Position newPosition=new Position("LOTTERY");
            
            this.array1month[i]=newPosition;
       }
       for (int i=18;i<20;i++){
            Position newPosition=new Position("RADIO");
           
            this.array1month[i]=newPosition;
       }
       for (int i=20;i<26;i++){
            Position newPosition=new Position("BUYER");
            
            this.array1month[i]=newPosition;
       }
       for (int i=26;i<28;i++){
            Position newPosition=new Position("FAMILY CASINO NIGHT");
            
            this.array1month[i]=newPosition;
       }
       for (int i=28;i<30;i++){
            Position newPosition;
            newPosition = new Position("YARD SALE");
            
            this.array1month[i]=newPosition;
       }
      this.array1month[30]=new Position("PAYDAY");
       
    }
    public void ShuffleBoard(){
        Random rnd = ThreadLocalRandom.current();
    for (int i = this.array1month.length - 2; i > 0; i--)
    {
      int index = rnd.nextInt(i + 1);
      // Simple swap
      Position a = this.array1month[index];
      this.array1month[index] =this.array1month[i];
      this.array1month[i] = a;
    }
    }
    /**INITIALIZES 48 MAIL CARDS AND 20 DEAL CARDS
     */
    public void initialize_Cards(String S[][],String L[][])
    {
        for(int i=0;i<48;i++){
                      MailCard NewMailCard=new MailCard(S[i][0],S[i][1],S[i][2],S[i][3],Integer.parseInt(S[i][4]));
                      this.mailCards.add(NewMailCard);
        }
        for(int i=0;i<20;i++){
            DealCard newDealCard= new DealCard(L[i][0],L[i][1],L[i][2],Integer.parseInt(L[i][3]),Integer.parseInt(L[i][4]),L[i][5],L[i][6]);
            this.dealCards.add(newDealCard);
            
        }
      
    }
    
    public void printarraylist(){
        for (int i=0;i<this.mailCards.size();i++){
            System.out.println(this.mailCards.get(i).type +" "+ this.mailCards.get(i).typeEn +" "+ this.mailCards.get(i).msg +" "+ this.mailCards.get(i).amount +" "+
                    this.mailCards.get(i).choice);
        }
    }
    
    public void printBoard(){
        for(int i=0;i<31;i++)
        {
            System.out.println(this.array1month[i].getType() + i);
        }
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
