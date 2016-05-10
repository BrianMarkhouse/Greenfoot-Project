import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HighScoresButton here.
 * 
 * @author Jim Hunter 
 * @version (a version number or a date)
 */
public class HighScoresButton extends Buttons
{
    public void ShowScores(){
        World hs = new HighScores();
        Greenfoot.setWorld(hs);
    }
    /**
     * Act - do whatever the NewGameButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)){
        ShowScores();
        }
    }    
}
