package Weapone_Game;

public class User 
{
    public static void main(String[] args)
    {
        Game g=new Game();
        Weapon w=g.selectWeapon();
        w.use();    
    }
}
