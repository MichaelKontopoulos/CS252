/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static view.PayDayCards.choiceOfDealCard;

/**
 *
 * @author Michael
 */
public class DealCard implements Card {
        String type;
        String typeEn;
        String msg;
        int cost;
        int value;
        String Choice1;
        String Choice2;
       

    /**
     *
     */
    public DealCard(String Type,String TypeEn,String Message,int Cost,int Value,String Choice1,String Choice2){
        this.type=Type;
        this.typeEn=TypeEn;
        this.msg=Message;
        this.cost=Cost;
        this.value=Value;
        this.Choice1=Choice1;
        this.Choice2=Choice2;
        
        
    }
    /**
     * Depending on the dice and what kind of Deal card it is,another action is performed.
     * @param p Player
     * @param diceNumber Number of Dice
     */
        @Override
    public void performAction(Player p, int diceNumber,Player enemy) {
        if (choiceOfDealCard==0){
            if(p.getMoney()<this.cost){
                p.setLoan(p.getLoan()+this.cost);
            }
            p.setMoney(p.getMoney()-this.cost);//TODO probably more
        }
    }
    
}
