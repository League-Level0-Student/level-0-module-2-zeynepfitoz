package extra;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String input=JOptionPane.showInputDialog("Height in inches?");
	int Height= Integer.parseInt(input);
	if(Height>60){
	System.out.println("You are tall enough to ride the ride. Congrats!");
	
}
	else {
		System.out.println("Sorry you are not tall enough. You need to grow more first. Sorry LOSER!");
	}
}
}
