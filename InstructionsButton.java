import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionsButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionsButton extends Buttons
{
    public void ShowInstructions(){
        World inst = new Instructions();
        Greenfoot.setWorld(inst);
    }
    /**
     * Act - do whatever the NewGameButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)){
        ShowInstructions();
        }
    }    
}
