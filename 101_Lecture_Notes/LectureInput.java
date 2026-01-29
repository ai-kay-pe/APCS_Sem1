/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in); 
        
        double price1 = 1500;
        double price2 = 15000;
        double price3 = 67696769;
        System.out.println("👰 Hi this is IKP RST 👰");
        System.out.println("🤾 This is what we got 🤾");
        System.out.println("1. 🌊 Beach Water - ₩" + price1);
        System.out.println("2. 🛀 Mystery Bath Water - ₩" + price2);
        System.out.println("3. 🥜 Nut. - ₩" + price3);
        
        
        System.out.println("Whats the name for your order?");
        String name = sc.nextLine();
        System.out.println();
        
        System.out.println("How may waters do you want?");
        int quantity1 = sc.nextInt();
        System.out.println("Great, how many bath waters do you wnat?");
        int quantity2 = sc.nextInt();
        System.out.println("Spectacular. Ok how much Nut(s). do you want");
        int quantity3 = sc.nextInt();
        System.out.println();
        
        double total1 = price1 * quantity1;
        double total2 = price2 * quantity2;
        double total3 = price3 * quantity3;
        double fulltotal = total1 + total2 + total3;
        System.out.println("Aight this the price rn: ₩" + fulltotal);
        
        System.out.println("PLEASE GIVE ME MONEY PLEASEEEEEEEE (what % you tryna tip me)");
        double tip = sc.nextDouble();
        double tippy = fulltotal * (tip/100);
        double FULLTOTAL = fulltotal + tippy;
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Aight this you recept, " + name + ":");
        System.out.println(quantity1 + " x Beach Water = ₩" + total1);
        System.out.println(quantity2 + " x Mystery Bath Water = ₩" + total2);
        System.out.println(quantity3 + " x Nut. = ₩" + total3);
        System.out.println("The tip (thank you) = ₩" + tippy);
        System.out.println("---------------------------------");
        System.out.println("Price = ₩" + FULLTOTAL);
        System.out.println("---------------------------------");
        System.out.println("ey if you dont know how much $ you spending here it is: $" + FULLTOTAL*0.00072);
        System.out.println("---------------------------------");
        System.out.println("aight bye");
    }
}