import greenfoot.*;

/**
 * Write a description of class PlayerShip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerShip extends Actor
{
    private int speed = 13;
    private int shotTimer = 10;
    private int weaponLvl = 1;
    public void levelWeaponUp()
    {
        if (weaponLvl < 3)
        {
            weaponLvl++;
        }
    }
    public void movement()
    {
        if(Greenfoot.isKeyDown("right")) move(speed);
            turn(90);
        if(Greenfoot.isKeyDown("down")) move(speed);
            turn(90);
        if(Greenfoot.isKeyDown("left")) move(speed);
            turn(90);
        if(Greenfoot.isKeyDown("up")) move(speed);
            turn(90);
    }
    /**
     * Act - do whatever the PlayerShip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (shotTimer > 0)
        {
            shotTimer--;
        }
        if (Greenfoot.isKeyDown("z") && shotTimer == 0)
        {
            if (weaponLvl == 1)
            {
                PShot1 shot = new PShot1();
                getWorld().addObject(shot, getX(), getY() );
                shotTimer = 10;
            }
            if (weaponLvl == 2)
            {
                PShot2 shot = new PShot2();
                getWorld().addObject(shot, getX(), getY() );
                shotTimer = 10;
            }
            else if (weaponLvl == 3)
            {
                PShot3 shot = new PShot3();
                getWorld().addObject(shot, getX(), getY() );
                shotTimer = 10;
            }
        }
        movement();
    }    
}
