import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Virus7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Virus7 extends Actor
{
    /**
     * Act - do whatever the Virus7 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Virus7() 
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/35, image.getHeight()/35);
        setImage(image);
    }    
    
    public void act(){
        setLocation(getX(), getY()+5);
        Kenavirus();
    }
    
    public void Hilang(){
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    
    public void Kenavirus(){
        Actor musuh = getOneIntersectingObject(Orang.class);
        if (musuh != null){
            getWorld().removeObject(this);
            Nyawaa.nyawa-=1;
            Greenfoot.playSound("Explosion+1.wav");
        }else if(isAtEdge()){
            getWorld().removeObject(this);
        }
        
        if(Nyawaa.nyawa==0){
            Greenfoot.setWorld(new Buyar());
            Score.score=0;
            Nyawaa.nyawa=5;
        }
    }
}
