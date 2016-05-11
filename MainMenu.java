import greenfoot.*;

/**
 * Write a description of class menu here.
 * 
 * @author Jim Hunter
 * @version (a version number or a date)
 */
public class MainMenu extends World
{
    Actor back = new BackButton();
    Actor newGame = new NewGameButton();
    Actor highScores = new HighScoresButton();
    Actor instructions = new InstructionsButton();


    /**
     * Constructor for objects of class menu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 900, 1); 

        addObject(newGame, 600, 550);
        addObject(highScores, 600, 640);
        addObject(instructions, 600, 730);

        
    }
    
    
}
