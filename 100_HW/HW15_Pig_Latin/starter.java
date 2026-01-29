/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.*;
class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("say something.");
        String pig = sc.nextLine();  // original sentence
        int ian = -676767;   //end of word
        String park = "";    //word
        String asd = ""; //first letter of word
        while (pig.indexOf(" ")!=-1){
            ian = pig.indexOf(" ");     //finds end of word
            park = pig.substring(0,ian);    //makes park the word
            asd = park.substring(0,1);
            if(asd.equals("a")||asd.equals("e")||asd.equals("i")||asd.equals("o")||asd.equals("u"))
                System.out.print(park+"ay ");
            else
                System.out.print(park.substring(1)+"-"+asd+"ay ");
            pig = pig.substring(ian+1);
        }
        asd = pig.substring(0,1);
        if(asd.equals("a")||asd.equals("e")||asd.equals("i")||asd.equals("o")||asd.equals("u"))
            System.out.print(pig+"ay");
        else
            System.out.print(pig.substring(1)+"-"+asd+"ay");
    }
}
