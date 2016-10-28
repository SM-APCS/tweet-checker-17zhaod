/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tweettester;

import java.util.Scanner;
import java.lang.Math; 
/**
 * @class  AP CSA
 * @author DARAN ZHAO
 */
public class TweetTester {

    /**
     * @param args the command line arguments
     * @param scan is the name of the keyboard
     * @param tweet is the name of the String that stores the user input
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        //initialize String
        String tweet;
        
        //ask user for String
        System.out.print("Enter your tweet : ");
		tweet = scan.nextLine();
		
		//return length and error if too long
		if(tweet.length()<=140) {
		    System.out.println("Your tweet is " + tweet.length() + " characters long.");
		    	
		}
		else {
			System.out.println("Your tweet is " + tweet.length() + " characters long. Sorry, that's too long!");
		}
    }
    
}
