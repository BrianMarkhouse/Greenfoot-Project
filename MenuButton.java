import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuButton here.
 * 
 * @author Jim Hunter
 * @version (a version number or a date)
 */
public class MenuButton extends Buttons
{
    public void MainMenu(){
       World mm = new MainMenu();
       Greenfoot.setWorld(mm);
    }
    /**
     * Act - do whatever the BackButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
        MainMenu();
        }
    }    
}
