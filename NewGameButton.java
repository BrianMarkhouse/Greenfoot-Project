import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NewGameButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewGameButton extends Buttons
{   
    public void StartGame(){
        World Stage1 = new Stage1();
        Greenfoot.setWorld(Stage1);
    }
    /**
     * Act - do whatever the NewGameButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)){
        StartGame();
        }
    }    
}
