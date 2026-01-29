/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Warrior[] war = new Warrior[100];
		Wizard[] wiz = new Wizard[100];
		
		int x = 0;
		int y = 0;
		
		wiz[x] = new Wizard();
		war[y] = new Warrior();
		
		while(true){
			wiz[x].attack(war[y]);
			
			if(war[y].isDead()){
				y++;
				war[y] = new Warrior();
			}
			if(y>=99){
				System.out.println("Wizards won with " + (100-x) + " left in the army.");
				break;
			}
			
			war[y].attack(wiz[x]);
			
			if(wiz[x].isDead()) {
				x++;
				wiz[x] = new Wizard();
			}
			if(x>=99){
				System.out.println("Warriors won with " + (100-y) + " left in the army.");
				break;
			}
			
			
		}

	}
}
