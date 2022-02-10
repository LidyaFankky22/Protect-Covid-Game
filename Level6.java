import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level6 extends World
{

    /**
     * Constructor for objects of class Level6.
     * 
     */
    public Level6()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 350, 1); 
        GreenfootImage bg = new GreenfootImage("BG6.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
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
        Orang orang = new Orang();
        addObject(orang,229,290);
        Nyawa nyawa = new Nyawa();
        addObject(nyawa,740,49);
        removeObject(nyawa);
    } 
}
