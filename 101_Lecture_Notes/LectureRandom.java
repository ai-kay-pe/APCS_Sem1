/*
    Lecture note example - Random!!
*/

class LectureRandom{
    public static void main(String args[]) {
        double a = Math.random()*5; //1-5
        System.out.println(a);
        double b = Math.random()*20+15; //15-35
        System.out.println(b);
        double c = Math.random()*(15235-5234)+5234; //5234-15235
        System.out.println(c); 
        int ik =(int)(Math.random()*50+30);
        int pee =(int)(Math.random()*(140-90)+90);
        int ikp =(int)(Math.random()*(pee-ik)+ik);
        System.out.println("a number between 30-80: " + ik);
        System.out.println("another num between 90-140: " + pee);
        System.out.println("ok so a number between " + ik + " and " + pee + " issss:");
        System.out.println(ikp);
	}
}
