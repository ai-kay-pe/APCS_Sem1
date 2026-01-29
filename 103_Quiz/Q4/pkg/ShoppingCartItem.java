package pkg;
import java.util.*;

public class ShoppingCartItem {
    
    private String itemName;
    private double itemCost;
    private int quantity;
    
    
    
    public ShoppingCartItem(){
        itemName = "Nothing";
        itemCost = 0;
        quantity = 0;
    }
    public ShoppingCartItem(String n, double c, int q){
        itemName = n;
        itemCost = c;
        quantity = q;
    }
    
    
    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    public void setItemCost(double itemCost){
        this.itemCost = itemCost;        
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public String getItemName(){
        return this.itemName;
    }
    public double getItemCost(){
        return this.itemCost;
    }
    public int getQuantity(){
        return this.quantity;
    }
    
    public double getTotalCost(){
        return itemCost*quantity;
    }
    
    
    
    public double getTotalWithTax(){
        return getTotalCost()*1.12;
    }
    
    
    public double quantityToCostCalculator(int q){
        return itemCost*q;
    }
    
    
    
    public void cartToString(){
        System.out.println("you have " + quantity + " of " + itemName + " for $" + itemCost + " each.");
    }
    
    
    public boolean compareItemCost(ShoppingCartItem i){
        return itemCost<i.getItemCost();
    }
    
    
    
    public ShoppingCartItem copyCart(){
        //return new ShoppingCartItem(getItemName(), getItemCost(), getQuantity());
        return this;
    }
}
