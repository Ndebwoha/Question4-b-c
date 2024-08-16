/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ndebwoha.oop_examination;

/**
 *
 * @author Ndebwoha
 */
public class BabyFeedingScheduler {
     public static void main(String[] args) {
        double porridge = 2.0; 
        double milk = 2.0; 
        double cupSize = 0.5; 
        int totalTime = 0;
        
        while (porridge > 0 || milk > 0) {
            if (porridge > 0) {
                porridge -= cupSize / 2;
                totalTime += 45;
            }
            if (milk > 0) {
                milk -= cupSize; 
                totalTime += 30; 
            }
        }
        
        System.out.println("Total time to finish both porridge and milk: " + totalTime + " minutes");
    }
    
}
