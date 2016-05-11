import greenfoot.*;

/**
 * The player's ship
 * 
 * @author Brian Markhouse
 * @version (a version number or a date)
 */
public class PlayerShip extends Actor
{
    private int speed = 13;
    private int shotTimer = 10;
    private int weaponLvl = 1;
    PShield shield = new PShield();
    private boolean shieldOn = true;
    
    public void levelWeaponUp()
    {
        if (weaponLvl < 3)
        {
            weaponLvl++;
        }
    }
    public void setShieldOn(boolean o)
    {
        shieldOn = o;
    }
    public void movement()
    {
        if(Greenfoot.isKeyDown("right")) 
        {
            move(speed);
            shield.move(speed);
        }
            turn(90);
            shield.turn(90);
        if(Greenfoot.isKeyDown("down")) 
        {
            move(speed);
            shield.move(speed);
        }
            turn(90);
            shield.turn(90);
        if(Greenfoot.isKeyDown("left"))
        {
            move(speed);
            shield.move(speed);
        }
            turn(90);
            shield.turn(90);
        if(Greenfoot.isKeyDown("up")) 
        {
            move(speed);
            shield.move(speed);
        }
            turn(90);
            shield.turn(90);
    }

    public void act() 
    {
        if (shieldOn == true)
        {
            getWorld().addObject(shield, getX()-20, getY() );
            shieldOn = false;
        }
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
                Greenfoot.playSound("shot5.wav");
                shotTimer = 10;
            }
            if (weaponLvl == 2)
            {
                PShot2 shot = new PShot2();
                getWorld().addObject(shot, getX(), getY() );
                Greenfoot.playSound("shot4.wav");
                shotTimer = 10;
            }
            else if (weaponLvl == 3)
            {
                PShot3 shot = new PShot3();
                getWorld().addObject(shot, getX(), getY() );
                Greenfoot.playSound("shot2.wav");
                shotTimer = 10;
            }
        }
        movement();
    }    
}
