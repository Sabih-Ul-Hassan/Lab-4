/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opp_lab4_sp20.bse.pkg082_assignment1_runner;

/**
 *
 * @author hp
 */
public class Opp_lab4_sp20Bse082_assignment1_Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HotDogStand s1,s2,s3;
       s1=new HotDogStand(1,0) ;    
       s2=new HotDogStand(2,7) ;    
       s3=new HotDogStand(3,3) ;    
       System.out.println("Id:"+s1.getId()+". Sold: "+s1.getHotDogsSold());    
       System.out.println("Id:"+s2.getId()+". Sold: "+s2.getHotDogsSold());    
       System.out.println("Id:"+s3.getId()+". Sold: "+s3.getHotDogsSold());    
       s1.justSold();
       s1.justSold();
       s3.justSold();
       System.out.println("Id:"+s1.getId()+". Sold: "+s1.getHotDogsSold());    
       System.out.println("Id:"+s2.getId()+". Sold: "+s2.getHotDogsSold());    
       System.out.println("Id:"+s3.getId()+". Sold: "+s3.getHotDogsSold());    
       
       
       
    }
    
}
