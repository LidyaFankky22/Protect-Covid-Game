;import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends World
{

    /**
     * Constructor for objects of class Home.
     * 
     */
    public Home()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 350, 1); 
        GreenfootImage bg = new GreenfootImage("Home.png");
        bg.scale(getWidth(),getHeight());
        setBackground(bg);
        Greenfoot.playSound("selamat.mp3");
        Siap();
    }
    private void Siap(){
        
        Start start = new Start();
        addObject(start,480,270);
        start.setLocation(480,270);
        
    }
   
   
}
