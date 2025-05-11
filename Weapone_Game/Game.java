package Weapone_Game;

import java.util.Scanner;

public class Game 
{
    Game()
    {
        System.out.println("=====Game Has Started=====");
    }
    @SuppressWarnings("resource")
	public Weapon selectWeapon()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Score:");
        int score=sc.nextInt();
        if (score<=400) 
        {
            System.out.println("You got the Knife");
            Knife k=new Knife();
            return k;
        }
        
        else if (score<=800) 
        {
            System.out.println("Press 1 for Knife and 2 for Gun");
            int choice=sc.nextInt();
            if (choice==1) 
            {
                System.out.println("You got Knife");
                return new Knife();    
            }   
            System.out.println("You got the Gun");
            return new Gun(); 
        }
        else
        {
            System.out.println("Press 1 for Knife and 2 for Gum and 3 for Bomb");
            int choice=sc.nextInt();
            if (choice==1) 
            {
                System.out.println("You got Knife");
                return new Knife();    
            }
            else if (choice==2)
            {
                System.out.println("You got Gum");
                return new Gun();    
            }
            System.out.println("You got Bumb");
            return new Bomb();
        }
    }
}