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
    public abstract class Position {
        private String day;
        private int positionAtBoard;

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
         *Position at board
         */
        public Position(){

    }

   
    public  abstract void performAction(Player p, int diceNumber);
}
