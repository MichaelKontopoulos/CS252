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
   public String type;
   public String typeEn;
   public String msg;
   public int amount;
   public String choice;
    /**
     *
     * @param Type
     * @param TypeEn
     * @param Message
     * @param Choice
     * @param Euro
     */
    public MailCard(String Type,String TypeEn,String Message,String Choice,int Euro){
        this.type=Type;
        this.typeEn=TypeEn;
        this.msg=Message;
        this.amount=Euro;
        this.choice=Choice;
    }
    /**
     * Depending on the dice and what kind of Mail card it is,another action is performed.
     * @param p Player
     * @param diceNumber Number of Dice
     */
      
    
   @Override
    public void performAction(Player p, int diceNumber) {
        if(("Charity".equals(typeEn))||("PayTheNeighbor".equals(typeEn))||("Bill".equals(typeEn)))
                p.setMoney(p.getMoney()-this.amount);
        else if("MadMoney".equals(typeEn))
                p.setMoney(p.getMoney()+this.amount);
        //else go to deal/buyers position
    }

   
     
}
