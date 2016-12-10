/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Michael
 */
    public class Position {
        private String day;
        private String Type;
        

        /**
         *Sets the day of the month (position at board)
         * @param day day of the month
         */
        public void  setDay(String day){
            this.day=day;
        }

        /**
         *Gets the day of the month
         * @return day of the month
         */
        public String  getDay(){
            return this.day;
        }
        
    /**
     *
     * @return
     */
    public String getType(){
            return this.Type;
        }

        /**
         *Position at board
     * @param Type type
         */
        public Position(String Type){
            this.Type=Type;

    }
        public void performAction(Player p, int diceNumber,Player Enemy,ArrayList <DealCard> DealCards,ArrayList <MailCard> MailCards,ArrayList <DealCard> DealCardsOFFSTACK,
                ArrayList <MailCard> MailCardsOFFSTACK) {
            if(this.Type.equals("MailPositionDraw1"))
            {
               if(MailCards.size()!=0){
                    MailCards.get(0).performAction(p, diceNumber, Enemy);
                    MailCardsOFFSTACK.add(MailCards.get(0));
                    MailCards.remove(0);
               }
               else
               {
                 //  ArrayList tmp=new ArrayList <MailCard>();
                 //TO DO SWAP ARRAYLISTS
               }
            }
            if(this.Type.equals("MailPositionDraw2")){
            if(MailCards.size()!=0)
                {
                 MailCards.get(0).performAction(p, diceNumber, Enemy);
                 MailCardsOFFSTACK.add(MailCards.get(0));
                 MailCards.remove(0);
                 MailCards.get(0).performAction(p, diceNumber, Enemy);
                 MailCardsOFFSTACK.add(MailCards.get(0));
                 MailCards.remove(0);
                }
            else
                {
                  //  ArrayList tmp=new ArrayList <MailCard>();
                  //TO DO SWAP ARRAYLISTS
                }
            }
            if(this.Type.equals("DealPosition")){
              if(DealCards.size()!=0)
                { 
                 DealCards.get(0).performAction(p, diceNumber, Enemy);//choice
                 DealCardsOFFSTACK.add(DealCards.get(0));
                 DealCards.remove(0);
                }
              else
                {
                  //  ArrayList tmp=new ArrayList <DealCards>();
                  //TO DO SWAP ARRAYLISTS
                }
              
            }
            if(this.Type.equals("SWEEPSTAKES")){
                int z=(1000*p.playDice());
                p.setMoney(p.getMoney()+z);
            }
            if(this.Type.equals("LOTTERY")){
                while(true){
                    Scanner reader = new Scanner(System.in);  // Reading from System.in
                    System.out.println("Enter a number: ");
                    int n = reader.nextInt();
                    if (n==p.playDice()){
                        p.setMoney(p.getMoney()+1000);
                        return;
                    }
                    else
                    {
                        reader = new Scanner(System.in);  // Reading from System.in
                        System.out.println("Enter a number: ");
                        n = reader.nextInt();
                        if (n==Enemy.playDice()){
                            Enemy.setMoney(Enemy.getMoney()+1000);
                            return;
                        }       
                    }          
                }
            }
            if(this.Type.equals("RADIO")){
                
            }
            if(this.Type.equals("BUYER")){
                
            }
            if(this.Type.equals("FAMILY CASINO NIGHT")){
                
            }
            if(this.Type.equals("YARD SALE")){
                
            }
            if(this.Type.equals("PAYDAY")){
                
            }
        }

   
   
}
