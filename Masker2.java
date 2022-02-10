import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Masker2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Masker2 extends Actor
{
    public Masker2(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/9, image.getHeight()/9);
        setImage(image);
    }
    
    public void act(){
            setLocation(getX(), getY()+5);
            Ditangkap1();
        }
        
        public void Hilang(){
            if (isAtEdge()){
                getWorld().removeObject(this);
            }
        }
        
        public void Ditangkap1(){
            Actor musuh = getOneIntersectingObject(Orang.class);
            if(musuh != null){
                getWorld().removeObject(this);
                Score.score+=5;
                Greenfoot.playSound("beep-02.wav");
            }else if(isAtEdge()){
                getWorld().removeObject(this);
            }
        }
}
