import greenfoot.*;

/**
 * Write a description of class HighScores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HighScores extends World
{
    Actor back = new BackButton();
    /**
     * Constructor for objects of class HighScores.
     * 
     */
    public HighScores()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 900, 1); 
        addObject(new ScoreBoard(800, 600), getWidth() / 2, getHeight() / 2); 
        Actor back = new BackButton();
        addObject(back, 210, 830);
    }
}
