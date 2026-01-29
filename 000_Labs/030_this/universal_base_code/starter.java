/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf(randName(), (int)(Math.random()*7));
		PooleDwarf a = new PooleDwarf(randName(), (int)(Math.random()*7));
		PooleDwarf b = new PooleDwarf(randName(), (int)(Math.random()*7));
		PooleDwarf c = new PooleDwarf(randName(), (int)(Math.random()*7));
		PooleDwarf d = new PooleDwarf(randName(), (int)(Math.random()*7));
		PooleDwarf e = new PooleDwarf(randName(), (int)(Math.random()*7));
		PooleDwarf f = new PooleDwarf(randName(), (int)(Math.random()*7));
		int x = 0;
		String name = test.getName();
		String ah = a.getName();
		String bh = b.getName();
		String ch = c.getName();
		String dh = d.getName();
		String eh = e.getName();
		String fh = f.getName();
		
		if (name.equals(ah)){
			x = x+1;
		}
		if (name.equals(bh)){
			x = x+1;
		}
		if (name.equals(ch)){
			x = x+1;
		}
		if (name.equals(dh)){
			x = x+1;
		}
		if (name.equals(eh)){
			x = x+1;
		}
		if (name.equals(fh)){
			x = x+1;
		}
		if (x==1)
		System.out.println(name + " was the name with " + x + " match");
		else
		System.out.println(name + " was the name with " + x + " matches");
	}
}
