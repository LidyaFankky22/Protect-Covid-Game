import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 350, 1);
        Siap();
    }
    
    public void act(){
        if(Greenfoot.getRandomNumber(700)<2){
            addObject(new Hz2(), Greenfoot.getRandomNumber(300),10);
        }else if(Greenfoot.getRandomNumber(700)<2){
            addObject(new Hz3(), Greenfoot.getRandomNumber(300),10);
        }else if(Greenfoot.getRandomNumber(700)<2){
            addObject(new Hz4(), Greenfoot.getRandomNumber(300),10);
        }else if(Greenfoot.getRandomNumber(700)<2){
            addObject(new Masker(), Greenfoot.getRandomNumber(300),10);
        }else if(Greenfoot.getRandomNumber(700)<2){
            addObject(new Masker2(), Greenfoot.getRandomNumber(300),10);
        }else if(Greenfoot.getRandomNumber(700)<2){
            addObject(new Sabun(), Greenfoot.getRandomNumber(300),10);
        }else if(Greenfoot.getRandomNumber(700)<2){
            addObject(new Sabun2(), Greenfoot.getRandomNumber(300),10);
        }else if(Greenfoot.getRandomNumber(700)<2){
            addObject(new Tisu(), Greenfoot.getRandomNumber(300),10);
        }else if(Greenfoot.getRandomNumber(700)<2){
            addObject(new Virus4(), Greenfoot.getRandomNumber(300),10);
        }else if(Greenfoot.getRandomNumber(700)<2){
            addObject(new Virus5(), Greenfoot.getRandomNumber(300),10);
        }else if(Greenfoot.getRandomNumber(700)<2){
            addObject(new Virus6(), Greenfoot.getRandomNumber(300),10);
        }else if(Greenfoot.getRandomNumber(700)<2){
            addObject(new Virus7(), Greenfoot.getRandomNumber(300),10);
        }
    }
    
    private void Siap(){
        Orang orang3 = new Orang();
        addObject(orang3,229,265);
        Nyawa nyawa = new Nyawa();
        addObject(nyawa,766,58);
        removeObject(nyawa);
    }
}
