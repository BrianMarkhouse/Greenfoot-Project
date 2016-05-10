import greenfoot.*;

/**
 * Write a description of class button here.
 * 
 * @author  Jim Hunter 
 * @version (a version number or a date)
 */
public class Stage1Button extends Buttons
{
    /**
     * Act - do whatever the button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)) {
            World stage1 = new Stage1();
            Greenfoot.setWorld(stage1);
           }    
        }
}
