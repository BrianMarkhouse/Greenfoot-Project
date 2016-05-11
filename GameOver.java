import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author Jim Hunter
 * @version (a version number or a date)
 */
public class GameOver extends Windows
{
    private int timer = 300;
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if (timer == 0)
       {
           World hs = new HighScores();
           Greenfoot.setWorld(hs);
       }
       else
       {
           timer--;
       }
    }    
}
