import greenfoot.*;

/**
 * Write a description of class Controls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends World
{

    /**
     * Constructor for objects of class Controls.
     * 
     */
    public Instructions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 900, 1); 
        Actor back = new BackButton();
        addObject(back, 210, 850);
    }
}
