//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extra;

import javax.swing.JOptionPane;

/* NASA wants to shoot a rocket into orbit. 
  * Somebody has to do the countdown – or the rocket won’t launch.
 * 
 * The ground control chief will tell you where to start – then count down to 0. 
 * 
 * (example for ’11’: 11 10 9 8 7 6 5 4 3 2 1 0)
 * 
 **/

public class NasaCountdown {
	public static void main(String[] args) throws InterruptedException {
		// 2. Use a pop-up to ask the user where to start counting from
String  Ten=JOptionPane.showInputDialog("Where should I start the countdown from ten?");
		// 3. Change the countdown to use the new starting point
		
int x=Integer.parseInt(Ten);
		// 1. Print a countdown from 10 to 0 on the console
for(int i=10;i>=0;i--) {
	
	System.out.println(i);
	speak(""+i);
	Thread.sleep(1000);
}
		// 4. Use the speak method to hear the countdown.
	
		// 5. when the counting is done, speak "blastoff!"
speak("BLASTOOFFFFFFF DOGS ARE AMAZING*");
	}

static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }
}


