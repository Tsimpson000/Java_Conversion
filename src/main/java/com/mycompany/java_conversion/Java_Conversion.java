/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_conversion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SHEEVZ
 */
public class Java_Conversion {

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<Player>();
        displayInfo();
        
        preload();
        
        Scanner scanner = new Scanner(System.in);
        
        int userChoice = scanner.nextInt();
        
        if(userChoice == 1)
            {
                for (int i = 0; i < players.size(); i++)
                {
                    System.out.println(players.get(i).toString());
                }
            }
            else if (userChoice == 2)
            {
                for (int i = 0; i < players.size(); i++)
                {
                    if (players.get(i)._number % 2 != 0)
                    {
                        System.out.println(players.get(i).toString());
                    }
                }
            }
            else if (userChoice == 3)
            {
                scanner.nextLine();
                System.out.println("Enter Letter: ");
                
                
                String userLetterInput = scanner.nextLine();
                for (int i = 0; i < players.size(); i++)
                {
                    if (players.get(i)._name.startsWith(userLetterInput))
                    {
                        System.out.println(players.get(i).toString());
                    }
                }
            }
            else if (userChoice == 4)
            {
                System.out.println("Enter Name: ");
                String newPlayerName = scanner.nextLine();
                
                System.out.println("Enter Number: ");
                int newPlayerNumber = scanner.nextInt();
                
                Player player = new Player(newPlayerName, newPlayerNumber);
                
                players.add(player);
                for (int i = 0; i < players.size(); i++)
                {
                    System.out.println(players.get(i).toString());
                }
            }
            else
            {
                System.out.println(userChoice + " was not a correct input.");;
            }
    }
    public static void displayInfo(){
            System.out.println("Players\n" + 
                "1 - Display Players\n" + 
                "2 - Display Pleyers with an odd letter\n" + 
                "3 - Display Players starting with letter\n" + 
                "4 - Add Player");
    }
    
    public static void preload(){
        Player player1 = new Player("Shiva", 45);
        Player player2 = new Player("Tyler", 30);
        Player player3 = new Player("Fluffy", 36);
        Player player4 = new Player("Odin", 100);
        Player player5 = new Player("Tinsil", 85);
        
        players.Add(player1);
        players.Add(player2);
        players.Add(player3);
        players.Add(player4);
        players.Add(player5);
        

    }
}
