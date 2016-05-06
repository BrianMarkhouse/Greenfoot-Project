import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Star extends Actor
{
    public int x, y, speed, radius;
    public Color color;
    /**
     * Act - do whatever the Star wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()    {
        
 
        
    }    
    
    public Star(int speed, Color color)
    {
      radius = 1 + Greenfoot.getRandomNumber(4);
      GreenfootImage image = new GreenfootImage (radius, radius);
      image.setColor (color);
      image.fillOval (0, 0, radius, radius); 
      setImage (image);
      this.speed=speed;
      
      x = Greenfoot.getRandomNumber(1200);
      y = Greenfoot.getRandomNumber(900);
    
   }

   public void move()
   {
       x = speed + x;
       setLocation(x + speed, y);
       if(x<1){
        x=1200;}
       
   }
   
}
