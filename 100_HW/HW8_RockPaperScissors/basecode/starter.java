/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Whats up would you like to play the comp? (yes/no/done)");
            String ans = sc.nextLine().toLowerCase();
            System.out.println("---------------------------------------------------------------------");
            if(ans.equals("yes")){              //playing
            while(true){
                int pick = (int)(Math.random()*3); 
                int dnah = 67;
                System.out.println("enter rock paper or scissors");
                String hand = sc.nextLine();
                if (hand.equals("rock"))                //rock 0
                dnah = 0;
                else if (hand.equals("paper"))              //paper 1
                dnah = 1;
                else if (hand.equals("scissors"))               //scissor 2
                dnah = 2;
                else
                System.out.println("\ninvalid");
                if(dnah==pick){                  //tie
                System.out.println("you tied!");
                System.out.println("---------------------------------------------------------------------");
                break;
                }else if(dnah==0&&pick==2){                  //person rock>scissor
                System.out.println("you won!");
                System.out.println("---------------------------------------------------------------------");
                break;
                }else if(dnah==0&&pick==1){                   //person rock<paper
                System.out.println("you lost");
                System.out.println("---------------------------------------------------------------------");
                break;
                }else if(dnah==1&&pick==2){                   //person paper>rock
                System.out.println("you won!");
                System.out.println("---------------------------------------------------------------------");
                break;
                }else if(dnah==1&&pick==2){                   //person paper<scissor
                System.out.println("you lost");
                System.out.println("---------------------------------------------------------------------");
                break;
                }else if (dnah==2&&pick==1){                  //person scissor>paper
                System.out.println("you won!");
                System.out.println("---------------------------------------------------------------------");
                break;
                }else if (dnah==2&&pick==1){                 //person scissor<rock
                System.out.println("you lost");
                System.out.println("---------------------------------------------------------------------");
                break;
                }
            }
            }
            else if(ans.equals("no")){
            while(true){
                System.out.println("okay the comp will play itself how much do you want it to play?");
                int time = sc.nextInt();
                int stop = 0;
                while(stop<time){
                    int pick1 = (int)(Math.random()*3);
                    int pick2 = (int)(Math.random()*3);
                    int tie = 0;
                    int comp1 = 0;
                    int comp2 = 0;
                    if(pick1==pick2){             //tie
                    tie = tie+1;
                    }else if(pick1==0&&pick2==2){                  //rock>scissor
                    comp1 = comp1+1;
                    }else if(pick1==0&&pick2==1){                   //rock<paper
                    comp2 = comp2+1;
                    }else if(pick1==1&&pick2==2){                   //paper>rock
                    comp1 = comp1+1;
                    }else if(pick1==1&&pick2==2){                   //paper<scissor
                    comp2 = comp2+1;
                    }else if (pick1==2&&pick2==1){                  //scissor>paper
                    comp1 = comp1+1;
                    }else if (pick1==2&&pick2==1){                 //scissor<rock
                    comp2 = comp2+1;
                    }
                }
                System.out.println("okay the game against the computers are complete! here are the results:\n   Computer 1: " + comp1 + "\n Computer 2: " + comp2 + "\n Ties: " + tie);
                System.out.println("---------------------------------------------------------------------");
                break;
            }
            }
            else if(ans.equals("done")){
                System.out.println("\nokay bye");
                break;
            }
            else{
                System.out.println("invalid");
            }
        }
    }
}
