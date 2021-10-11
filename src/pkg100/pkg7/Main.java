/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100.pkg7;

/**
 *
 * @author pupil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        int seven;
        seven=7;
        for (int i=1000;i>=-5;i=i-seven){
                   Thread.sleep(350);
            System.out.println(i+"-7"+"="+i);
            if(i<0){
                System.out.println("You are dead!");
            }
        }
    }
    
}
