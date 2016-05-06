import greenfoot.*;

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{
    Actor button = new Stage1Button();
    /**
     * Constructor for objects of class menu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 900, 1); 

        addObject(button, 600, 450);
        
    }
    
    
}
