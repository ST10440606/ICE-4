/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ice4;
import java.util.Scanner;
/**
 *
 * @author omwas
 */
public class ICE4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       // ask user how many sales people would they prefer 
        System.out.println("please entre how many sales people would you like");
        int numSalesPeople = sc.nextInt();
        
        // this is an array to store the amount of sales 
        int[] sales = new int[numSalesPeople];
        
        //initialize variables
        double sum = 0;
        double maxOfsales = Integer.MAX_VALUE;
        double minOfsales = Integer.MIN_VALUE;
        double maxID = 0;
        double minID = 0;
        
        //sales amount 
        for(int i =0; i <numSalesPeople; i++){
            System.out.println("please entre the sales for the salesperson"+(i+1)+":");
            sales[i] = sc.nextInt();
            sum += sales[i];
        
            //maxOfsales
            if(sales[1]>maxOfsales){
            maxOfsales = sales[i];
            maxID = i;
            }
            
            //minOfsales
            if(sales[i]< minOfsales){
            minOfsales = sales[i];
            minID = i;
            }
        }
        
        //print the sales 
        for(int i =0; i < numSalesPeople; i++){
            System.out.println("Salesperson"+(i+1)+ " has:R"+ sales[i] +"as there sales amount");
       }
        // print avergave of sales 
        double average = (double)sum / numSalesPeople;
        System.out.println("The average sale is: ");
        
        // print max sales and salesperon ID
        System.out.println("SaleaPerson "+ (maxID +1) + "has the highest sales which is R" + maxOfsales);
        // min sales and salesperson ID
        System.out.println("SalesPerson"+ (minID +1) + "has the least amount of sales which is R"+ minOfsales);
        
        // threshold value 
        System.out.println(" please entre a value");
        double threshold = sc.nextDouble();
        
        // find a print threshold
        double count = 0;
        for(int i = 0; i< numSalesPeople; i++){
        if (sales[i]> threshold){
            System.out.println("SalesPerson"+ (i +1)+ "go's over R" + threshold+"with sales of R" + sales[i]);
           }
        }
       // print the number of people that when over the threshold amount
        System.out.println("the number of salespeople that passed the threshold are R"+threshold+ ":" + count);
       
        
    }
  
}
