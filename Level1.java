import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World{
    
    public Level1()
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
        Orang orang = new Orang();
        addObject(orang,229,265);
        
        Hz2 hz2 = new Hz2();
        addObject(hz2,441,119);
        removeObject(hz2);
        
        Hz3 hz3 = new Hz3();
        addObject(hz3,336,87);
        
        Hz4 hz4 = new Hz4();
        addObject(hz4,382,59);
        
        Masker masker = new Masker();
        addObject(masker,593,252);
        masker.setLocation(427,128);
        
        Masker2 masker2 = new Masker2();
        addObject(masker2,490,161);
        
        Sabun sabun = new Sabun();
        addObject(sabun,600,158);
        
        Sabun2 sabun2 = new Sabun2();
        addObject(sabun2,450,109);
        
        Tisu tisu = new Tisu();
        addObject(tisu,500,252);
        tisu.setLocation(427,138);
        
        Virus4 virus4 = new Virus4();
        addObject(virus4,500,260);
        
        Virus5 virus5 = new Virus5();
        addObject(virus5,550,195);
        
        Virus6 virus6 = new Virus6();
        addObject(virus6,460,175);
        
        Virus7 virus7 = new Virus7();
        addObject(virus7,423,123);
        
        Nyawa nyawa = new Nyawa();
        //addObject(nyawa,360,120);
        nyawa.setLocation(300,120);
        removeObject(nyawa);
        
    }
}
