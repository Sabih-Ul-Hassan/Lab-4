/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opp_lab4_sp20.bse.pkg082_assignment1_runner;

public class HotDogStand {
    private int IdNumber;
    private int hotDogsSold;
    
    HotDogStand(int IdNumber,int hotDogsSold)
    {this.IdNumber=IdNumber; this.hotDogsSold=hotDogsSold; }
    void justSold()
    {hotDogsSold++; }
    
    int getHotDogsSold(){return hotDogsSold; }
    
    int getId(){return IdNumber; }
    
}
