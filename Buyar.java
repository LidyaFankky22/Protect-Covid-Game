import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buyar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buyar extends World
{

    /**
     * Constructor for objects of class Buyar.
     * 
     */
    public Buyar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 350, 1); 
        GreenfootImage bg = new GreenfootImage("Buyar.png");
        bg.scale(getWidth(),getHeight());
        setBackground(bg);
        
        Siap();
    }
    
    private void Siap(){
        
        Back back = new Back();
        addObject(back,350,350);
        back.setLocation(300,150);
        
    }
}
