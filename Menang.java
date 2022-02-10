import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menang extends World
{

    /**
     * Constructor for objects of class Menang.
     * 
     */
    public Menang()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 350, 1); 
        GreenfootImage bg = new GreenfootImage("Menang.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        Greenfoot.playSound("applause8.wav");
        Score.score=0;
        
    }
}
