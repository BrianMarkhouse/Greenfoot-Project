import greenfoot.*;

/**
 * Write a description of class PlayerShip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerShip extends Actor
{
    
            public void shoot (int targetX, int targetY)
    {
        Missile m = new Missile (targetX, targetY);
        getWorld().addObject (m, this.getX(), this.getY());
    }
    public void movement()
{
    if(Greenfoot.isKeyDown("right")) move(3);
    turn(90);
    if(Greenfoot.isKeyDown("down")) move(3);
    turn(90);
    if(Greenfoot.isKeyDown("left")) move(3);
    turn(90);
    if(Greenfoot.isKeyDown("up")) move(3);
    turn(90);
}
    /**
     * Act - do whatever the PlayerShip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("z")){
        this.shoot(1200, this.getY());
        }
        movement();
    }    
}
