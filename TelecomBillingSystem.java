/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ndebwoha.oop_examination;

/**
 *
 * @author Ndebwoha
 */
public class TelecomBillingSystem {
      public static void main(String[] args) {
        double initialLoad = 10000;
        double chargeRate = 0.10;
        int callRatePerSecond = 200; 
        int callDurationInSeconds = 5 * 60; // 5 minutes in seconds
    
        
        double loadCharge = initialLoad * chargeRate;
        double balanceAfterLoad = initialLoad - loadCharge;
        double callCost = callRatePerSecond * callDurationInSeconds;
        double finalBalance = balanceAfterLoad - callCost;
        
        System.out.println("The balance after loading UGX 10,000 and calling for 5 minutes is: UGX " + finalBalance);
    }
    
}
