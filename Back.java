import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Actor
{
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Back() 
    {
        // Add your action code here.
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/10, image.getHeight()/10);
        setImage(image);
       
    }    
     public void act() 
    {
        if (Greenfoot.mousePressed(this) )  
        {   
            Greenfoot.setWorld(new Level1());
            Nyawa.MyNyawa+=5;
        }
    }    
}
