import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
     public void act(String start) 
    {
        if (Greenfoot.mouseMoved(this)) {
           
        } else if (Greenfoot.mouseMoved(null)) {
            
        }
        if (Greenfoot.mousePressed(this)) {
            getImage().scale((int)Math.round(getImage().getWidth()*0.9), (int)Math.round(getImage().getHeight()*0.9));
        }
        if (Greenfoot.mouseClicked(null) || Greenfoot.mouseDragEnded(null)) {
            
        }
        if (Greenfoot.mouseClicked(this)) {
            
            Greenfoot.delay(5); 
            if  (start.equalsIgnoreCase("start")) Greenfoot.setWorld(new Level1());

        }
    } 
}
